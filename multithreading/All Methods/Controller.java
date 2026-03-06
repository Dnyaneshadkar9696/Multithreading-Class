package multithreading.runnableinterface;

public class Controller {
	
	public static void main(String[] args) {
		
		// Myclass is the cild of parent runnable interface
		
		// but here for achieving multithreading we need the start method which the Thread class has
		// so object creation of the thread class is also required here
		
		// firstly the child class
		Myclass md = new  Myclass();
		NewThread th = new NewThread();
		// This reference md we can pass to the Thread class
		Thread sd = new Thread(md);
		Thread sdd = new Thread(th);
		
		sd.start();  // the start method execute the run method
		try {
			sd.join();  // waits until the first thread is completed
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sdd.start();
		
		md.myMethodR();
		md.ownMethod();
		// this is where the multithreading happens.
//		now we can  see the multithreading 
		
	
		// Thread two
		
		
		
		
	
	}

}
