package thread_ChatRoom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	public final String HOST = "localhost";
	public final int PORT = 9988;
	
	private String clientId ="";
	
	public Client() { 
		
		Socket sock = null;
		
		try {
			sock = new Socket(HOST, PORT);
			
			new Receiver(sock).start();
			new Sender(sock).start();
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public class Receiver extends Thread {
		
		private BufferedReader reader;
		private Socket sock;
		
		public Receiver(Socket sock) {
			this.sock = sock;
		}
		
		@Override
		public void run() {
			try {
				reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				
				String msg;
				while(true) {
					msg = reader.readLine();
					if(msg==null) {
						System.out.println("Disconnected!!");
						break;
					}
					System.out.println(msg);
					
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(reader!=null)reader.close();
					if(sock!=null) sock.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}// end of try catch
		}// end of run();
	}// end of Receiver Class 
	
	public class Sender extends Thread {
		
		private Socket sock = null;
		private BufferedReader reader = null;
		private PrintWriter writer = null;
		
		public Sender(Socket sock) {
			this.sock = sock;
		}// end of constructor
		
		@Override
		public void run() {
			reader = new BufferedReader(new InputStreamReader(System.in));
			
			try {
				writer = new PrintWriter(sock.getOutputStream(), true);
				
				while(clientId == "") {
					System.out.print("Please input your ID : ");
					clientId = reader.readLine();
					writer.println("CLIENT_ID_IS_" + clientId);					
				}
				while(true) {
					String msg = reader.readLine();
					if("/EXIT".equals(msg)) break;
					
					writer.println(msg);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if(writer!=null) writer.close();
				try {
					if(reader!=null) reader.close();
					if(sock!=null) sock.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} // end of try-catch 
		}// end of run()
	}//end of Sender class 
	
	public static void main(String[] args) {
		new Client();
	}
	
}
