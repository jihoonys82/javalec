package condition.loop;

public class ForEx_06 {
	public static void main(String[] args) {
		
		//구구단 2단 
		// ex) 
		// 2 x 1 = 2
		// 2 x 2 = 4
		// ... 
		// 2 x 9 = 18
		
		//number of iteration : 9
		//number range: 1~9

		//initialiZation : int i = 1; 
		//termination : i<10;
		//increment : i++
		for(int i=1; i<10; i++) {
			System.out.println("2 x " + i + " = " + 2*i );
		}
		
	}
	
}
