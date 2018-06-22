package thread_Chat1on1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Receiver_1on1 extends Thread {

	private Socket sock;
	
	//socket input -> BufferedReader
	private BufferedReader reader;
	
	//monitor output -> PrintWriter
	private PrintWriter writer;
	
	public Receiver_1on1() {}
	
	public Receiver_1on1(Socket sock) {
		this.sock = sock;
	}
	
	@Override
	public void run() {
		// receive socket input and printer in monitor(console)
		
		// monitor print stream object
		writer = new PrintWriter(System.out, true);
		
		try {
			// socket input stream object
			reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			
			// -- Communication --
			while(true) {
				String msg = reader.readLine();
				
				//msg value null means socket has been closed.
				if(msg==null) {
					System.out.println("Disconnected!");
					break;
				}
				writer.println("Received message : " + msg);
			}
			// -------------------
			
		} catch (IOException e) {
			System.out.println("Disconnected");
//			e.printStackTrace();
		} finally {
			if(writer!=null) 	 writer.close();
			try {
				if(reader!=null) reader.close();
				if(sock  !=null) sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
}
