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

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        //for loop to run 10 times multiplying each iteration with N input
        for(int i = 1; i<11; i++)
        {
            System.out.println(N + " x " + i + " = " + (N*i));
        }
        
        bufferedReader.close();
    }
}
