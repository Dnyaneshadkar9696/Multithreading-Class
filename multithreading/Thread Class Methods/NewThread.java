package multithreading.runnableinterface;

public class NewThread implements Runnable {

	@Override
	public void run() {
		for(int j = 1; j <= 50 ; j++) {
			
			System.out.println("Hellow Dnyanesh..");
		}
		
	}

}
