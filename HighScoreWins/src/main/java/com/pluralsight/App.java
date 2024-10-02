package com.pluralsight;
import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a score in the format Home:Visitor|HomeScore:VisitorScore: ");
        String input = keyboard.nextLine();

        String[] parts = input.split("\\|");
        String[] teams = parts[0].split(":");
        String[] scores = parts[1].split(":");

        String homeTeam = teams[0].trim();
        String visitorTeam = teams[1].trim();
        int homeScore = Integer.parseInt(scores[0].trim());
        int visitorScore = Integer.parseInt(scores[1].trim());

        





    }
}
