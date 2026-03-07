package multithreading.threadclass;

public class NewThread extends Thread{
	
	// This is the new thread class
	
	
	@Override
	public void run() {
		
		// Here we write the thread logic 
		
		// now we have to use the join method of the thread class
		// it stops the execution of one thread and runs another thread with similar priority
		
		for(int h = 1; h <= 100; h++) {
			System.out.println("Thread : " + h);
		}
		
		
	}
	

}
