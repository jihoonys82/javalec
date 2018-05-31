package classMethod;

import java.util.Scanner;

public class MethodEx_Quiz {
	public static void main(String[] args) {
	
		Method_Quiz m03 = new Method_Quiz();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("Input number 1 : ");
			m03.setNum1(sc.nextInt());
			
			System.out.print("Input number 2 : ");
			m03.setNum2(sc.nextInt());
			
			//sc.nextLine();
			sc.skip("\r\n");
			
			System.out.print("Input Operator(+, -, *, /) : ");
			m03.setOperator(sc.nextLine());
			
			//wrong input checker
			if(m03.getOperator() != '+' && 
					m03.getOperator() != '-' &&
					m03.getOperator() != '*' && 
					m03.getOperator() != '/') {
				System.out.println("Wrong Input!!");
				sc.close();
				break; // terminate while loop
				//return; // terminate method; 
			}
			
			switch(m03.getOperator()) {
			case '+' : 
				System.out.println("Result : " + m03.getNum1() + m03.getOperator() 
						+ m03.getNum2() + " = " 
						+ m03.sum(m03.getNum1(), m03.getNum2()));
				break;
			case '-' : 
				System.out.println("Result : " + m03.getNum1() + m03.getOperator() 
						+ m03.getNum2() + " = " 
						+ m03.sub(m03.getNum1(), m03.getNum2()));
				break;
			case '*' : 
				System.out.println("Result : " + m03.getNum1() + m03.getOperator() 
						+ m03.getNum2() + " = " 
						+ m03.mul(m03.getNum1(), m03.getNum2()));
				break;
			case '/' : 
				System.out.print("Result : " + m03.getNum1() + m03.getOperator()  
						+ m03.getNum2() + " = ");
				System.out.printf(".2%f", m03.div(m03.getNum1(), m03.getNum2()));
				System.out.println();
				break;
			} //end of switch-case
		}// end of while
		
	}
}
