package condition;

public class IfEx_01 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// if statement 
	
		// if(condition) 
		// executed when the condition is true(boolean).
		
		if(true) 
			System.out.println("Single line");
		//single line statement. it is NOT recommended.
		
		
		if(false) {
			System.out.println("test");
			System.out.println("is it printed?");
		}
		
		System.out.println("it is not belonging if statement.");
		
	}
}
