import java.util.*;
import java.io.*;

class Solution
{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int i = 0; i<t; i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            //print series for query
            long sum = a;
            String output = "";
            
            for(int j = 0; j<n; j++)
            {
                //add next term
                sum += (long)(Math.pow(2, j) * b);
                output += sum;
                
                if(j < n-1)
                {
                    //add space after numbers except after last
                    output += " ";
                }
            }
            //printing complete line at once
            System.out.println(output);
        }
        
        in.close();
    }
}
