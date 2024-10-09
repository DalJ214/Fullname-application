package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstname = keyboard.nextLine().trim();

        System.out.println("Enter your middle name: ");
        String middlename = keyboard.nextLine().trim();

        System.out.println("Enter your last name: ");
        String lastname = keyboard.nextLine().trim();

        System.out.println("Enter your suffix (if applicable): ");
        String Suffix = keyboard.nextLine().trim();

        String fullName = firstname +
                (middlename.isEmpty() ? "" : " " + middlename) +
                " "+ lastname +
                (Suffix.isEmpty() ? "" : ", " + Suffix);

        System.out.println("My name is: " + fullName.trim());

        keyboard.close();



    }





}
