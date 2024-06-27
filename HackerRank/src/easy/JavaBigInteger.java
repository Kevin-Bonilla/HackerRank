package easy;

/*
 * 
 * In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.

Use the power of Java's BigInteger class and solve this problem.

Input Format

There will be two lines containing two numbers,
and

.

Constraints

and are non-negative integers and can have maximum

digits.

Output Format

Output two lines. The first line should contain
, and the second line should contain . Don't print any leading zeros.
 */

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class JavaBigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        String a = in.nextLine();
        String b = in.nextLine();
        
        BigInteger aBig = new BigInteger(a);
        BigInteger bBig = new BigInteger(b);
        
        BigInteger sum = aBig.add(bBig);
        System.out.println(sum);
        
        BigInteger mult =aBig.multiply(bBig);
        System.out.println(mult);
        
        
        
        in.close();
        
    }
}