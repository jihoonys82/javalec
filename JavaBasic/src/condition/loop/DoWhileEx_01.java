package condition.loop;

public class DoWhileEx_01 {

	public static void main(String[] args) {
		
		// do - while loop
		//  a kind of while statement
		
		// do { 
		// 		code for Iteration
		// } while(termination);
		
		do { 
			System.out.println("printed?");
		} while(false);

		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while(i<5);
		
	}

}
