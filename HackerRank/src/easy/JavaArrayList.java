package easy;

/*
 * Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given
lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in position of

line.

Take your input from System.in.

Input Format
The first line has an integer
. In each of the next lines there will be an integer denoting number of integers on that line and then there will be space-separated integers. In the next line there will be an integer denoting number of queries. Each query will consist of two integers and

.

Constraints

Each number will fit in signed integer.
Total number of integers in lines will not cross

.

Output Format
In each line, output the number located in
position of line. If there is no such position, just print "ERROR!"
 */


import java.io.*;
import java.util.*;

public class JavaArrayList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<ArrayList> aList = new ArrayList<ArrayList>(); // Create an ArrayList object
        Scanner in = new Scanner(System.in);
        
        int n = Integer.parseInt(in.nextLine());
        
        // portion that assigns all values to arrayLists
        for (int i = 0; i < n; i++){
            // first num of line declares how many numbers in that line
            int intNum = in.nextInt();
            ArrayList<Integer> line = new ArrayList<Integer>();
            
            // takes number of ints declared by first number in line
            for (int j = 0; j < intNum; j++){
                // have to translate to Integer from int 
                line.add(new Integer(in.nextInt()));
            }
            aList.add(line);
            // cycle to next line 
            in.nextLine();
        }
        
        // part that handles queries
        // first int of this section declares how many queries
        int numOfQueries = Integer.parseInt(in.nextLine());
        
        // process queries
        for (int i = 0; i < numOfQueries; i++){
            // -1 because indexes start at 0 
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1; 
            in.nextLine();
            
            // checking if parameters are valid
            if(x < aList.size() && y < aList.get(x).size()){
                System.out.println(aList.get(x).get(y));
            }else{
                    System.out.println("ERROR!");
            }
            
        }
        
        in.close();
    }
}