import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        //read in input from system
        Scanner n = new Scanner(System.in);
        int lines = 0;
        lines = n.nextInt();
        int arr[] = new int[lines];
        int temp, results = 0;
        //storing every int var into array var
        for(int i = 0; i<lines; i++)
        {
            arr[i] = n.nextInt();
        }
        //closing scanner input
        n.close();
        
        int count = 0;
        //checking every subarray
        for(int i = 0; i<lines; i++)
        {
            int sum = 0;
            for(int j = i; j<lines; j++)
            {
                sum += arr[j];
                if(sum<0)
                {
                    count++;
                }
            }
        }
        //printing
        System.out.println(count);
    }
}
