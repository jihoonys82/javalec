package condition;

public class SwitchEx_03 {

	public static void main(String[] args) {
		
		char ch = 'q';
		switch(ch) { 
		case 'Q': // 'Q' is not same as 'q'
			System.out.println("uppercase Q");
			break;
		case 'q': // 'q' is ASCII code 113 
			System.out.println("lowcase q");
			break;
		case 'a':
			System.out.println("a");
			break;
		case 'B':
			System.out.println("B");
			break;		
		}
		// it is equivalent below 'if' statement
		if(ch == 'q') { 
			System.out.println("q");
		} else if (ch=='Q') {
			System.out.println("Q");
		} else if (ch=='a') {
			System.out.println("a");
		} else { 
			System.out.println("...");
		}
		
		//switch-case statement is more efficient then multi-if statement little bit. 
		//but it is recommand to use depend on readability. 
	}

}
