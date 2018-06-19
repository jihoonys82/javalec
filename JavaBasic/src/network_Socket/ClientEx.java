package network_Socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx {
	public static void main(String[] args) {
		Socket sock = null;
		PrintWriter out = null;
		
		try {
			System.out.println("++Client executed++");
			
			sock = new Socket("localhost", 9988);
			
			//make output stream
			out = new PrintWriter(sock.getOutputStream());
			
			// data output - transfer data to server
			out.println("Hello");
			
			// finish transfer (flush)
			out.flush();
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(out!=null) out.close();
				if(sock!=null) sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
