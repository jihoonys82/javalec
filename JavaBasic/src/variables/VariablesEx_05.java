package variables;

public class VariablesEx_05 {
	
	public static void main(String[] args) {
		
		//String
		// it is reference type variable. 
		// Class for strings (set of character)
		
		String name; //String variable declaration
		name = "Alice"; // value is wrapped by double quote "".
		System.out.println(name);
		System.out.println("name: " + name); // + means concatenate strings (same as "name: Alice")
		
		int age = 22; 
		System.out.println("age: " + age); // age(int type) is casted to string. 
		

		
		// ==========PRACTICE============
		String fruit; //fruit name
		int price; 	//fruit price 
		int num;	//number of fruits
				
		// favorite fruit
		fruit = "Grape";
		// set price
		price = 5000;
		// set number
		num = 3;
				
		//print result
		// ex) Grape, 5000��, 3��
		System.out.println(fruit + ", " + price + "��, " + num + "��");

//		System.out.print(fruit);
//		System.out.print(", ");
//		System.out.print(price);
//		System.out.print("��, ");
//		System.out.print(num);
//		System.out.print("��");
		
		
		
		
	}
}
