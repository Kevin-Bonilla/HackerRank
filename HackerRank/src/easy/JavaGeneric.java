package easy;

/*
 * Generic methods are a very efficient way to handle multiple datatypes using a single method. This problem will test your knowledge on Java Generic methods.

Let's say you have an integer array and a string array. You have to write a single method printArray that can print all the elements of both arrays. The method should be able to accept both integer arrays or string arrays.

You are given code in the editor. Complete the code so that it prints the following lines:

1
2
3
Hello
World

Do not use method overloading because your answer will not be accepted.
 */

import java.io.*;
import java.util.*;

class Printer{
   public static <E> void printArray(E[] inputArray)
        {
            for (E element : inputArray)
            {
                System.out.println(element);
            }
        } 
}

public class JavaGeneric {

    public static <E> void printArray(E[] inputArray)
        {
            for (E element : inputArray)
            {
                System.out.println(element);
            }
        }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        // our class that we made
        Printer myPrinter = new Printer();
        
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
    }
}