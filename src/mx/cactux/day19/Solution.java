package mx.cactux.day19;

import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        List<Integer> divisores = new ArrayList<Integer>();
        int i=1;
        do{
            if(n%i==0){
                divisores.add(n/i);
            }
         i++;
        }while(i<=n);

        int suma = 0;
        for(Integer numeros : divisores){
            suma = numeros + suma;
        }

        return suma;
    }
}

public class Solution {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
