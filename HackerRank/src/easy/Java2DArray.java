package easy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/*
 * You are given a

2D array. An hourglass in an array is a portion shaped like this:

a b c
  d
e f g

For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:

1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0

The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

In this problem you have to print the largest sum among all the hourglasses in the array.

Input Format

There will be exactly
lines, each containing integers seperated by spaces. Each integer will be between and

inclusive.

Output Format

Print the answer to this problem on a single line.
 */

public class Java2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        
        int largestSum = 0;
        // dealing with 6x6 array (index 0-5)
        for (int x = 0; x <= 3; x++){
            for(int y = 0; y <= 3; y++){
                
                //debug
                /*
                System.out.println();
                System.out.println("x: " + x + " y: " + y);
                System.out.println("digits of hourglass");
                System.out.println(arr.get(x).get(y) + " " //first row of hourglass
                          + arr.get(x).get(y + 1) + " "
                          + arr.get(x).get(y + 2) + " "
                          + arr.get(x + 1).get(y + 1) + " " // middle of hourglass
                          + arr.get(x + 2).get(y) + " " //lass row of hourglass
                          + arr.get(x + 2).get(y + 1) + " "
                          + arr.get(x + 2).get(y + 2) + " "
                          );
                */
                
                int sum = arr.get(x).get(y) //first row of hourglass
                          + arr.get(x).get(y + 1)
                          + arr.get(x).get(y + 2)
                          + arr.get(x + 1).get(y + 1) // middle of hourglass
                          + arr.get(x + 2).get(y) //lass row of hourglass
                          + arr.get(x + 2).get(y + 1)
                          + arr.get(x + 2).get(y + 2)
                          ;
                          
                //System.out.println(sum); //debug
                if (sum > largestSum){
                    largestSum = sum;
                    // System.out.println("sum replaced"); // debug
                }
                else if(x == 0 && y == 0){
                    largestSum = sum;
                }
            }
        }
        
        // prints solution
        System.out.println(largestSum);
    }
}
