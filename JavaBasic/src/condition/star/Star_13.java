package condition.star;

public class Star_13 {
	public static void main(String[] args) {
		for(int i=0;i<9;i++) {
			if(i<4) {
				for(int j=5;j>i;j--) {
					System.out.print("*");
				}				
			} else { 
				for(int j=4;j<i+1;j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
