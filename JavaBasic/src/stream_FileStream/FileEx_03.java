package stream_FileStream;

import java.io.File;

public class FileEx_03 {

	public static void main(String[] args) {
		
		// one parameter - path + file name 
		File file1 = new File("D:/Filetest.txt");
		
		// two parameter - path, file name
		File file2 = new File("D:/", "Filetest.txt");
		
		System.out.println(file1);
		
		System.out.println(file2);
		
		System.out.println("========");
		File file3 = new File("D:/test/ttt");
		
		//make last directory 
//		file3.mkdir();
		//make all directory if not exists 
		file3.mkdirs();
		
		
	}

}
