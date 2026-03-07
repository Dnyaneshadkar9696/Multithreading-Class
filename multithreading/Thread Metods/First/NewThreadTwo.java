package multithreading.threadclass;

public class NewThreadTwo extends Thread{

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Running Thread : "+ Thread.currentThread().getName());
		// It gives the running thread -4 which means the 5th thread is running by the JVM
		for(int d = 401; d <= 500; d++) {
			System.out.println("Another Thread : "+ d);
			Thread.yield();
		}
	}
	
}
