package Multithreading;

// Java program to illustrate Callable 
// for random number generation
import java.util.Random;
import java.util.concurrent.Callable;
  
class CallableExample implements Callable {
  
  public Object call() throws Exception
  {
    Random generator = new Random();
    Integer randomNumber = generator.nextInt(5);
  
    Thread.sleep(randomNumber * 1000);
  
    return randomNumber;
  }
  
}
  
public class CallableTest
{
  public static void main(String[] args) throws Exception
  {
  
    for (int i = 0; i < 5; i++)
    {
      Callable callable = new CallableExample();
  
      // As it implements Runnable, create Thread
      // with FutureTask
      //Thread t = new Thread(callable);
      System.out.println(callable.call());
    }
  }
}


