package network_Socket;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex03_FileServer {
	public static void main(String[] args) {
		File file = new File("./src/network_Socket", "copiedData.txt");
		
		ServerSocket servSock = null; //server listen socket
		Socket sock = null; //server communication socket
		
		BufferedReader in = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		//FileWriter, BufferedWriter
		// BufferedWriter out = null;
		
		try {
			servSock = new ServerSocket(10101);
			System.out.println("+++ Server Socket Created +++");
			while(true) {			
				try {
					fos = new FileOutputStream(file, true);
					bos = new BufferedOutputStream(fos);
					//out = new BufferedWriter(new FileWriter(file));
					System.out.println("----Waiting for Client----");				
					System.out.println("Listen Port :" +servSock.getLocalPort());
					System.out.println("--------------------------");
					sock = servSock.accept();
					
					// ---- BLOCK ----
									
					System.out.println("Client Connected!");
					InetAddress ip = sock.getInetAddress();
					System.out.println("\t>>Client IP : " + ip.getHostAddress()); //IP
					System.out.println("\t>>Client Port : " + sock.getPort());
					
					in = new BufferedReader(
							new InputStreamReader(
									sock.getInputStream() ));
					
					String msg = null;
					int total = 0;
					while((msg = in.readLine())!= null) {
						bos.write(msg.getBytes());
//						System.out.println("[Test]length:"+msg.getBytes().length);// test ok 
						total += msg.getBytes().length;
					}
					bos.flush();
					
					System.out.println("File has beed transfered as "+file.getName() +". File size is " + total+" Bytes.");
					
				} catch (FileNotFoundException e) {
					System.out.println("[ERROR] Can't find file.");
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally { 
					try {
						if(sock!=null) sock.close();
						if(bos!=null) bos.close();
						if(fos!=null) fos.close();
					} catch (IOException e2) {
						System.out.println("[ERROR] error orruered when return resource.");
//						e2.printStackTrace();
					}
				} //end of inner try-catch 
			} // end of while 
		} catch (IOException e1) {
		
			e1.printStackTrace();
		} finally {
			try {
				if(servSock!=null) servSock.close();
			} catch (IOException e) {
				System.out.println("[ERROR] error orruered when return resource.");
//				e.printStackTrace();
			}
		}// end of outer try-catch 
	}
}
