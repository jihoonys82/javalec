package thread_Basic;

import java.util.Random;

public class ThreadEx_04_join extends Thread {
	
	private int idx; //thread index
	
	public ThreadEx_04_join(int i) { idx =i; }
	
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
		
		ThreadEx_04_join t1 = new ThreadEx_04_join(1);
		ThreadEx_04_join t2 = new ThreadEx_04_join(2);
		ThreadEx_04_join t3 = new ThreadEx_04_join(3);
		
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
