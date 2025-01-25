import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //initializing two BitSets of size n
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        //looping through each operation
        for (int i = 0; i < m; i++)
        {
            //reading in operation type and parameters
            String op = sc.next();
            //which bitset should operate on 1 or 2
            int x = sc.nextInt();
            //index 
            int y = sc.nextInt();
            
            //switch statement performing operation based on input
            switch(op)
            {
                case "AND":
                    //AND operation
                    if(x == 1)
                    {
                        b1.and(b2);
                    }
                    else
                    {
                        b2.and(b1);
                    }
                    break;
                case "OR":
                    //OR operation
                    if(x == 1)
                    {
                        b1.or(b2);
                    }
                    else
                    {
                        b2.or(b1);
                    }
                    break;
                case "XOR":
                    //XOR operation
                    if (x == 1)
                    {
                        b1.xor(b2);
                    }
                    else
                    {
                        b2.xor(b1);
                    }
                    break;
                case "FLIP":
                    //flipping the bit at index y
                    if (x == 1)
                    {
                        b1.flip(y);
                    }
                    else
                    {
                        b2.flip(y);
                    }
                    break;
                case "SET":
                    //setting the bit at index y to 1
                    if (x == 1)
                    {
                        b1.set(y);
                    }
                    else
                    {
                        b2.set(y);
                    }
                    break;
            }
            //printing
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
        //closing scanner
        sc.close();
    }
}
