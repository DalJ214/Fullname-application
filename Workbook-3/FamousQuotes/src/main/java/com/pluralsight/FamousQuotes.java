package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

    try {
        String[] Quotes = {
                "We accept the love we think we deserve", "You can lead a horse to water, but you can't make it drink", "In the midst of chaos, there is also opportunity", "know yourself and you will win all battles", "Nobody even imagines how well one can lie about the state of one’s own heart", "Yesterday is history, tomorrow is a mystery, today is a gift of God, which is why we call it the present.", "The man who does not read has no advantage over the man who cannot read.", "It is easy to love your friend, but sometimes the hardest lesson to learn is to love your enemy", "Being deeply loved by someone gives you strength, while loving someone deeply gives you courage.", "It is never too late to be what you might have been."
        };
        System.out.print("Pick a quote between #1-#10: ");
        int pick = keyboard.nextInt();

        if (pick >= 1 && pick <= 10) {
            System.out.println("Qoute #: " + pick + Quotes[pick - 1]);
        } else {
            System.out.println("Invalid option. Please pick a number between 1 to 10.");
        }
    } catch (Exception e) {
        System.out.println("Your option did not fit into the given range! ");
        e.printStackTrace();
    }
    }
}
