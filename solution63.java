import java.util.Scanner;

public class Solution 
{
    public static String getSmallestAndLargest(String s, int k) 
    {
        //initializing with first substring of length k
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        //only going up to where we can get a full substring of length k
        for(int i = 1; i<=s.length()-k; i++)
        {
            String current = s.substring(i, i + k);
            
            //updating smallest if current is lexicographically smaller
            if(current.compareTo(smallest) < 0) 
            {
                smallest = current;
            }
            
            //updating largest if current is lexicographically greater
            if(current.compareTo(largest) > 0) 
            {
                largest = current;
            }
        }
        
        //returning values
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
