package classMethod;

import java.util.Scanner;

public class MethodEx_03_Quiz {
	public static void main(String[] args) {
	
		Method_03_Quiz m03 = new Method_03_Quiz();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input number 1 : ");
		m03.setNum1(sc.nextInt());
		
		System.out.print("Input number 2 : ");
		m03.setNum2(sc.nextInt());
		
		sc.nextLine();
		
		System.out.print("Input Operator(+, -, *, /) : ");
		m03.setOperator(sc.nextLine());
	
		sc.close();

		switch(m03.getOperator()) {
		case '+' : 
			System.out.println(m03.getNum1() + " + " 
					+ m03.getNum2() + " = " 
					+ m03.sum(m03.getNum1(), m03.getNum2()));
			break;
		case '-' : 
			System.out.println(m03.getNum1() + " - " 
					+ m03.getNum2() + " = " 
					+ m03.sub(m03.getNum1(), m03.getNum2()));
			break;
		case '*' : 
			System.out.println(m03.getNum1() + " * " 
					+ m03.getNum2() + " = " 
					+ m03.mul(m03.getNum1(), m03.getNum2()));
			break;
		case '/' : 
			System.out.println(m03.getNum1() + " / " 
					+ m03.getNum2() + " = " 
					+ m03.div(m03.getNum1(), m03.getNum2()));
			break;
		default:
			System.out.println("Wrong Input!!");
		} //end of switch-case	
	}
}
