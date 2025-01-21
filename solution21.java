import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution 
{
    public static void main(String[] args) 
    {
        //read in input
        Scanner scFile = new Scanner(System.in);
        //storing num1 and num2
        BigInteger num1 = scFile.nextBigInteger();
        BigInteger num2 = scFile.nextBigInteger();
        //priting sum and product of two nums
        System.out.println(num1.add(num2));
        System.out.println(num1.multiply(num2));
    }
}
