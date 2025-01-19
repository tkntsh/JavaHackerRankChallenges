import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args)
    {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
        //loop to run until all test cases are complete
        while(testCases > 0) 
        {
            String pattern = in.nextLine();
            try 
            {
                //checking if pattern is valid
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            //exception thrown if invalid
            catch(PatternSyntaxException e) 
            {
                System.out.println("Invalid");
            }
            //one less test case gone through in one increment
            testCases--;
        }
        //closing system in scanner
        in.close();
	}
}
