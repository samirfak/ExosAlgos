package Multithreading;

public class Message {
    private int id;
    private double data;

    // constructors and getter/setters
    public Message (int id, double data) {
    	this.id = id;
    	this.data = data;
    }
    
    public int getId() {
    	return this.id;
    }
    
    public double getData() {
    	return this.data;
    }
    
    public String toString() {
    	return this.getId() + ": " + this.getData() + "\n";
    }
}
