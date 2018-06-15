package stream_FileStream;

import java.io.File;

public class FileEx_02 {

	public static void main(String[] args) {
		
		// File class - for file information 
		
		//absolute path 
//		File file = new File("D:\\workspace\\JavaBasic\\src\\stream_FileStream\\Hello");
		//
		File file = new File("./src/stream_FileStream/Hello");
		System.out.println("toString() : " + file);
		System.out.println("length() : " + file.length());
		System.out.println("exist() : " + file.exists());
		
		System.out.println("===========");
		System.out.println("canRead() : " + file.canRead());
		System.out.println("canWrite() : " + file.canWrite());
		
		System.out.println("===========");
		System.out.println("isDirectory() : " + file.isDirectory());
		
		//escape character 
		String str1 = "\t"; // tab
		String str2 = "\b";	// backspace
		String str3 = "\r";	// carriage return
		String str4 = "\n"; // new line
//		String str5 = "\a"; // alarm (blocked in Java)
		
		System.out.println("100\\");
		
		
	}

}
