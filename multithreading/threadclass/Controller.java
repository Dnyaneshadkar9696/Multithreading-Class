package multithreading.threadclass;

public class Controller {
	
	public static void main(String[] args) {
		
		// This is main method for Thread class
		
		// there are two ways to achieve multithreading 
		// 1) using the Thread Class
		// 2) using the Runnable interface
		
		MyThread mt = new MyThread();
		mt.start(); // we call start method for the execution of the run method
		mt.myMethod(); // this is my method
		
		// server is the one of the example of multithreading as is process the multiple requests at a single time and provides the response to the multiple users.
		// The output clearly showcase the multithreading.
	}

}
