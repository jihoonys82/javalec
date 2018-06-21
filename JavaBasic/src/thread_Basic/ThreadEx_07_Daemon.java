package thread_Basic;

class DaemonThreadTest implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(i +" Hi");
		}
	}
}

public class ThreadEx_07_Daemon {
	public static void main(String[] args) {
		System.out.println("---Main Start---");
		
		DaemonThreadTest dt = new DaemonThreadTest();
		Thread th = new Thread(dt);
		
		th.setDaemon(true); //Daemon enable
		th.start(); // thread is stopped when main is finished.
		
		System.out.println("---Main End---");
	}
}
