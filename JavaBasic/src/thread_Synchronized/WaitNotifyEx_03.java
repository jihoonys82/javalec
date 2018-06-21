package thread_Synchronized;

class SyncData {
	int total;
	
	boolean available = false; // check the total value is filled
	// false - calculation is not finished yet. 
	// true - calculation is completed. 
}

class Input extends Thread {
	
	SyncData data;
	public Input (SyncData data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		System.out.println("---Input Start---");
		
		synchronized(data) { //Lock set.
			for(int i=1;i<=100;i++) {
				data.total += i;
			}
			data.available=true; // Calculation finished
			data.notifyAll(); // notify for Critical section job finished  
		}
		
		System.out.println("---Input End---");
	}
}

class Output extends Thread {
	SyncData data;
	
	public Output(SyncData data) { this.data = data; }

	@Override
	public void run() {
		System.out.println("---Output Start---");
		
		synchronized (data) { 
			try {
				while(data.available == false) {
					data.wait();					
				}
			} catch (InterruptedException e) {}
			System.out.println("total : " + data.total);
		}
		
		System.out.println("---Output End---");
	}
	
}

public class WaitNotifyEx_03 {
	public static void main(String[] args) {
		SyncData data = new SyncData();
//		Output o = new Output(data);
//		Input i =new Input(data);
//		
//		o.start();
//		i.start();
		new Output(data).start();
		new Input(data).start();
		
	}
}