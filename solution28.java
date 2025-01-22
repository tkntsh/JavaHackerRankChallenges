import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String[] argh)
	{
    //STDIN
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
    //creating hashmap to store matching names and phone numbers
    Map<String, String> phoneBook = new HashMap<String,String>();
    //running loop n time 
		for(int i = 0; i < n; i++)
		{
			//storing vars
      String name = in.nextLine();
			String phone = in.nextLine();
			phoneBook.put(name, phone);
		}
    //run until in has no more lines
		while(in.hasNext())
		{
      //storing queries
      String q = in.nextLine();
      //checking if query is found or not
      if(phoneBook.containsKey(q))
      {
          System.out.println(q + "=" + phoneBook.get(q));
      }
      else
      {
          System.out.println("Not found");
      }
		}
    //closing scanner
    in.close();
	}
}
