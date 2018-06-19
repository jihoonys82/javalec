package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Net03_URLConnection {

	public static void main(String[] args) {
		
		String urlStr = "https://www.oracle.com:443/downloads/index.html";
		
		URL url = null;
		URLConnection conn = null;
		
		BufferedReader reader = null; //input stream buffer
		
		char[] cbuf = new char[1024]; //char buffer for support input stream buffer
		int len = -1;
		
		try {
			url = new URL(urlStr);
			conn = url.openConnection();
			
			reader = new BufferedReader(
						new InputStreamReader(
							conn.getInputStream()));
			// conn -> InputStream
			// InputStream -> Reader
			// Reader -> BufferedReader
			while((len=reader.read(cbuf))!=-1) {
				System.out.println(new String(cbuf,0,len));
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		

	}

}
