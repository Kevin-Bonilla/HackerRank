package easy;

/*
 * Java's BitSet class implements a vector of bit values (i.e.: () or ()) that grows as needed, allowing us to easily manipulate bits while optimizing space (when compared to other collections). Any element having a bit value of

is called a set bit.

Given
BitSets, and , of size where all bits in both BitSets are initialized to , perform a series of

operations. After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.

Input Format

The first line contains
space-separated integers, (the length of both BitSets and ) and (the number of operations to perform), respectively.
The

subsequent lines each contain an operation in one of the following forms:

    AND 

OR XOR FLIPSET In the list above, is the integer or , where denotes and denotes .
is an integer denoting a bit's index in the BitSet corresponding to

.

For the binary operations
, , and

, operands are read from left to right and the BitSet resulting from the operation replaces the contents of the first operand. For example:

AND 2 1

is the left operand, and is the right operand. This operation should assign the result of to

.

Constraints

Output Format

After each operation, print the respective number of set bits in BitSet
and BitSet as

space-separated integers on a new line.

Sample Input

5 4
AND 1 2
SET 1 4
FLIP 2 2
OR 2 1

Sample Output

0 0
1 0
1 1
1 2

Explanation

Initially:
, , , and . At each step, we print the respective number of set bits in and

as a pair of space-separated integers on a new line.



,
The number of set bits in and is

.


Set to ().
, .
The number of set bits in is and is

.


Flip from () to ().
, .
The number of set bits in is and is

.


.
, .
The number of set bits in is and is .
 */

import java.io.*;
import java.util.*;

public class JavaBitset {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        // length of both bitsets b1 and b2
        int n = in.nextInt();
        int m = in.nextInt();
        
        // initializing bitsets
        // bitsets default values is 0
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        
        // for loop for operations
        for (int i = 0; i < m ; i++){
            String operator = in.next();
            int o1 = in.nextInt();
            int o2 = in.nextInt();
            
            switch (operator){
                case "AND":
                    // for AND 1 2 case
                    if (o1 == 1){
                        b1.and(b2);
                    }
                    // for AND 2 1 case
                    else{
                        b2.and(b1);
                    }
                    break;
                    
                case "OR":
                    // for OR 1 2 case
                    if (o1 == 1){
                        b1.or(b2);
                    }
                    // for OR 2 1 case
                    else{
                        b2.or(b1);
                    }              
                    break;
                    
                case "XOR":
                    // for xor 1 2 case
                    if (o1 == 1){
                        b1.xor(b2);
                    }
                    // for xor 2 1 case
                    else{
                        b2.xor(b1);
                    }
                    break;
                    
                case "FLIP":
                    // for flip set 1 
                    if (o1 == 1){
                        b1.flip(o2);
                    }
                    // for flip set 2 
                    else{
                        b2.flip(o2);
                    }
                    break;
                    
                case "SET":
                    // set b1
                    if (o1 == 1){
                        b1.set(o2);
                    }
                    // set b2
                    else{
                        b2.set(o2);
                    }
                    break;
                    
                default:
                    System.out.println("no string operator matched");
                    break;
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
        
        in.close();
    }
}