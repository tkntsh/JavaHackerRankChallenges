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

class Result 
{
    public static String findSubstring(String s, int k)
    {
        //find lexicographically smallest substring of length k
        String smallest = null;
        
        //running through all possible substrings of length k
        for(int i = 0; i<= s.length() - k; i++)
        {
            String sub = s.substring(i, i + k);
            //checking if it's the first substring or lexicographically smaller than the current smallest
            if(smallest == null || sub.compareTo(smallest) < 0)
            {
                smallest = sub;
            }
        }
        //returning
        return smallest;
    }

}

public class Solution 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.findSubstring(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
