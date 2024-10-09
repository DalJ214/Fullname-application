package com.pluralsight;
import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a game score:  ");
        String input = keyboard.nextLine();

        String[] parts = input.split("\\|");
        String[] teams = parts[0].split(":");
        String[] scores = parts[1].split(":");

        String homeTeam = teams[0].trim();
        String visitorTeam = teams[1].trim();
        int homeScore = Integer.parseInt(scores[0].trim());
        int visitorScore = Integer.parseInt(scores[1].trim());

        if (homeScore > visitorScore) {
            System.out.println("Winning Team: " + homeTeam);
        } else if (visitorScore > homeScore) {
            System.out.println("Winning team: " + visitorTeam);
            }else{
                System.out.println("The match is a tie!");
            }
        }







    }

