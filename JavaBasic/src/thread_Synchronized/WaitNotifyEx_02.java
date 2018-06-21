package thread_Synchronized;

class SyncTest02 extends Thread {
	
	int total = 0;
	
	@Override
	public void run() {
		synchronized (this) {
			for(int i=1;i<=100;i++) {
				System.out.println(i+ " is added.");
				total +=i;
			}
			notify(); //notify for release LOCK
		}
	}
}

public class WaitNotifyEx_02 {
	public static void main(String[] args) {
		SyncTest02 st = new SyncTest02();
		
		st.start();
		
		synchronized(st) {
			try {
				st.wait(); // return LOCK. 
			} catch (InterruptedException e) {}
			
			System.out.println("total sum 1~100 : " + st.total);			
		}
		
	}
}