package thread_Basic;

class DaemonThreadTest2 implements Runnable {
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000); //sleep 1 second
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			System.out.println("Auto save");
		}
	}
}

public class ThreadEx_08_Daemon {
	public static void main(String[] args) {
		System.out.println("---Main Start---");
		
		Thread th = new Thread(new DaemonThreadTest2());
		
		th.setDaemon(true);
		
		th.start();
		
		try {
			Thread.sleep(10000); // give enough time for the daemon object.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("---Main End---");
	}
}
