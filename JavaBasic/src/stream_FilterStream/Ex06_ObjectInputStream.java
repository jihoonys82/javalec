package stream_FilterStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex06_ObjectInputStream {

	public static void main(String[] args) {
		
		File file = new File("./src/stream_FilterStream", "ObjectTest");
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			Point p1 = (Point)ois.readObject();
			System.out.println(p1.toString());
			
			System.out.println(ois.readObject());
			
			
		} catch  (FileNotFoundException e) { e.printStackTrace(); 
		} catch  		   (IOException e) { e.printStackTrace();
		} catch (ClassNotFoundException e) { e.printStackTrace();
		} finally {
			try {
				if(ois!=null)	ois.close();
				if(fis!=null)	fis.close();
			} catch (IOException e) { e.printStackTrace(); }
		}
				
		System.out.println("Program terminated successfully!");
	}

}
