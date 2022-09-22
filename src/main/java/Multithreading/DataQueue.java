package Multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class DataQueue {
    private final Queue<Message> queue = new LinkedList<>();
    private final int maxSize;
    private final Object FULL_QUEUE = new Object();
    private final Object EMPTY_QUEUE = new Object();

    public DataQueue(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public boolean isEmpty() {
    	return queue.isEmpty();
    }

    // other methods
    public void waitOnFull() throws InterruptedException {
        synchronized (FULL_QUEUE) {
            FULL_QUEUE.wait();
        }
    }
    
    public void notifyAllForFull() {
        synchronized (FULL_QUEUE) {
            FULL_QUEUE.notifyAll();
        }
    }
    
    public void waitOnEmpty() throws InterruptedException {
        synchronized (EMPTY_QUEUE) {
            EMPTY_QUEUE.wait();
        }
    }
    
    public void notifyAllForEmpty() {
        synchronized (EMPTY_QUEUE) {
            EMPTY_QUEUE.notify();
        }
    }
    
    public void add(Message message) {
        synchronized (queue) {
            queue.add(message);
        }
    }
    
    public Message remove() {
        synchronized (queue) {
            return queue.poll();
        }
    }

	public boolean isFull() {
		// TODO Auto-generated method stub
		return queue.size() == maxSize;
	}
    
    
}