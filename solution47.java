import java.util.*;
//classes of different characteristics
class Student{}
class Rockstar{}
class Hacker{}
//class to use instanceof
public class InstanceOFTutorial
{
  //method to count many different instances there are in the list
  static String count(ArrayList mylist)
  {
    //class a b c
     int a = 0,b = 0,c = 0;
    //loop running as long as list is not finished
     for(int i = 0; i < mylist.size(); i++)
     {
       //reference to the element in array
        Object element = mylist.get(i);
       //checking if element is an instanceof a Student
        if(element instanceof Student)
           a++;
       //checking if element is an instanceof a Rockstare
        if(element instanceof Rockstar)
           b++;
       //checking if element is an instanceof a Hacker
        if(element instanceof Hacker)
           c++;
     }
     //returning final results
     String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
     return ret;
  }
  //main method
  public static void main(String []args)
  {
     ArrayList mylist = new ArrayList();
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     for(int i=0; i<t; i++)
     {
        String s=sc.next();
        if(s.equals("Student"))mylist.add(new Student());
        if(s.equals("Rockstar"))mylist.add(new Rockstar());
        if(s.equals("Hacker"))mylist.add(new Hacker());
     }
    System.out.println(count(mylist));
  }
}
