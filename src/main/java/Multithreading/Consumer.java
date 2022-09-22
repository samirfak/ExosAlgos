package Multithreading;

public class Consumer implements Runnable {
    private final DataQueue dataQueue;
    private volatile boolean runFlag;

    public Consumer(DataQueue dataQueue) {
        this.dataQueue = dataQueue;
        runFlag = true;
    }

    @Override
    public void run() {
        consume();
    }

    // Other methods
    public void consume() {
        while (runFlag) {
            Message message;
            if (dataQueue.isEmpty()) {
                try {
                	System.out.println("Consumer wait");
                    dataQueue.waitOnEmpty();
                } catch (InterruptedException e) {
                    break;
                }
            }
            if (!runFlag) {
                break;
            }
            message = dataQueue.remove();
            //System.out.println("Consume " + message.toString());
            dataQueue.notifyAllForFull();
            useMessage(message);
        }
    }
    
    private void useMessage(Message message) {
		// TODO Auto-generated method stub
		System.out.println("Consume " + message.toString());
	}

	public void stop() {
        runFlag = false;
        dataQueue.notifyAllForEmpty();
    }
}
