import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Result
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        //US currency format
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        //creating India currency format
        Locale indiaLocale = new Locale("en", "IN");
        String india = NumberFormat.getCurrencyInstance(indiaLocale).format(payment);
        //CHINA currency format
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

public class Solution 
{
    public static void main(String[] args) throws IOException
    {
        Result.main(args);
    }
}
