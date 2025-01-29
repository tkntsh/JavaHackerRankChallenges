import java.util.Scanner;
class MyCalculator
{
    public long power(int n, int p) throws Exception
    {
        //checking if n and p are positve
        if(n<0 || p<0)
        {
            throw new Exception("n or p should not be negative.");
        }
        //checking if n or p is = 0
        else if(n==0 && p==0)
        {
            throw new Exception("n and p should not be zero.");
        }
        //returning answer
        return (long)Math.pow(n, p);
    }
}

public class Solution
{
  public static final MyCalculator my_calculator = new MyCalculator();
  public static final Scanner in = new Scanner(System.in);
    
  public static void main(String[] args) 
  {
      while (in .hasNextInt())
      {
          int n = in .nextInt();
          int p = in .nextInt();
            
          try
          {
              System.out.println(my_calculator.power(n, p));
          }
          catch (Exception e) 
          {
              System.out.println(e);
          }
      }
  }
}
