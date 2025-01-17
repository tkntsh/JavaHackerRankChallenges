import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        //requesting user input
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        //characters that seperate tokens
        String[] tokens = s.split("[^a-zA-Z]+");
        //creating array list to store tokens
        List<String> nonEmptyTokens = new ArrayList<>();
        //storing each new token as a new object in array list
        for(String token : tokens)
        {
            if(!token.isEmpty())
            {
                nonEmptyTokens.add(token);
            }
        }
        //priting number of tokens in array list
        System.out.println(nonEmptyTokens.size());
        //printing each token on new line
        for(String token : nonEmptyTokens)
        {
            System.out.println(token);
        }
        //closing scanner
        scan.close();
    }
}
