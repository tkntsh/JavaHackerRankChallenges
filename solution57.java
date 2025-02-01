import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

class Singleton 
{
    //static instance of Singleton
    private static Singleton instance;
    
    //public instance variable
    public String str;

    //private constructor preventing instantiation
    private Singleton()
    {
        
    }

    //static method getting instance of Singleton class
    public static Singleton getSingleInstance()
    {
        if(instance == null) 
        {
            instance = new Singleton();
        }
        return instance;
    }
}
