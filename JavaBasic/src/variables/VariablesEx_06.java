package variables;

public class VariablesEx_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Quiz
		 * Make variables about Personal information for artificial person and print the results
		 */
		
		// 1. personal info variable
		// pName, pAge, pSex, pHeight
		String pName;
		int pAge;
		char pSex;
		double pHeight; 
		
		// 2. put proper values in each variables.
		pName = "Bob";
		pAge = 99;
		pSex = '��';
		pHeight = 212.78;
		
		// 3. print result in console
		// ex)	�̸� : Bob 
		//		���� : 99
		//		���� : Male
		//		Ű : 212.78
		System.out.println("�̸� : " + pName);
		System.out.println("���� : " + pAge);
		System.out.println("���� : " + pSex);
		System.out.println("Ű : " + pHeight);
		
		System.out.println();
		
		//print method 
		System.out.print("�̸� : " + pName + ", ");
		System.out.print("���� : " + pAge + "\n");
		System.out.print("���� : " + pSex + ", ");
		System.out.print("Ű : " + pHeight + "\n");
		
		
	}

}
