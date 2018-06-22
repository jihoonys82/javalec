package thread_Chat1on1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Sender_1on1 extends Thread {
	
	private Socket sock; // communication socket
	
	// keyboard input -> BufferedReader
	private BufferedReader reader;
	
	//socket output -> PrintWriter
	private PrintWriter writer;
	
	public Sender_1on1() {}
	
	public Sender_1on1(Socket sock) {
		this.sock = sock;
		
	}
	
	@Override
	public void run() {
		// keyboard input -> socket output 
		
		// keyboard input object 
		reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			// Socket output object
			writer = new PrintWriter(sock.getOutputStream(), true);
			
			// -- Communication --
			while(true) {
				String msg = reader.readLine(); //keyboard input
				if("/EXIT".equals(msg))	break; // terminate communication
				
				writer.println(msg);
			}
			// -------------------
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally { 
			if(writer!=null)	 writer.close();
			try {
				if(reader!=null) reader.close();
				if(sock  !=null) sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
