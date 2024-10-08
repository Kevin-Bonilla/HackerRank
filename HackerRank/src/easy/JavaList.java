package easy;

/*
 * For this problem, we have

types of queries you can perform on a List:

    Insert 

at index

:

Insert
x y

Delete the element at index

    :

    Delete
    x

Given a list,
, of integers, perform

queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

Input Format

The first line contains an integer,
(the initial number of elements in ).
The second line contains space-separated integers describing .
The third line contains an integer, (the number of queries).
The

subsequent lines describe the queries, and each query is described over two lines:

    If the first line of a query contains the String Insert, then the second line contains two space separated integers 

, and the value must be inserted into at index
.
If the first line of a query contains the String Delete, then the second line contains index
, whose element must be deleted from

    .

Constraints



    Each element in is a 32-bit integer.

Output Format

Print the updated list
as a single line of space-separated integers.
 */

import java.io.*;
import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        // number of initial elements in L
        int n = in.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        
        // filling in list
        for (int i = 0; i < n ; i++){
            list.add(in.nextInt());
        }
        
        //debug
        //System.out.println("list:" + list);
        
        int queries = in.nextInt();
        
        //debug
        //System.out.println("queries: " + queries);
        
        for (int i = 0; i < queries; i++){
            String qString = in.next();
            
            //debug 
            //System.out.println("query: " + qString);
            
            if (qString.equals("Insert")){
                int index = in.nextInt();
                int number = in.nextInt();
                
                //debug 
                //System.out.println("index: " + index + "number: " + number);
                
                list.add(index, number);
            }
            else{
                int index = in.nextInt();
                
                //debug
                //System.out.println("index: "+ index);
                
                list.remove(index);
            }
            
        }
        
        //System.out.println(list);
        
        for (Integer i : list){
            System.out.print(i + " ");
        }
        
        in.close();
        
    }
}
