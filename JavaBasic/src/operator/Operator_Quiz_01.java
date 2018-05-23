package operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Operator_Quiz_01 {

	// Korean, English, Math score scan
	// total score
	// average
	
	//print 
	// Kor : xxx
	// Eng : xxx 
	// Mat : xxx
	// tot : xxx
	// avg : xx.xxxxxxxxx
	
	// make 5 each variables
	// additional question
	// average score display likes xx.xx 
	
	public static void main(String[] args) {
		int kor; // Korean score
		int eng; // English score
		int mat; // Mathematics score
		int tot; // Total score
		double avg; // Average score
		
		// Input method : Scanner
		Scanner sc = new Scanner(System.in);
		
		// Input scores 
		System.out.print("Koren score  : ");
		kor = sc.nextInt();
		sc.nextLine();
		
		System.out.print("English score : ");
		eng = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Math score : ");
		mat = sc.nextInt();
		sc.nextLine();
	
		//TestCode - Input 3 subjects - TEST OK 
		//System.out.println("[Test]" + kor + ", " + eng + ", " + mat);
		
		//close Scanner instance
		sc.close();

		//Calculate total and average
		tot = kor + eng + mat;
		avg = ((double)tot / 3);
		
		//TestCode - calculate results - TEST OK 
		//System.out.println("[Test]" + tot + ", " + avg);
		

		System.out.println("====Results====");
		//String strAvg = String.format("%.2f", avg);
					
		System.out.println("Kor : " + kor);
		System.out.println("Eng : " + eng);
		System.out.println("Mat : " + mat);
		System.out.println("Tot : " + tot);
		//System.out.println("Avg : " + strAvg);
		//System.out.println("Avg : " + new DecimalFormat("00.00").format(avg));
		//System.out.println("Avg : " + Math.round( avg * 100 )/(double)100);
		//System.out.printf("Avg : %.2f", avg); 
		System.out.format("Avg : %.2f", avg);
		
		//System.out.printf - print formatted 
		// - format character : %s(string), %d(decimal), %c(char), %f(float) 
		
		System.out.println();
		
		//another method
//		System.out.println("original data :" + avg );
//		System.out.println("avg*100 : " + (avg*100) );
//		System.out.println("Math.round : " + Math.round(avg * 100) ); 
//		System.out.println("��� : "+ Math.round( avg * 100 )/(double)100 );
		
		
	}
	
	
}
