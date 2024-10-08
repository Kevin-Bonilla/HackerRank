package easy;

/*
 * You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to their CGPA in decreasing order. If two student have the same CGPA, then arrange them according to their first name in alphabetical order. If those two students also have the same first name, then order them according to their ID. No two students have the same ID.

Hint: You can use comparators to sort a list of objects. See the oracle docs to learn about comparators.

Input Format

The first line of input contains an integer
, representing the total number of students. The next

lines contains a list of student information in the following structure:

ID Name CGPA

Constraints





The name contains only lowercase English letters. The

contains only integer numbers without leading zeros. The CGPA will contain, at most, 2 digits after the decimal point.

Output Format

After rearranging the students according to the above rules, print the first name of each student on a separate line.
 */

import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
public class JavaSort
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
      
        // sorting algorithm
        Collections.sort(studentList, new StudentCompare());
      
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}

class StudentCompare implements Comparator<Student>{
    
    @Override
    public int compare(Student student1, Student student2){
        // compare works by returning -1, 0, 1 
        // -1 = less than | 0 = equal | 1 = greater than
        
        double epsilon = 0.000001d;
        
        double s1CGPA = student1.getCgpa();
        double s2CGPA = student2.getCgpa();
        int compVal = Double.compare(s1CGPA, s2CGPA);
        
        if (compVal > 0){
            // student 1 cgpa > student 2 cgpa
            return -1;
        }
        else if (compVal < 0){
            // student 1 cgpa < student 2 cgpa
            return 1;
        }
        else{
            // if values are equal
            // compare by alpha then ID
            if (student1.getFname() != student2.getFname()){
                return student1.getFname().compareTo(student2.getFname());
            }
            else{
                //sort by id
                return student1.getId() - student2.getId();
            }
        }
        
        
    }
}




