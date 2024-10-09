package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        CellPhone newPhone = new CellPhone();

        System.out.println("What is the carrier? ");
        String carrier = keyboard.nextLine();
        newPhone.setCarrier(carrier);

        System.out.println("What model is the phone? ");
        String model = keyboard.nextLine();
        newPhone.setModel(model);

        System.out.println("Who is the owner of the phone? ");
        String owner = keyboard.nextLine();
        newPhone.setOwner(owner);

        System.out.println("What is the phone number? ");
        String phoneNumber = keyboard.nextLine();
        newPhone.setPhoneNumber(phoneNumber);

        System.out.println("What is the serial number? ");
        int serialNumber = keyboard.nextInt();
        newPhone.setSerialNumber(serialNumber);




    }
}
