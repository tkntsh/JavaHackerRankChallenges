import java.util.*;

//oop student object class
class Student
{
  //details of student
	private int id;
	private String fname;
	private double cgpa;
	
  public Student(int id, String fname, double cgpa)
  {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
  //accessor methods
	public int getId()
  {
		return id;
	}
	public String getFname()
  {
		return fname;
	}
	public double getCgpa()
  {
		return cgpa;
	}
}

//class to read in student details 
public class Solution
{
	public static void main(String[] args)
  {
        //read in from system
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		//create array list to store student details
		List<Student> studentList = new ArrayList<Student>();
		//looping until theres no more test cases
    while(testCases>0)
    {
      //storing details 
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			//adding student details to student object
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			//decrementing 
			testCases--;
		}   
    //sorting list based on CGPA in decreasing order, then by name, then by ID
    Collections.sort(studentList, new Comparator<Student>() 
    {
        @Override
        public int compare(Student s1, Student s2) 
        {
            //comparing cgpa first
            if(s2.getCgpa() != s1.getCgpa())
            {
                return Double.compare(s2.getCgpa(), s1.getCgpa());
            }
            //comparing first names
            else if(!s1.getFname().equals(s2.getFname()))
            {
                return s1.getFname().compareTo(s2.getFname());
            }
            //comparing ID lastly
            else
            {
                return Integer.compare(s1.getId(), s2.getId());
            }
        }
    });
    //printing out students in order
    for(Student st: studentList)
    {
      System.out.println(st.getFname());
    }
	}
}



