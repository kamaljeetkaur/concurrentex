
class MultiThreads implements Runnable{
	
	public void run() {
		System.out.println("In Thread " + Thread.currentThread().getName());
		Single sing = Single.getSingle();
		System.out.println("Singleton Object ====" + sing.hashCode());
		Resource res = sing.getResource();
		sing.create();
		sing.write("I am writing line 1. \n I am writing line 2 \n");
		System.out.println("Done Thread");
	}
	
}

public class CallSingleton {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
	/*  Single sing = Single.getSingle();
		Resource res = sing.getResource();
		res.createFile();
		res.writeFile("I am writing line 1. \n I am writing line 2 \n");
		System.out.println("Singleton Object ====" + sing.hashCode());*/
		
		MultiThreads ml = new MultiThreads();
		Thread t1 = new Thread(ml, "First");
		Thread t2 = new Thread(ml, "Second");
		Thread t3 = new Thread(ml, "Third");
		
		t1.start();
		t2.start();
		t3.start();
		
		//Single ref = Single.class.newInstance();
		
	}

}
