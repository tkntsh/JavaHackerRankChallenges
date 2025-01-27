import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//class to handle arthmetic of integers
class Arithmetic
{
    //method to return an int of two sum variables
    public int add(int num1, int num2)
    {
        int sum = 0;
        //adding both preseted ints in parameters
        sum = num1 + num2;
        //returning answer
        return sum;
    }
}
//class that extends Arithmetic
class Adder extends Arithmetic
{
    
}

public class Solution
{
    public static void main(String []args)
    {
        //creating a new Adder object
        Adder a = new Adder();
        
        //printing the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
        
        //printing the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}
