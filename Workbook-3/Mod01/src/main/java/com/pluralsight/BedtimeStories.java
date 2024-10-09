package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args){


        try {
            FileInputStream fis = new FileInputStream("src/main/resources/goldilocks.txt");

            Scanner keyboard = new Scanner(fis);

            String input;

            while(keyboard.hasNextLine()) {
                input = keyboard.nextLine();
                System.out.println(input);

            }
            keyboard.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        }
    }




