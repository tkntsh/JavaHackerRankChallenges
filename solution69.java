import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            try
            {
                int x = sc.nextInt();
                int y = sc.nextInt();
                if(y == 0)
                {
                    throw new ArithmeticException("/ by zero");
                }
                System.out.println(x / y);
            }
            catch(InputMismatchException e)
            {
                // Changed from e.getMessage() to the full exception class name
                System.out.println("java.util.InputMismatchException");
                break; // Exit the loop since we can't continue with invalid input
            }
            catch(ArithmeticException e)
            {
                System.out.println("java.lang.ArithmeticException: " + e.getMessage());
            }
        }
        sc.close();
    }
}
