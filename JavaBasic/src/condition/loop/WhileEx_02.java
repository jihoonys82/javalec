package condition.loop;

public class WhileEx_02 {

	public static void main(String[] args) {
		
		//use while statement
		// Q1. print 0 ~ 9 
		// repeat : 10
		// range : 0 ~ 9
		
		// initialization  : i = 10;
		// termination : i<10;
		// increment : i++;
		
		int i= 0;
		while(i<10) {
			System.out.println(i);
			i++;
		}

		// Q2. print "Hello" 6 times
		i = 0;
		while(i<6) {
			System.out.println("Hello");
			i++;
		}

		// Q3. print 5 4 3 2 1 0
		// repeat : 6
		// range : 5 ~ 0
		
		// initialization  : i = 5;
		// termination : i>=0;
		// increment : i--;
		i = 5;
		while(i>=0) {
			System.out.print(i + " ");
			i--;
		}
	}

}
