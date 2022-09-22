package Multithreading;

import java.util.Random;

public class Producer implements Runnable {
    private final DataQueue dataQueue;
    private volatile boolean runFlag;

    public Producer(DataQueue dataQueue) {
        this.dataQueue = dataQueue;
        runFlag = true;
    }

    @Override
    public void run() {
        produce();
    }
    
    public Message generateMessage() {
    	return new Message(new Random().nextInt(5), new Random().nextDouble(5));
    }
    
    // Other methods
    public void produce() {
        while (runFlag) {
            Message message = generateMessage();
            while (dataQueue.isFull()) {
                try {
                	System.out.println("Wait");
                    dataQueue.waitOnFull();
                } catch (InterruptedException e) {
                    break;
                }
            }
            if (!runFlag) {
                break;
            }
            System.out.println("Add " + message.toString());
            dataQueue.add(message);
            dataQueue.notifyAllForEmpty();
        }
    }
    
    public void stop() {
        runFlag = false;
        dataQueue.notifyAllForFull();
    }
}
