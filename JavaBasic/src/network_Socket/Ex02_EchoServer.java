package network_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex02_EchoServer {
	public static void main(String[] args) {
		ServerSocket servSock = null; //server listen socket
		Socket sock = null; //server communication socket
		
		BufferedReader in = null;
		PrintWriter out = null;
		
		try {
			servSock = new ServerSocket(10007);
			System.out.println("+++ Server Socket Created +++");
			while(true) {
				try {
					System.out.println("----Waiting for Client----");				
					System.out.println("Listen Port :" +servSock.getLocalPort());
					System.out.println("--------------------------");
					
					sock = servSock.accept(); // listen.. 
					
					// ---- BLOCK ----
					
					System.out.println("Client Connected!");
					InetAddress ip = sock.getInetAddress();
					System.out.println("\t>>Client IP : " + ip.getHostAddress()); //IP
					System.out.println("\t>>Client Port : " + sock.getPort());
					
					//make input stream
					in = new BufferedReader(
							new InputStreamReader(
									sock.getInputStream() ));
					
					out = new PrintWriter(sock.getOutputStream(), true);
					// ---- Data communication ----
					
					String msg = null;
					
					// if there is end of stream, in.readLine() returns null (NOT -1) 
					while((msg = in.readLine()) != null ) {
						System.out.println("\tReceived Massage>>" + msg);
						
						if("/EXIT".equals(msg)) break; 
						
						out.println(msg);
					}
					System.out.println("Client disconnected");
					// ----------------------------
				} catch (IOException e) {
					System.out.println("Client disconnected");
					//e.printStackTrace();
				} finally {
					out.close();
					try {
						if(in!=null) 	in.close();
						if(sock!=null) 	sock.close();
					} catch (IOException e) {
						System.out.println("[ERROR] Can't release resource(s)");
						//e.printStackTrace();
					}
				} // end of try
			} // end of while

		} catch (IOException e) {
			System.out.println("Client disconnected");
//				e.printStackTrace();
		} finally {
			try {
				if(servSock!=null) servSock.close();
			} catch (IOException e) {
				System.out.println("[ERROR] Can't release resource(s)");
				//e.printStackTrace();
			}
		} // end of try (servSock) 
	}
}
