package mx.cactux.day01;

import java.util.Scanner;

public class Solution {



    public static void main(String ... args){
        System.out.println(">>>> soluction of the day 01");

        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        /* Declare second integer, double, and String variables. */
        int j;
        double e;
        String t = "";

        /* Read and save an integer, double, and String to your variables.*/

        j = scan.nextInt();
        e = scan.nextDouble();
        t = scan.next();

        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.


        /* Print the sum of both integer variables on a new line. */
         j = j + i;
        System.out.println(j);
        /* Print the sum of the double variables on a new line. */
        e = e + d;
        System.out.println(e);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        s = s.concat(t);
        System.out.println(s);
        scan.close();


    }
}
