import java.util.*;

//class to check which player is above another
class Checker implements Comparator<Player>
{
  //method to compare two player names and scores
  public int compare(Player a, Player b)
  {
    if(b.score != a.score)
    {
        return b.score - a.score;
    }
    else
    {
        return a.name.compareTo(b.name);
    }
  }
}
//oop player class
class Player
{
  String name;
  int score;
  
  Player(String name, int score)
  {
      this.name = name;
      this.score = score;
  }
}

class Solution
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    Player[] player = new Player[n];
    Checker checker = new Checker();
    
    for(int i = 0; i < n; i++)
    {
        player[i] = new Player(scan.next(), scan.nextInt());
    }
    scan.close();

    Arrays.sort(player, checker);
    for(int i = 0; i < player.length; i++)
    {
        System.out.printf("%s %s\n", player[i].name, player[i].score);
    }
  }
}
