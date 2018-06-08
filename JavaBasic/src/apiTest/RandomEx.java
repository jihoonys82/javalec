package apiTest;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		
		//control+shift+o => import automatically
		Random ran = new Random();
		System.out.println(ran.nextInt());
		System.out.println(ran.nextDouble());
		System.out.println(ran.nextBoolean());
		
		System.out.println("=================");
		System.out.println(ran.nextInt(10)); // 0~9
		System.out.println(ran.nextInt(10)+1); // 1~10
		System.out.println(ran.nextInt(5)+11); // 11~15
		
		System.out.println("=================");
		
		// 1~100 random number in int[5]
		int[] arr = new int[5];
		for(int i=0;i<5;i++) {
			arr[i] = ran.nextInt(100) + 1;
			//System.out.println(i+ ", " + arr[i]);
		}
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
	}
}
