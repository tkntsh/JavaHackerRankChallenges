import java.util.*;
import java.util.Stack;

class Solution
{	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext())
    {
		  String input=sc.next();
      //declaring stack to store the opening brackets
      Stack<Character> st = new Stack<>();
      
      boolean isBalanced = true;
      
      for(int i = 0; i < input.length(); i++)
      {
          char c = input.charAt(i);
          //checking if the character is an opening bracket
          if (c == '(' || c == '{' || c == '[')
          {
              st.push(c);
          }
          else
          {
              //checking if the stack is non-empty and if the top of the stack is a matching opening bracket
              if(st.empty())
              {
                  isBalanced = false;
                  break;
              }
              
              char top = st.pop();
              
              if((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) 
              {
                  isBalanced = false;
                  break;
              }
          }
		    }
        //checking if all brackets are matched and the stack is empty
        if(isBalanced && st.empty()) 
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
	}
}



