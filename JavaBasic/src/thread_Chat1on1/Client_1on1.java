package thread_Chat1on1;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client_1on1 {
	
	private final String HOST = "localhost"; //server host
	private final int PORT = 10005;  //server port
	
	public Client_1on1() {
		
		Socket sock = null;
		
		try {
			sock = new Socket(HOST, PORT);
			
			//--- Data Communication ---
			// Server -> Client 
			// Client -> Server 
			chat(sock);
			//--------------------------
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
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
		new Client_1on1();
	}
	
	
}
