package thread_Basic;

import java.util.Random;

public class ThreadEx_03 extends Thread {
	
	private int idx; //thread index
	
	public ThreadEx_03(int i) { idx =i; }
	
	@Override
	public void run() {
		System.out.println(idx+" Start thread");
		
		Random ran = new Random();
		
		try {
			Thread.sleep(ran.nextInt(3000));
		} catch (InterruptedException e) {}
		
		System.out.println(idx+" End thread");
	}
	
	public static void main(String[] args) {
		System.out.println("Start Main thread");
		for(int i=0;i<10;i++) {
			new ThreadEx_03(i).start();
		}
		
		System.out.println("End Main thread");
	}
}
