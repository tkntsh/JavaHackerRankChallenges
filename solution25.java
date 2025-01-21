import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //number of lines
        int n = sc.nextInt();
        //new arraylist
        List<List<Integer>> lines = new ArrayList<>();
        
        //loop as many times as ther are lines
        for(int i = 0; i < n; i++)
        {
            //num of integers in current line
            int k = sc.nextInt();
            List<Integer> line = new ArrayList<>();
            //adding integers to arraylist created above dynamically
            for(int j = 0; j < k; j++)
            {
                line.add(sc.nextInt());
            }
            //adding complete array to big arraylist
            lines.add(line);
        }
        //creating num of queries
        int q = sc.nextInt();
        //loop to handle queries
        for(int i = 0; i < q; i++)
        {
            //index of line - 0 based indexing
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            //printing numbers according to constraints
            if(x >= 0 && x < lines.size() && y >= 0 && y<lines.get(x).size())
            {
                System.out.println(lines.get(x).get(y));
            }
            else
            {
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}
