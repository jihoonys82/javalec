package stream_FilterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Ex08_ObjectOutputStream {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		File file = new File("./src/stream_FilterStream", "ObjectTest");
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			List list = new ArrayList();
			
			list.add(new Point(11,22));
			list.add(new Person("Alice",23));
			list.add(new Point(111,222));
			list.add(new Person("Bob",43));
			list.add(new Point(1111,2222));
			list.add(new Person("Claire",35));
			list.add(new Person("Dave",47));
			
			oos.writeObject(list);
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos!=null)	oos.close();
				if(bos!=null)	bos.close();
				if(fos!=null)	fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
				
		System.out.println("Program terminated successfully!");

	}

}
