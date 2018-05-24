package condition.loop;

public class ForEx_09 {
	public static void main(String[] args) {
		//multiple for statement
		//구구단 출력 
		for(int dan=2; dan<=9; dan++) {
			for(int i=1; i<=9; i++) {
				System.out.println(dan + " x " + i + " = " + dan*i);
			}
			System.out.println("==========");
		}
	}
}
