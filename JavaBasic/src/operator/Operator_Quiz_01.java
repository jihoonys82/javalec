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
	// avg : xx.xxxx
	
	// make 5 each variables
	// additional questuion
	// average score display likes xx.xx 
	
	public static void main(String[] args) {
		int kor, eng, mat, tot;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Koren score  : ");
		kor = sc.nextInt();
		sc.nextLine();
		
		System.out.print("English score : ");
		eng = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Math score : ");
		mat = sc.nextInt();
		sc.nextLine();
	
		sc.close();
		
		System.out.println("====Results====");
		tot = kor + eng + mat;
		avg = ((double)tot / 3);
		String strAvg = String.format("%.2f", avg);
					
		System.out.println("Kor : " + kor);
		System.out.println("Eng : " + eng);
		System.out.println("Mat : " + mat);
		System.out.println("Tot : " + tot);
		//System.out.println("Avg : " + strAvg);
		//System.out.println("Avg : " + new DecimalFormat("00.00").format(avg));
		System.out.format("Avg : %.2f", avg);
		
	}
	
	
}