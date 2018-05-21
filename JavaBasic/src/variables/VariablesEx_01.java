package variables;

public class VariablesEx_01 {
	//Variable : º¯¼ö 
	// - A space for save data.(memory space)
	// - (memory)Size is determined by data type. 
	// - container to store data.
	// - contain only one data at same time . 
	// - contained data can be changed.
	
	// Data type 
	//  - Primitive data type
	//		8 of primitive data type which are used in JAVA
	//  - Reference data type
	//  	all of data type except primitive data type. 
	
	// Primitive data type 
	//  - Integer type 
	//		byte  	1byte
	//		short 	2byte
	//		int 	4byte
	// 		long	8byte
	//  - Real number type 
	//		float	4byte
	//		double	8byte
	//  - logic type 
	//		boolean 1byte	true/false only
	//  - character type 
	//		char	2byte
	
	
	// Naming declaration convention 
	// Class : Start with Capital letter
	// variable : Start with non capital letter

	// Variable naming rule
	// alphabet (Uppercase lowercase)
	// number
	// Never start with number  
	// 	ex. int 1stNum; //x , int num1; //o
	// special character _ and & are only allowed.
	// keyword is prohibited  (ex. int int;)
	// Uppercase and lowercase is not same meaning, they are different each other.
	//   ex. int Num, NUM, num; // are all different variables. 
	
	// int my age; // wrong. no space in variable name
	// int my_age; // it is ok... however.. 
	// int myAge;  // it is recommended. 
	
	
	
	//main method - entry point of program.
	public static void main(String[] args) { 
		
		int num; // declare int type variable 
		// 4byte 
		// contain integer only
		
		num = 123; // num contain 123;
		
		System.out.println(num); // print num 
		
		System.out.println(num + 111); // print result for addition num and 111
		
		num = 55; // num changed to 55
		
		System.out.println(num);   // each line is separated by semicolon;
		
	}
	
}
