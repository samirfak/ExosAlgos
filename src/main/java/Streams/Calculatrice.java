package Streams;

public class Calculatrice {
	
	// operation is implemented using lambda expressions
    interface FuncInter1
    {
        int operation(int a, int b);
    }
  
  
    // Performs FuncInter1's operation on 'a' and 'b'
    private int operate(int a, int b, FuncInter1 fobj)
    {
        return fobj.operation(a, b);
    }
  
    public static void main(String args[])
    {
        // lambda expression for addition for two parameters
        // data type for x and y is optional.
        // This expression implements 'FuncInter1' interface
        FuncInter1 add = (int x, int y) -> x + y;
  
        // lambda expression multiplication for two parameters
        // This expression also implements 'FuncInter1' interface
        FuncInter1 multiply = (int x, int y) -> x * y;
        
        // lambda expression multiplication for two parameters
        // This expression also implements 'FuncInter1' interface
        FuncInter1 minus = (int x, int y) -> x - y;

        // lambda expression multiplication for two parameters
        // This expression also implements 'FuncInter1' interface
        FuncInter1 division = (int x, int y) -> x / y;

        
        // Creating an object of Test to call operate using
        // different implementations using lambda Expressions
        Calculatrice tobj = new Calculatrice();
  
        // Add two numbers using lambda expression
        System.out.println("Addition is " +
                          tobj.operate(6, 3, add));
  
        // Multiply two numbers using lambda expression
        System.out.println("Multiplication is " +
                          tobj.operate(6, 3, multiply));
        
     // Minus two numbers using lambda expression
        System.out.println("Minus is " +
                          tobj.operate(6, 3, minus));
        
     // Division two numbers using lambda expression
        System.out.println("Division is " +
                          tobj.operate(6, 3, division));
  
        

    }

}
