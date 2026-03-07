package multithreading.threadclass;

public class MyThread extends Thread{
	
	// This is our own thread we can extend the properties of the thread class
	// using the inheritance
	
	// In Thread class we have run and start method 
	@Override
	public void run() {
		
		// In the run method we write the thread logic 
		// override from the Thread class which implements the runnable interface
		for(int i = 1; i <= 200 ; i++) {
			System.out.println("This is Run method: "+i);
			
			// we are taking the long loop to show case the threading 
			
		}
	}
	
	public void myMethod() {
		// This is my method of MyThread class
		
		for( int j= 101; j <= 300; j++) {
			System.out.println("This is my method: "+j);
		}
		// When it runs in mix up so that is multithreading
		
		// The process of executing multiple threads simultaneously or at a same time is called as multithreading
		
		
		
		
		
		
	}

}
