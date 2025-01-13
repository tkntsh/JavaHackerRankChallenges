import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        //creating scanner object to check input from user
        Scanner scFile = new Scanner(System.in);
        //three lines expected from user input
        String line1 = "";
        String line2 = "";
        String line3 = "";

        //checking if input has next line
        while(scFile.hasNext())
        {
            //storing input lines 
            line1 = scFile.nextLine();
            line2 = scFile.nextLine();
            line3 = scFile.nextLine();
        }
        //closing scanner
        scFile.close();

        //printing storeed values
        System.out.println("1 " + line1);
        System.out.println("2 " + line2);
        System.out.println("3 " + line3);
    }
}
