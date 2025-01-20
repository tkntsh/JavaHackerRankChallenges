import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{
	  public static void main(String[] args)
    {
  		Scanner in = new Scanner(System.in);
  		int testCases = Integer.parseInt(in.nextLine());
		
        while(testCases>0)
        {
            //storing line and creating matcher
      			String line = in.nextLine();
      			Matcher matcher = Pattern.compile("<(.+)>(([^<>]+))</\\1>").matcher(line);
            
          	//checking if input is invalid
			      if(matcher.find() == false)
            {
                System.out.println("None");
            }
            //reseting matcher after each invalid input
            matcher.reset();
            
            //running loop while input is valid
            while(matcher.find() == true)
            {
                System.out.println(matcher.group(2));
            }
            //decrementing
			testCases--;
		}
    //closing scanner
    in.close();
	}
}
