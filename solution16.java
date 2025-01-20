import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords 
{
    public static void main(String[] args) 
    {
        //setting pattern
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        //reading in input
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        //running loop until, no sentences left
        while(numSentences-- > 0) 
        {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            //check for sequences
            while (m.find()) 
            {
                input = input.replaceAll("(?i)\\b" + m.group(1) + "(?:\\s+\\b" + m.group(1) + "\\b)+", m.group(1));
            }
            
            //print
            System.out.println(input);
        }
        //close
        in.close();
    }
}
