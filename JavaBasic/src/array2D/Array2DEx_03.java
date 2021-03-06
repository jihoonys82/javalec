package array2D;

import java.util.Scanner;

public class Array2DEx_03 {

	public static void main(String[] args) {

//		// year 1~3
//		// 2 class
//		// 4 students
//		// 3 subject score
//		int[][][][] score = new int[3][2][4][3];
//		// it is better to use like below due to complexity
//		int[][][] s1 = new int[2][4][3];
//		int[][][] s2 = new int[2][4][3];
//		int[][][] s3 = new int[2][4][3];
		
		// 2 student, 3 subject(kor, eng, math);
		int[][] sco = new int[2][3];
		
		int[] sum;
		double[] avg;
		
		sum = new int[2]; // when use "new", it initialize the space.
		avg = new double[2];
		
		String[] subject = {"Kor", "Eng", "Mat"};
		
		//1. input score
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("Input "+ subject[j] + " score for Student" + (i+1) + " >> ");
				sco[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		//1. total
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				sum[i] += sco[i][j];
			}
		}
		
		//2. avg
		for(int i=0;i<2;i++) {
			avg[i] = (double)sum[i] / 3.0;
		}
				
		//3. print 
		// ex) 	num	kor	eng	mat	tot	avg
		//		1	???	???	???	???	???
		System.out.println("num\tkor\teng\tmat\ttot\tavg"); 
		for(int i=0;i<2;i++) {
			System.out.print((i+1)+"\t"); //student number
			for(int j=0;j<3;j++) { 
				System.out.print(sco[i][j]+"\t"); //print each scores
			}
			System.out.print(sum[i]+"\t"); // print total
			System.out.printf("%.2f\n", avg[i]); //print average
		}
		
	}

}
