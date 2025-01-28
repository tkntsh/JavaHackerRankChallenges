import java.util.*;
//parent class
class Sports
{
  //returning original name
  String getName()
  {
      return "Generic Sports";
  }
  //printing team name
  void getNumberOfTeamMembers()
  {
      System.out.println( "Each team has n players in " + getName() );
  }
}

class Soccer extends Sports
{
  //overriding original method to print sport type
  @Override
  String getName()
  {
      return "Soccer Class";
  }
  //updating output print
  @Override
  void getNumberOfTeamMembers()
  {
      System.out.println("Each team has 11 players in " + getName());
  }
}

public class Solution
{	
  public static void main(String []args)
  {
      Sports c1 = new Sports();
      Soccer c2 = new Soccer();
      System.out.println(c1.getName());
      c1.getNumberOfTeamMembers();
      System.out.println(c2.getName());
      c2.getNumberOfTeamMembers();
  }
}
