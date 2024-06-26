/*
 * 
 * Two strings, and

, are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

    string a: the first string
    string b: the second string

Returns

    boolean: If 

and

    are case-insensitive anagrams, return true. Otherwise, return false.

Input Format

The first line contains a string
.
The second line contains a string

.

Constraints

Strings and

    consist of English alphabetic characters.
    The comparison should NOT be case sensitive.

Sample Input 0

anagram
margana

Sample Output 0

Anagrams

Explanation 0
 */



package easy;

import java.util.Scanner;

public class JavaAnagrams {

	static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean validAnagram = false;
        // to ignore case we convert to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        // to use the sort method we need to convert to char array
        char aArr[] = a.toCharArray();
        char bArr[] = b.toCharArray();
        
        // have to import java.util.Arrays inline because we cannot edit imports
        java.util.Arrays.sort(aArr);
        java.util.Arrays.sort(bArr);
        
        validAnagram = java.util.Arrays.equals(aArr,bArr);
        
        return validAnagram;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

	}

}
