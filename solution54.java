import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.regex.*;
import java.security.*;

public class Solution
{
	public static void main(String[] args) throws Exception 
  {
		DoNotTerminate.forbidExit();
		try
    {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine().trim());
			Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private
            
      //creating instance of the Inner class
      Inner inner = new Inner();
      //getting the first (and only) inner class of Inner, which is Private
      Class<?> privateClass = Inner.class.getDeclaredClasses()[0];
      //getting the constructor that takes Inner as an argument
      Constructor<?> constructor = privateClass.getDeclaredConstructor(Inner.class);
      //making the constructor accessible since it's private
      constructor.setAccessible(true);
      //creating a new instance of Private with the inner instance
      o = constructor.newInstance(inner);

      //getting the method powerof2 from Private inner class
      Method method = privateClass.getDeclaredMethod("powerof2", int.class);
      //making the method accessible since it's private
      method.setAccessible(true);

      //invoking the method and print the result
      String result = (String) method.invoke(o, num);
      //printing results along with num
      System.out.println(num + " is " + result);
            
		  System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
		}
		
		catch (DoNotTerminate.ExitTrappedException e) 
    {
			System.out.println("Unsuccessful Termination!!");
		}
	}
  
	static class Inner
  {
		private class Private
    {
			private String powerof2(int num)
      {
				return ((num&num-1)==0)?"power of 2":"not a power of 2";
			}
		}
	}
}

class DoNotTerminate 
{	 
    public static class ExitTrappedException extends SecurityException
    {
		  private static final long serialVersionUID = 1L;
    }
 
    public static void forbidExit() 
    {
        final SecurityManager securityManager = new SecurityManager() 
        {
            @Override
            public void checkPermission(Permission permission) 
            {
                if(permission.getName().contains("exitVM")) 
                {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
