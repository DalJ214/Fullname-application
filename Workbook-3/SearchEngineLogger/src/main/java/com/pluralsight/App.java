package com.pluralsight;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        logAction("launch");
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("Enter a search term(X to exit): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("X")) {
                logAction(("exit"));
                System.exit(0);
            } else {
                logAction("search - " + input);
            }
        }




    }
        public static void logAction(String action){


        try{

            FileWriter fileWriter = new FileWriter("logs.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            LocalDateTime today = LocalDateTime.now();
            DateTimeFormatter fmt =
                    DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm:ss");


            String formattedDate = today.format(fmt);
            bufferedWriter.write(formattedDate + " " + action);
            bufferedWriter.newLine();

            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
