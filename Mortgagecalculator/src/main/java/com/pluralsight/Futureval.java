package com.pluralsight;
import java.util.Scanner;

public class Futureval {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter deposit amount: ");
        double depositamount = keyboard.nextDouble();

        System.out.print("Enter APY: ");
        double APY = keyboard.nextDouble();

        System.out.print("CD term length(in years): ");
        int termLength = keyboard.nextInt();

        double interestrateDecimal = depositamount / 100;
        double cdInterest = depositamount * Math.pow(1 + (interestrateDecimal / 12), 12 * termLength);

        System.out.print("The amount after %.1f years is %.2f%n");




    }
}
