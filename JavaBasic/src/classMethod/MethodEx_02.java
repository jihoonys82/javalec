package classMethod;

import java.util.Scanner;

public class MethodEx_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Method_02 m02 = new Method_02();
		
		m02.print100();
		
		System.out.println("========");
		
		m02.printApple(inputNum(sc));
		
		System.out.println("========");
		
		m02.iterPrint(inputNum(sc), inputStr(sc));
		
		sc.close();
	}
	
	public static int inputNum(Scanner sc) { 
		int ret;
		System.out.print("Input number >> ");
		ret = sc.nextInt();
		sc.nextLine();
		return ret;
	}
	
	public static String inputStr(Scanner sc) { 
		String ret;
		System.out.print("Input string >> ");
		ret = sc.nextLine();
		return ret;
	}
}
