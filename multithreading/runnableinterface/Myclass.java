package multithreading.runnableinterface;

public class Myclass implements Runnable{

	@Override
	public void run() {
		// here we write the thread logic 
		
		for( int i = 1; i <= 100 ; i++) {
			System.out.println("Run method : "+ i);
		}
		
	}
	
	// This is an example of an runnable interface
	
	// It is a functional interface 
	
	// this interface have only one abstract method that is run

	public void myMethodR() {
		
		for( int j = 201; j <= 300 ; j++) {
			System.out.println("Mymethod : "+ j);
		}
		
	}
	
	
}
