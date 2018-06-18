package stream_FilterStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex06_ObjectOuputStream {

	public static void main(String[] args) {
		
		File file = new File("./src/stream_FilterStream", "ObjectTest");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		
		
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			Point p1 = new Point(11,22);
			Point p2 = new Point(111,222);
			Point p3 = new Point(1111,2222);
			
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos!=null)	oos.close();
				if(fos!=null)	fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
				
		System.out.println("Program terminated successfully!");
	}

}
