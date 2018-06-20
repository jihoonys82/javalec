package network_Socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex01_SenderClient {
	public static void main(String[] args) {
		Socket sock = null;
		PrintWriter out = null; //socket print stream object
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("++Client executed++");
			
			sock = new Socket("localhost", 10007);
			
			//make output stream with autoFlush = true
			out = new PrintWriter(sock.getOutputStream() , true);
			
			// ---- Data communication ----
			
			String msg = null; // Message
			
			while(true) {
				//receive msg for transfer. 
				System.out.print("\t Message for sending : ");
				msg = sc.nextLine();
				
				if("/EXIT".equals(msg)) break;
				
				// send to server
				out.println(msg);
			}
			System.out.println("+++Communication complete!+++");
			// ----------------------------
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			out.close(); // there is no IOExecption and dosen't need to close().
			try { 
				if(sock!=null) sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
