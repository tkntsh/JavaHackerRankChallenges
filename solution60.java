import java.io.*;
import java.util.*;

public class Solution 
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        //checking if N is even
        if(N % 2 == 0)
        {
            //checking if N is in range 2 to 5 (inclusive)
            if(N >= 2 && N <= 5)
            {
                System.out.println("Not Weird");
            }
            //checking if N is in range 6 to 20 (inclusive)
            else if(N >= 6 && N <= 20)
            {
                System.out.println("Weird");
            }
            //checking if N is greater than 20
            else if(N > 20)
            {
                System.out.println("Not Weird");
            }
        }
        //N is odd
        else
        {
            System.out.println("Weird");
        }
        //close scanner
        scanner.close();
    }
}
