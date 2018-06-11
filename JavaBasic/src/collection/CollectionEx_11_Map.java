package collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;

public class CollectionEx_11_Map {
	
	public static void main(String[] args) {
		// Same as HashMap but Hashtable is synchronized. 
		Map map = new Hashtable();
		
		Properties prop = new Properties();
		try {
			prop.load(new FileReader("./src/collection/user.properties"));
			System.out.println(prop);
			
			System.out.println("==========");
			String user = prop.getProperty("username");
			System.out.println("User : " +  user);
			
			System.out.println("==========");
			prop.setProperty("username", "asdf");
			System.out.println(prop);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
