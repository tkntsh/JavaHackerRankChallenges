import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        //STDIN
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //new list to dynamically add ints to array
        List<Integer> list = new ArrayList<>();
        //loop as many times as there are ints
        for(int i = 0; i < n; i++)
        {
            //add ints to list
            list.add(sc.nextInt());
        }
        //storing num of queries
        int q = sc.nextInt();
        //runnig as many times as there are queries 
        for(int i = 0; i < q; i++)
        {
            //storing query type
            String query = sc.next();
            //checking if query is insert or delete from array list
            if(query.equals("Insert"))
            {
                int index = sc.nextInt();
                int numToAdd = sc.nextInt();
                //adding to index of list
                list.add(index, numToAdd);
            }
            else if(query.equals("Delete"))
            {
                //deleting specific index in array
                int index = sc.nextInt();
                list.remove(index);
            }
        }
        //printing out updated list array
        for(Integer num : list)
        {
            System.out.print(num + " ");
        }
        //closing scanner
        sc.close();
    }
}
