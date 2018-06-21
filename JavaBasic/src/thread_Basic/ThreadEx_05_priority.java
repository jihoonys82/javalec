package thread_Basic;

import java.util.Random;

public class ThreadEx_05_priority extends Thread {
	
	private int idx; //thread index
	
	public ThreadEx_05_priority(int i) { idx =i; }
	
	@Override
	public void run() {
		System.out.println(idx+" Start thread");
		
		for(int i=0;i<100;i++) {
			System.out.print(idx);
		}
		System.out.println(idx+" End thread");
		
	}
	
	public static void main(String[] args) {
		System.out.println("Start Main thread");
		
		ThreadEx_05_priority t1 = new ThreadEx_05_priority(1);
		ThreadEx_05_priority t2 = new ThreadEx_05_priority(2);
		ThreadEx_05_priority t3 = new ThreadEx_05_priority(3);
		
		t1.setPriority(1); //Thread.MIN_PRIORITY = 1;
		t2.setPriority(5); //Thread.NORM_PRIORITY = 5;
		t3.setPriority(10); //Thread.MAX_PRIORITY = 10;
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			// join() : wait for other threads to be finished. In this case, main method waits t1, t2, and t3. 
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End Main thread");
	}
}
