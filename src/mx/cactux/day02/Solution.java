package mx.cactux.day02;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String ... args){
        System.out.println(">>> Solution of day 02");
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }


    public static void solve(double meal_cost, int tip_percent,int tax_percent){
        double tip = (meal_cost*tip_percent)/100;
        double tax = (meal_cost*tax_percent)/100;
        double totalCost = meal_cost+tip+tax;
        int totalCostInt = round(totalCost);
        System.out.println(totalCostInt);
    }
    public static int round(double totalCost){
        return (int) Math.round(totalCost);
    }

}
