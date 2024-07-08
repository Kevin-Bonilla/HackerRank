package easy;

/*
 * 
 */

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



public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        
        //my code starts
        BigInteger bi = new BigInteger(n);
        boolean prime = bi.isProbablePrime(1);
        
        // prime = true then n is prime, prime = false,  not true 
        if (prime){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }

        bufferedReader.close();
    }
}
