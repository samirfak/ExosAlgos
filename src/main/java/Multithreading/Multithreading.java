package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class Multithreading {
	
	static AtomicInteger resource = new AtomicInteger(0);
	
	public static void main (String [] args) throws InterruptedException {
		
        Thread thread1 = new Thread(new Task1());
        Thread thread2 = new Thread(new Task1());
        Thread thread3 = new Thread(new Task1());
        
        thread1.start();
        thread2.start();
        thread3.start();
        
        thread1.join();
        thread2.join();
        thread3.join();
        
        System.out.println("Task result : " + resource);

        
	}
	
	static class Task1 implements Runnable {

	    @Override
	    public void run() {
	    	for(int i = 0; i < 30; i++) {
	    		resource.incrementAndGet();
	    	}
	    }
	 }
}

 
