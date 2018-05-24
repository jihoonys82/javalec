package condition.loop;

public class ForEx_03 {

	public static void main(String[] args) {
		
		for(int num =10; num>=1; num--) {
			System.out.println(num);
		}
		//number of iteration : 10
		//number range : 10 ~ 1 
		
		System.out.println("=============");
		
		for(int i=0; i<10; i+=2) {
			System.out.println(i);
		}
		//number of iteration : 5
		//number range: 0, 2, 4, 6, 8
	}

}
