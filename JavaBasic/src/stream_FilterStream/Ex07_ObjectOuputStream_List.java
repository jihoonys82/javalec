package stream_FilterStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Ex07_ObjectOuputStream_List {

	public static void main(String[] args) {
		
		File file = new File("./src/stream_FilterStream", "ObjectTest");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		
		
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			List<Point> list = new ArrayList<>();
			
			list.add(new Point(11,22));
			list.add(new Point(111,222));
			list.add(new Point(1111,2222));
			
			oos.writeObject(list);
						
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
