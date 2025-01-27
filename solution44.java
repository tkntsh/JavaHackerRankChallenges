import java.util.*;

interface AdvancedArithmetic
{
  int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic
{
    public int divisor_sum(int n)
    {
        //sum to keep track of total
        int sum = 0;
        //running until loop reaches n
        for(int i = 1; i <= n; i++)
        {
            //checking if n is divisible by i
            if(n%i == 0)
            {
                //add to sum total
                sum += i;
            }
        }
        //return total sum
        return sum;
    }
}

class Solution
{
    public static void main(String []args)
    {
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    //method takes an object and prints name of interfaces implemented
    static void ImplementedInterfaceNames(Object o)
    {
        Class[] theInterfaces = o.getClass().getInterfaces();
        for(int i = 0; i < theInterfaces.length; i++)
        {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

