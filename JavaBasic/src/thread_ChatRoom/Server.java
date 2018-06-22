package thread_ChatRoom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Server {

	private final int PORT = 9988; 
	
	Map<String, PrintWriter> clientList; 
	
	public Server() {
		ServerSocket serv = null;
		
		clientList = new HashMap<>();
		
		try {
			serv = new ServerSocket(PORT);
			
			System.out.println("===Waiting for Client===");
			
			while(true) {
			
				Socket sock = serv.accept();
				System.out.println("Client(" + sock.getInetAddress().getHostAddress() + ") is connected.");
				
				ClientManager manager = new ClientManager(sock);
				manager.start();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(serv!=null) serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
	
	public class ClientManager extends Thread {

		private BufferedReader reader = null; 
		private Socket sock = null;
		private String clientId = null; 
		
		//constructor
		public ClientManager(Socket sock) {
			this.sock = sock;
		}
		
		
		@Override
		public void run() {
			//writer = new PrintWriter()
			try {
				reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				String msg = null;
				
				while(true) {
					msg = reader.readLine();
					System.out.println(clientId + ">>" + msg);
					//CASE1 : message == null, logout  
					if(msg==null) {
						System.out.println(clientId + " is Logged Out");
						for(Map.Entry<String, PrintWriter> entry : clientList.entrySet()) {
							if(entry.getKey()!=clientId) {
								entry.getValue().println(clientId+ " is logged out.");
								entry.getValue().flush();
							}
						}
						clientList.remove(clientId);
						break;
					}
					
					//CASE2: Login
					String[] pharse = msg.split("_ID_IS_");
					if(pharse.length==2) {
						clientId = pharse[1];
						clientList.put(clientId, new PrintWriter(sock.getOutputStream()));
						System.out.println(clientId + " is logged in.");
						for(Map.Entry<String, PrintWriter> entry : clientList.entrySet()) {
							if(clientId!=entry.getKey()) {
								entry.getValue().println(entry.getKey()+ " is entered.");
								entry.getValue().flush();
							}
							
						}
						continue;
					}
					
					//CASE3: send received message
					for(Map.Entry<String, PrintWriter> entry : clientList.entrySet()) {
						if(entry.getKey()!=clientId) {
							entry.getValue().println(clientId+ ">> " + msg);
							entry.getValue().flush();
						}
					}	
					
				}	
			} catch (IOException e) {
				e.printStackTrace();
			} finally { 
				try {
					if(reader!=null) reader.close();
					if(sock!=null) sock.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} // end of try-catch
		}// end of run()
	} // end of ClientManage Class

	
	public static void main(String[] args) {
		new Server();
		
	}
	
	
}
