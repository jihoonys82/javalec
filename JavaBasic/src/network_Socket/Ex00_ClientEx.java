package network_Socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex00_ClientEx {
	public static void main(String[] args) {
		Socket sock = null;
		PrintWriter out = null;
		
		try {
			System.out.println("++Client executed++");
			
			sock = new Socket("localhost", 9988);
			
			//make output stream with AutoFlush
			out = new PrintWriter(sock.getOutputStream() , true);
			
			// data output - transfer data to server
			out.println("Hello");
			
			// finish transfer (flush)
//			out.flush(); // it is not needed if autoFlush option is true.
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			out.close(); // there is no IOExecption and dosen't need to close().
			try { 
				if(sock!=null) sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
