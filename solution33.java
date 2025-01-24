import java.util.*;

public class test
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        //total num of ints
        int n = in.nextInt();
        //subarray size
        int m = in.nextInt();
        //keep track of unique integers
        Set<Integer> uniqueIntegers = new HashSet<>();
        //store max num of unique ints
        int maxUnique = 0;
        //processing each number
        for(int i = 0; i < n; i++)
        {
            int num = in.nextInt();
            //adding current num to deque and the set
            if(deque.size() == m)
            {
                //removing the first number of the previous window if the window size is m
                int first = deque.removeFirst();
                
                if(!deque.contains(first))
                {
                    uniqueIntegers.remove(first);
                }
            }
            
            deque.add(num);
            uniqueIntegers.add(num);
            //updating max unique num of ints
            maxUnique = Math.max(maxUnique, uniqueIntegers.size());
        }
        //printing out updated max unique num
        System.out.println(maxUnique);
        in.close();
    }
}
