package multithreading.runnableinterface;

public class Myclass implements Runnable, AllMethods {

	@Override
	public void run() {
		// keep run focused only on the "run" work so it can execute concurrently
		for (int i = 1; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + " - Run method : " + i);
			try {
				Thread.sleep(40); // small sleep to allow visible the running of program
			} catch (InterruptedException e) {
				System.out.println("Run thread interrupted");
				Thread.currentThread().interrupt();
			}
		}
//		
//		this.ownMethod();
//		this.myMethodR();

	}

	// This is an example of an runnable interface

	// It is a functional interface

	// this interface have only one abstract method that is run

	public void myMethodR() {
		for (int j = 201; j <= 300; j++) {
			System.out.println(Thread.currentThread().getName() + " - Mymethod : " + j);
			try {
				Thread.sleep(30); // small sleep so outputs interleave
			} catch (InterruptedException e) {
				System.out.println("MyMethod thread interrupted");
				Thread.currentThread().interrupt();
			}
		}

	}

	@Override
	public void ownMethod() {
		for (int s = 44; s <= 202; s++) {
			System.out.println(Thread.currentThread().getName() + " - Own method : " + s);
			try {
				Thread.sleep(35); // small sleep for interleaving
			} catch (InterruptedException e) {
				System.out.println("OwnMethod thread interrupted");
				Thread.currentThread().interrupt();
			}
		}

	}

}

