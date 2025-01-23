import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        
        printArray(intArray);
        printArray(stringArray);
    }

    public static <E> void printArray(E[] array)
    {
        for(E element : array)
        {
            System.out.println(element);
        }
    }
}
