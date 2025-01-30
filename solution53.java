import java.lang.reflect.*;
import java.util.*;

class Student
{
    //student characterisitcs
    private String name;
    private String id;
    private String email;
    //declaring method setter/getters
    public String getName() 
    {
        return name;
    }
    public String getId() 
    {
        return id;
    }
    public String getEmail() 
    {
        return email;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public void setId(String id) 
    {
        this.id = id;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }
}

class Solution 
{
    //main method
    public static void main(String[] args)
    {
        //ref to student object
        Class<?> student = Student.class;
        //getting all declared methods from student ref
        Method[] methods = student.getDeclaredMethods()/;
        //array list to store and arrange methods
        ArrayList<String> methodList = new ArrayList<>();
        //running however many methods there are
        for(Method m : methods)
        {
            //adding methods to array list one by one
            methodList.add(m.getName());
        }
        //sorting array list
        Collections.sort(methodList);
        //running however many methods there are
        for(String name: methodList)
        {
            //printing method names individually
            System.out.println(name);
        }
    }
}
