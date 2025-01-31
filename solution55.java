import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args) throws IOException 
    {
        //STD IN
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //prime class ref
        Prime primeChecker = new Prime();
        ArrayList<Integer> primesFound = new ArrayList<>();
        //running through all ints
        for(int i = 0; i < 5; i++) 
        {
            int num = Integer.parseInt(br.readLine());
            primeChecker.checkPrime(num, primesFound);
        }
    }
}

class Prime 
{
    //checking if int is prime, to be added to list
    public void checkPrime(int num, ArrayList<Integer> primesFound) 
    {
        boolean isPrime = true;
        
        if(num <= 1)
        {
            isPrime = false;
        } 
        else
        {
            for(int i = 2; i <= Math.sqrt(num); i++) 
            {
                if(num % i == 0) 
                {
                    isPrime = false;
                    break;
                }
            }
        }
        //if int = prime, add to list
        if(isPrime) 
        {
            primesFound.add(num);
        }
        //print all primes found
        if(!primesFound.isEmpty()) 
        {
            for(Integer prime : primesFound) 
            {
                System.out.print(prime + " ");
            }
        }
        //print new line after each check
        System.out.println();
    }
}
