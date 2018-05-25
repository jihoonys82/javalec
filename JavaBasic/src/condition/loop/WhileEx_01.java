package condition.loop;

public class WhileEx_01 {

	public static void main(String[] args) {
		
		// Loop, While
		
		// while(termination) {
		// 		execute when condition is true;
		// }
		
//		while(true) { //Infinity Loop
//			System.out.println("Hello");
//		}
		
		// for(initialization ; termination ; increment) { }
		
//		// initialization;
//		while (termination) {
//			// code
//			
//			// increment
//		}
	
		for(int i=0; i<10 ;i++) {
			System.out.println(i);
		}
		// it can be modify like below.. 
		
		int i=0;
		for( ; i<10 ; ) {
			System.out.println(i);
			i++;
		}
		
		// it is also same with below..
		int j=0;
		while(j<10) {
			System.out.println(i);
			j++;
		}
		
		
		
		
	}

}
