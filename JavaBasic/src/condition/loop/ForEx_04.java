package condition.loop;

public class ForEx_04 {

	public static void main(String[] args) {
		// Sum 1 to 10 
		
		//number of iteration : 10
		//number range: 1 ~ 10
		
		//initialiZation : int i = 1;
		//termination :  i<=10;
		//increment : i++
		
		//iteration code : total += i;
		
		int total = 0; 
		for(int i=1; i<=10; i++) {
			total += i;
		}
		System.out.println(total);
	}

}
