import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        try
        {
            Scanner scFile = new Scanner(System.in);
            int numLine = 1;
            
            while(scFile.hasNext())
            {
                String line = scFile.nextLine();
                System.out.println(numLine + " " + line);
            }
            scFile.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
