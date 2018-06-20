package thread_Basic;

class ThreadTest01 extends Thread { 
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("ThreadTest : " + i);
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {}
		}
	}
}

public class ThreadEx_01_classThread {
	public static void main(String[] args) {
		
		ThreadTest01 tt = new ThreadTest01();
		tt.start();//start thread. make new thread and it is not stop current thread.
//		tt.run(); //run thread. stop current thread until finish this thread.  
		
		ThreadTest01 tt2 = new ThreadTest01();
		ThreadTest01 tt3 = new ThreadTest01();
		ThreadTest01 tt4 = new ThreadTest01();
		tt2.start();
		tt3.start();
		tt4.start();
		
		for(int i=0;i<100;i++) {
			System.out.println("Main : " + i);
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {}
		}
	}
}
