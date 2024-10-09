package com.pluralsight;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter Loan amount: ");
        double loanamount = keyboard.nextDouble();

        double MAX_LOAN_AMOUNT = 800000;
        if ( loanamount > MAX_LOAN_AMOUNT) {
            System.out.println("Error: Loan amount exceeds the maximum limit of $800000");
            return;
        }

        System.out.print("Enter interest rate (annual, in %): ");
        double annualInterestRate = keyboard.nextDouble();

        System.out.print("Enter loan term (in years): ");
        int loanTermYears = keyboard.nextInt();

        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        int numofpayments = loanTermYears * 12;

        double monthlypayment = (loanamount * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -numofpayments ));

        double totalPayment = monthlypayment * numofpayments;

        double totalInterestpaid = totalPayment - loanamount;


        System.out.printf("Monthly Payment: %.2f\n", monthlypayment);
        System.out.printf("Total interest paid over the life of the loan: $%,2f%n", totalInterestpaid);

    }

}
