package network_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex02_EchoClient {
	public static void main(String[] args) {
		Socket sock = null;
		PrintWriter out = null; //socket print stream object
		BufferedReader in = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("++Client executed++");
			
			sock = new Socket("localhost", 10007);
			
			//make output stream with autoFlush = true
			out = new PrintWriter(sock.getOutputStream() , true);
			in = new BufferedReader( new InputStreamReader(sock.getInputStream()));
			
			// ---- Data communication ----
			
			String msg = null; // Message
			
			while(true) {	
				//receive msg for transfer. 
				System.out.print("\t Message for sending : ");
				msg = sc.nextLine();
				
				// send to server
				out.println(msg);		
				
				if("/EXIT".equals(msg)) break;
				
				if((msg=in.readLine())!= null) {
					System.out.println("\t Message from server >> " + msg);
				}
			} 
			
			System.out.println("+++Communication complete!+++");
			// ----------------------------
			
		} catch (UnknownHostException e) {
			System.out.println("[ERROR]Unknown host.");
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] Socket creation failed/Can't connect server");
			//e.printStackTrace();
		} finally {
			sc.close();
			out.close(); // there is no IOExecption and dosen't need to close().
			
			try { 
				if(sock!=null) sock.close();
			} catch (IOException e) {
				//e.printStackTrace();
				System.out.println("[ERROR] Can't release resource(s)");
			}
		}
	}
}
