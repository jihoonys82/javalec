package thread_Chat1on1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_1on1 {

	//PORT
	private final int PORT = 10005;
	
	/**
	 * Initialization server
	 */
	public Server_1on1() {
		ServerSocket serv = null;
		
		try {
			serv = new ServerSocket(PORT);
			
			System.out.println("===Waiting for Client===");
			Socket sock = serv.accept();
			
			System.out.println("Client(" + sock.getInetAddress().getHostAddress() + ") is connected.");
			
			//--- Data Communication ---
			// Server -> Client 
			// Client -> Server 
			chat(sock);
			//--------------------------
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void chat(Socket sock) {
		// Sender thread
		new Sender_1on1(sock).start();
		// keyboard input -> sock output
		
		// Receiver thread
		new Receiver_1on1(sock).start();
		// sock input -> monitor output
	}
	
	public static void main(String[] args) {
		new Server_1on1();
		
	}
	
}
