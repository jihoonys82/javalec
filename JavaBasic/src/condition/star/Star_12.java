package condition.star;

public class Star_12 {
	public static void main(String[] args) {
		for(int i=0;i<9;i++) {
			if(i<4) {
				for(int j=0;j<i+1;j++) {
					System.out.print("*");
				}				
			} else { 
				for(int j=5;j>i-4;j--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
