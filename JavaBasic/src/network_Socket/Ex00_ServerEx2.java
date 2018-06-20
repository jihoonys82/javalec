package network_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex00_ServerEx2 {
	public static void main(String[] args) {
		ServerSocket servSock = null; //server listen socket
		Socket sock = null; //server communication socket
		
		BufferedReader in = null;
		
		try {
			servSock = new ServerSocket(9988);
			System.out.println("++Server Socket created++");
			
			System.out.println("Listen Port :" +servSock.getLocalPort());
			sock = servSock.accept();
			
			System.out.println("Client Connected!");
			InetAddress ip = sock.getInetAddress();
			System.out.println("\t>>Client IP : " + ip.getHostAddress()); //IP
			System.out.println("\t>>Client Port : " + sock.getPort());
			
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
				if(in!=null) 	in.close();
				if(sock!=null) 	sock.close();
				if(servSock!=null) servSock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
