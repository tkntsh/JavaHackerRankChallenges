import java.math.BigDecimal;
import java.util.*;

class Solution
{
    public static void main(String []args)
    {
        //input using scanner
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n+2];
        //loop running until no input is left
        for(int i=0; i<n; i++)
        {
            s[i]=sc.next();
        }
        //closing scanner
        sc.close();

        //sorting in descending order
        Arrays.sort(s, 0, n, (a, b) ->
        {
            BigDecimal bd1 = new BigDecimal(a);
            BigDecimal bd2 = new BigDecimal(b);
            //reverse comparison (descending order)
            return bd2.compareTo(bd1);
        });
        
        //priting output using for loop
        for(int i=0; i<n; i++)
        {
            System.out.println(s[i]);
        }
    }
}
