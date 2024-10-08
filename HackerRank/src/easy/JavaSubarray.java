package easy;

/*
 * We define the following:

    A subarray of an 

-element array is an array composed from a contiguous block of the original array's elements. For example, if , then the subarrays are , , , , , and . Something like

    would not be a subarray as it's not a contiguous subsection of the original array.
    The sum of an array is the total sum of its elements.
        An array's sum is negative if the total sum of its elements is negative.
        An array's sum is positive if the total sum of its elements is positive.

Given an array of

integers, find and print its number of negative subarrays on a new line.

Input Format

The first line contains a single integer,
, denoting the length of array .
The second line contains space-separated integers describing each respective element, , in array

.

Constraints

Output Format

Print the number of subarrays of
having negative sums.
 */

import java.io.*;
import java.util.*;

public class JavaSubarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        //populating array
        for(int i = 0; i < size; i++){
            list.add(in.nextInt());
        }
        
        //debug array contents
        //System.out.println("list contents: " + list);
        
        int count = 0;
        
        List<Integer> subList;
        // checking subarrays
        for(int i = 0; i < size; i++){
            for (int j = i + 1; j <= size; j++){
                subList = list.subList(i, j);
                
                int sum = 0;
                for (Integer num : subList){
                    sum += num;
                }
                
                // debug 
                //System.out.println("i = " + i + " j = " + j);
                //System.out.println("sub list contents: " + subList);
                //System.out.println("sum = " + sum);
                
                if (sum < 0){
                    count++;
                    
                    // debug 
                    //System.out.println("count added");
                }
                //debug
                //System.out.println();
            }
        }
        
        //debug
        //System.out.println("count: ");
        System.out.println(count);
        
        
        
        
        in.close();
    }
}
