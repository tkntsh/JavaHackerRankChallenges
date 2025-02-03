import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //storing STDIN
        String n = bufferedReader.readLine();
        //closing STDIN
        bufferedReader.close();
        //use BigInteger for handling large integers
        BigInteger number = new BigInteger(n);
        
        //using BigInteger's method to check for primality
        if (number.isProbablePrime(1))
        {
            //1 is the certainty level, higher numbers increase accuracy but also time
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
}
