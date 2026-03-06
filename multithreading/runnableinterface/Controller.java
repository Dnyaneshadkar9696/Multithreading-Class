package multithreading.runnableinterface;

public class Controller {
	
	public static void main(String[] args) {
		
		// Myclass is the cild of parent runnable interface
		
		// but here for achieving multithreading we need the start method which the Thread class has
		// so object creation of the thread class is also required here
		
		// firstly the child class
		Myclass md = new  Myclass();
		// This reference md we can pass to the Thread class
		Thread sd = new Thread(md);
		sd.start();  // the start method execute the run method
		md.myMethodR();
//		now we can  see the multithreading 
		
	
	}

}
