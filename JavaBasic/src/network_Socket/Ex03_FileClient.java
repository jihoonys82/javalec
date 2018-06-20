package network_Socket;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex03_FileClient {
	public static void main(String[] args) {
		File file = new File("./src/network_Socket","data.txt");
		Socket sock = null;
		PrintWriter out = null;
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		//BufferedReader in = null;
		
		byte[] buf = new byte[1024];
		//char[] cbuf = new char[1024];
		int len = -1;
		int total = 0;
		
		try {
			System.out.println("++Client executed++");
			sock = new Socket("localhost", 10101);
			
			//socket out stream
			out = new PrintWriter(sock.getOutputStream(), true);
			
			//file read stream
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			//in = new BUfferedReader(new FileReader(file));
			
			System.out.println(file.getName() + " is transmitting to server... ");
			
			while((len=fis.read(buf))!= -1) {
				out.println(new String(buf, 0, len));
				total +=len;
//				System.out.println("[Test]len :" +len + " , total: " + total); // test ok.
				out.flush();
				//out.write(cbuf, 0, len); 
			}
			
			System.out.println("File sending complete. Size is " + total + " Bytes." );
			
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] Can't find file.");
//			e.printStackTrace();
		} catch (UnknownHostException e) {
			System.out.println("[ERROR] Can't find host. ");
//			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { 
			try {
				if(bis!=null) bis.close();
				if(fis!=null) fis.close();
				if(out!=null) out.close();
				if(sock!=null) sock.close();
			} catch (IOException e) {
				System.out.println("[ERROR] error orruered when return resource.");
//				e.printStackTrace();
			}
		}
	}
	
	
	
	
}
