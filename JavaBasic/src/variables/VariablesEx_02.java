package variables;

public class VariablesEx_02 {

	public static void main(String[] args) {
		//char
		char ch;  //declaration char type variable
		ch = 'A'; // put 'A' value in ch variable.
		System.out.println(ch);
		
		char ch2 = '°¡';  // Initialization during declaration
		// char has 2byte. so It can be also used for Korean. 
		System.out.println(ch2);
		
		ch2 = 'ÇÏ'; // put in another value in ch2
		System.out.println(ch2);
		
		ch2 = 'B'; // put in value
		System.out.println(ch2);
		
		// ch2 = 'ab'; // it occurs error. char type can contain only one character wrapped by ''. 
		
		char ch3; // ch3 declaration without value; 
		//System.out.println(ch3); // error occured because there is no value(not initialized) in ch3 (red waved line means error!)
		//if error occurred, it is recommended to keep record for improvement my cording. 
		//yellow bulb means warning. it is executable and no error. 
		
		char ch4 = 65; // 65 is number but it is recognized to correspondent character 'A'.
		System.out.println(ch4);
		
	}
	
}
