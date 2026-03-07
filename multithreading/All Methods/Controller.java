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
		
		
		System.out.println();
		System.out.println("Below used the method yeild in one of the thread");
		// Lets deal with the new threads present
		
		NewThread nh = new NewThread();
		NewThreadTwo nht = new NewThreadTwo();
		
		Thread d = new Thread(nh);
		Thread d2 = new Thread(nht);
		
	     d.start();
	     
	     d2.start();
	     nht.setName("Worker Thread" );
	     // we set the Thread Name
	     System.out.println(nht.getName());// The name of the Thread Gets print
	     System.out.println(nht.isAlive()); // Checks wheater the thread is Alive Given answer False means the thread is running or not
	}

}
