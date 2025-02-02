import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//base flower class
class Flower 
{
    public String whatsYourName()
    {
        return "Flower";
    }
}

//jasmine class extending flower
class Jasmine extends Flower 
{
    @Override
    public String whatsYourName()
    {
        return "Jasmine";
    }
}

//lily class extending flower
class Lily extends Flower 
{
    @Override
    public String whatsYourName() 
    {
        return "Lily";
    }
}

//base Region class
class Region 
{
    public Flower yourNationalFlower() 
    {
        return new Flower();
    }
}

//westbengal class extending region with covariant return type for the method
class WestBengal extends Region
{
    @Override
    public Jasmine yourNationalFlower() 
    {
        return new Jasmine();
    }
}

//andhrapradesh class extending region with covariant return type for the method
class AndhraPradesh extends Region 
{
    @Override
    public Lily yourNationalFlower() 
    {
        return new Lily();
    }
}


public class Solution 
{
  public static void main(String[] args) throws IOException 
  {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String s = reader.readLine().trim();
      Region region = null;
      switch (s) 
      {
        case "WestBengal":
          region = new WestBengal();
          break;
        case "AndhraPradesh":
          region = new AndhraPradesh();
          break;
      }
      Flower flower = region.yourNationalFlower();
      System.out.println(flower.whatsYourName());
    }
}
