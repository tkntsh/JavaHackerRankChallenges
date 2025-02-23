import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{
  public static void main(String[] args) 
  {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) 
        {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        //creating HashSet to track unique pairs
        HashSet<String> uniquePairs = new HashSet<String>();
        
        //process pairs and print count of unique pairs
        for(int i = 0; i < t; i++)
        {
            //combining the pair with a space separator
            String currentPair = pair_left[i] + " " + pair_right[i];
            //adding to set
            uniquePairs.add(currentPair);
            //printing current count of unique pairs
            System.out.println(uniquePairs.size());
        }
        //close the scanner
        s.close();
   }
}
