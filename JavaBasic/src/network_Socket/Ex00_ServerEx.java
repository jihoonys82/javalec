package network_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex00_ServerEx {
	public static void main(String[] args) {
		ServerSocket servSock = null; //server listen socket
		Socket sock = null; //server communication socket
		
		BufferedReader in = null;
		
		try {
			servSock = new ServerSocket(9988);
			System.out.println("++Server Socket created++");
			
			System.out.println("Listening...");
			sock = servSock.accept();
			
			// ---- BLOCK ----
			
			System.out.println("Client Accepted!");
			
			//make input stream
			in = new BufferedReader(
					new InputStreamReader(
							sock.getInputStream() ));
			String receive = in.readLine();
			System.out.println("\n\t>>Received data : " + receive);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(sock!=null) sock.close();
				if(servSock!=null) servSock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
