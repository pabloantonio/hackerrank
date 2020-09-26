package mx.cactux.day10;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Day10 {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int res = 0;
        int max = 0;
        int cont = 0;
        while(n>0){
            res = n%2;
            n= n/2;
            if(res==1){
                cont++;
            }else{
                cont=0;
            }
            max = Math.max(cont,max);
        }
        System.out.println(max);
        scanner.close();
    }
}
