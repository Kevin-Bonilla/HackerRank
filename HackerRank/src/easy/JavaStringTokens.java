package easy;

import java.io.*;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        if (scan.hasNext()){
            String s = scan.nextLine();
            // Write your code here.
        
            //trim removes extra spaces before and after
            String[] stringArr = s.trim().split("[ !,?._'@]+");
        
            System.out.println(stringArr.length);
        
            for(int i = 0; i < stringArr.length; i++){
                System.out.println(stringArr[i]);
            }
        }
        else{
        	// deals with empty input
            System.out.println(0);
        }
        
        
        
        
        
        scan.close();
    }
}


