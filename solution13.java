import java.util.Scanner;

public class Solution 
{
    static boolean isAnagram(String a, String b) 
    {
        //checking if length of both strings are equal otherwise return false    
        if(a.length() != b.length())
        {
            return false;
        }
        //for loop running amount of time there are characters in string A
        for(char c : a.toCharArray())
        {
            //lowercase
            a = a.toLowerCase();
            b = b.toLowerCase();
            //character counters for a and b
            int aCount = 0;
            int bCount = 0;
            //using number of characters in string a to run for loop
            for(int i = 0; i<a.length(); i++)
            {
                //checking if character counts match for a and b
                if(a.charAt(i) == c)
                {
                    aCount++;
                }
                if(b.charAt(i) == c)
                {
                    bCount++;
                }
            }
            //if counts dont match return false
            if(aCount != bCount)
            {
                return false;
            }
        }
        //return true if all tests are passed
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
