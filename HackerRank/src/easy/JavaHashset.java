package easy;

/*
 * In computer science, a set is an abstract data type that can store certain values, without any particular order, and no repeated values(Wikipedia). is an example of a set, but

is not a set. Today you will learn how to use sets in java by solving this problem.

You are given
pairs of strings. Two pairs and are identical if and . That also implies is not same as

. After taking each pair as input, you need to print number of unique pairs you currently have.

Complete the code in the editor to solve this problem.

Input Format

In the first line, there will be an integer
denoting number of pairs. Each of the next

lines will contain two strings seperated by a single space.

Constraints:

Length of each string is atmost

    and will consist lower case letters only.

Output Format

Print
lines. In the line, print number of unique pairs you have after taking pair as input.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaHashset {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

//Write your code here
        HashSet<String> set = new HashSet<>();
        
        for (int i = 0; i < t; i++){
            set.add(pair_left[i] + " " + pair_right[i]);
            // size shows how many unique values we have in our hash map
            System.out.println(set.size());
        }

   }
}
