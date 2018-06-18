package stream_FilterStream;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex05_DataInputStream {

	public static void main(String[] args) {
		
		File file = new File("./src/stream_FilterStream","DataTest");
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			
			int resInt = dis.readInt();
			boolean resBoolean = dis.readBoolean();
			char resChar = dis.readChar();
			
			System.out.println("int : " + resInt);
			System.out.println("boolean : " + resBoolean);
			System.out.println("char : " + resChar);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { 
			try {
				if(dis!=null)	dis.close();
				if(fis!=null)	fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
