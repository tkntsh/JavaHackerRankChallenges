import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args)
    {
        //STD read in
        Scanner sc = new Scanner(System.in);
        //running while sc has next element
        while(sc.hasNext())
        {
            //try dangerous code
            try
            {
                int x = sc.nextInt();
                int y = sc.nextInt();
                //checking if int is divisible by 0 
                if(y == 0)
                {
                    throw new ArithmeticException("/ by zero");
                }
                //printing ints if no errors occur
                System.out.println(x / y);
            }
            //catch first exception
            catch(InputMismatchException e)
            {
                System.out.println(e.getMessage());
                sc.next();
            }
            //catch second exception
            catch(ArithmeticException e)
            {
                System.out.println("java.lang.ArithmeticException: " + e.getMessage());
            }
        }
        //close scanner
        sc.close();
    }
}
