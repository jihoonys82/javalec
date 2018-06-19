package stream_CharStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class FileReaderEx {
	public static void main(String[] args) {
		File file = new File("./src/stream_CharStream","Source.txt");
		
		Reader reader = null;
		BufferedReader br = null;
		
		char[] cbuf = new char[1024];
		int len = -1;
		
		try {
			reader = new FileReader(file);
			br = new BufferedReader(reader); //reader& writer already have serializable. 
			while((len=br.read(cbuf))!= -1){
//				System.out.print(new String(cbuf, 0, len));
				
				System.out.print(cbuf);
				Arrays.fill(cbuf, '\0'); // '\0' means null.
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null)	br.close();
				if(reader!=null)	reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
