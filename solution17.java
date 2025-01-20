import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords 
{
    public static void main(String[] args) 
    {
        //setting pattern
        String regex = "\\b(\\w+)(?:\\w+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        //reading in sentences
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        //running until there are no more sentences left to read
        while(numSentences-- > 0) 
        {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            //checking for subsequences of input that match the compiled pattern
            while (m.find())
            {
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            //printing the modified sentence.
            System.out.println(input);
        }
        //closing scanner
        in.close();
    }
}
