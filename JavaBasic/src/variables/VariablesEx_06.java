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
		pSex = '남';
		pHeight = 212.78;
		
		// 3. print result in console
		// ex)	이름 : Bob 
		//		나이 : 99
		//		성별 : Male
		//		키 : 212.78
		System.out.println("이름 : " + pName);
		System.out.println("나이 : " + pAge);
		System.out.println("성별 : " + pSex);
		System.out.println("키 : " + pHeight);
		
		System.out.println();
		
		//print method 
		System.out.print("이름 : " + pName + ", ");
		System.out.print("나이 : " + pAge + "\n");
		System.out.print("성별 : " + pSex + ", ");
		System.out.print("키 : " + pHeight + "\n");
		
		
	}

}
