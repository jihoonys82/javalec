package condition.star;

public class Star_07 {
	public static void main(String[] args) {
		for(int i=5;i>0; i--) {
			for(int j=i; j<i+5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
