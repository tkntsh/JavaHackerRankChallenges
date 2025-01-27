import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

class Student implements Comparable<Student> 
{
    //student object characteristics
    private int id;
    private String name;
    private double cgpa;

    //constructor
    public Student(int id, String name, double cgpa) 
    {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    //accessor methods
    public int getID() 
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public double getCGPA() 
    {
        return cgpa;
    }
    //compare method
    @Override
    public int compareTo(Student other)
    {
        //comparing CGPA first
        if (this.cgpa != other.cgpa)
        {
            return Double.compare(other.cgpa, this.cgpa);
        } 
        //compare names if CGPA is the same
        else if (!this.name.equals(other.name))
        {
            return this.name.compareTo(other.name);
        } 
        //compare ID if names are the same
        else
        {
            return Integer.compare(this.id, other.id);
        }
    }
}

class Priorities
{
    public List<Student> getStudents(List<String> events)
    {
        //priority queue to automatically sort students
        PriorityQueue<Student> pq = new PriorityQueue<>();
        //running until there are no events left
        for(String event : events) 
        {
            //spliting into parts
            String[] parts = event.split("\\s+");
            //conditional statements
            if(parts[0].equals("ENTER"))
            {
                //storing student details
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);
                //adding students to queue
                pq.offer(new Student(id, name, cgpa));
            }
            else if(parts[0].equals("SERVED"))
            {
                //serve student at front of the queue
                if(!pq.isEmpty())
                {
                    pq.poll(); 
                }
            }
        }

        //convert priority queue
        List<Student> result = new ArrayList<>(pq);
        
        //sort list again finally to produce results
        Collections.sort(result);
        return result;
    }
}


public class Solution 
{
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) 
    {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) 
        {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) 
        {
            System.out.println("EMPTY");
        } 
        else 
        {
            for (Student st: students)
            {
                System.out.println(st.getName());
            }
        }
    }
}
