import java.util.*;

public class Solution 
{
    public static boolean canWin(int leap, int[] game) 
    {
        //returning true if you can win the game
        return canWinFromIndex(0, leap, game, new boolean[game.length]);
    }
    
    private static boolean canWinFromIndex(int i, int leap, int[] game, boolean[] visited)
    {
        //base cases 
        if(i >= game.length)
        {
            return true;
        }
        if(i < 0 || game[i] == 1 || visited[i])
        {
            return false;
        }
        //marking current position as visited
        visited[i] = true;
        //returning true or false for all possible moves (leap, walk forward/backwards)
        return canWinFromIndex(i + leap, leap, game, visited) || canWinFromIndex(i + 1, leap, game, visited) || canWinFromIndex(i - 1, leap, game, visited);
    }

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        
        while (q --> 0) 
        {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for(int i = 0; i < n; i++) 
            {
                game[i] = scan.nextInt();
            }
            //print out yes or no
            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
