import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        //creating new scanner for user input
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        //getting length of strings
        int aNum = A.length();
        int bNum = B.length();
        //getting sum
        int sum = aNum + bNum;
        //creating compare variable to compare strings
        int compare = A.compareTo(B);
        //capitilizing both strings
        String cap1 = A.substring(0,1).toUpperCase() + A.substring(1);
        String cap2 = B.substring(0,1).toUpperCase() + B.substring(1);
        //printing sum
        System.out.println(sum);
        //checking which string comes first alphabetically
        if(compare<0)
        {
            System.out.println("No");
        }
        else if(compare>0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("Equal");
        }
        //printing capitilized strings
        System.out.println(cap1 + " " + cap2);
    }
}
