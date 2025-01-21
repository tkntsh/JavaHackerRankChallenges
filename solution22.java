import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
	      //reading in 
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //creating array to store number of ints
        int[] a = new int[n];
        //for loop running n number of times
        for(int i = 0; i < n; i++)
        {
            a[i] = scan.nextInt();
        }
        //close scanner
        scan.close();

        //printing each sequential element in array a
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}
