package com.rps;

import java.util.Random;
import java.util.Scanner;

public class RockpaperScissor {

	public static void main(String[] args) {
        String[] options = {"Rock", "Paper", "Scissors"};
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter your choice (Rock, Paper, Scissors): ");
        String userChoice = sc.nextLine();
        String computerChoice = options[rand.nextInt(3)];

        System.out.println("Computer chose: " + computerChoice);

        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (
            (userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
            (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
            (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
        sc.close();
    }
}
