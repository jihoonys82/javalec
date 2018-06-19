package stream_CharStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileCopy {

	public static void main(String[] args) {
		
		File dir = new File("./src/stream_CharStream/");
		File source = new File(dir,"Source.txt");
		File dest = new File(dir,"Dest.txt");
		// UUID inserted in the dest file for identify each execution of the program.
		
		Reader reader = null;
		BufferedReader br = null;
		Writer writer = null;
		BufferedWriter bw = null;
		
		char[] cbuf = new char[1024];
		
		int len = -1; 
		int total = 0; 
		
		try {
			reader = new FileReader(source);
			br = new BufferedReader(reader);
			writer = new FileWriter(dest);
			bw = new BufferedWriter(writer);
			
			while((len = br.read(cbuf))!= -1 ) {
				bw.write(cbuf, 0, len);
				total += len;
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] File not found!");
//			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] Input/Output has problem!");
//			e.printStackTrace();
		} finally {
			try {
				if(bw!=null) bw.close();
				if(writer!=null) writer.close();
				if(br!=null) br.close();
				if(reader!=null) reader.close();
				
			} catch (IOException e) {
				System.out.println("[ERROR] IO exception error : failed to close File Input/Output Stream");
//				e.printStackTrace();
			}
		}
		
		System.out.println("Copy complete!, " + total + " Bytes");
				
		

	}

}
