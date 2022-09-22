package Multithreading;

public class ProducerConsumer {
	
	private static final int MAX_QUEUE_CAPACITY = 10;

	public static void main (String [] args) throws InterruptedException {
		
		DataQueue dataQueue = new DataQueue(MAX_QUEUE_CAPACITY);
		Producer producer = new Producer(dataQueue);
		int producerCount = 5;
		for(int i = 0; i < producerCount; i++) {
		    Thread producerThread = new Thread(producer);
		    producerThread.start();
		}
		
		Consumer consumer = new Consumer(dataQueue);
		int consumerCount = 3;
		for(int i = 0; i < consumerCount; i++) {
		    Thread consumerThread = new Thread(consumer);
		    consumerThread.start();
		}
		
		producer.stop();
		consumer.stop();
		
	}

}
