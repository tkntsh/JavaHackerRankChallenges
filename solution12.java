import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String reverse = "";
        //for loop running to the end of the word 
        for(int i = A.length()-1; i>=0; i--)
        {
            reverse = reverse + A.charAt(i);
        }
        //checking if strings are equal
        if(A.equals(reverse))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
