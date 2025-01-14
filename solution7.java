import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try
        {
            Scanner scFile = new Scanner(System.in);
            int line1 = 0;
            int line2 = 0;
            
            while(scFile.hasNext())
            {
                line1 = scFile.nextInt();
                line2 = scFile.nextInt();
                
                if(line1<=0 || line2<=0)
                {
                    System.out.println("java.lang.Exception: Breadth and height must be positive");
                }
                else
                {
                    System.out.println(line1*line2);
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
