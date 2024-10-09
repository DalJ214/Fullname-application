package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);

    Animal patient1 = new Animal();

    System.out.println(patient1.getType());
    System.out.println("Welcome to our Veterinary clinic! \n");

    System.out.print("Please enter your animals type: ");
    String type = in.nextLine();
    patient1.setType(type);
    System.out.println(patient1.getType());


    }
}
