/**
 * CSD402-340A - Java for Programmers
 * Assignment 2.2
 * Mirach Erkol
 * 1/18/2026
 * GitHub Repository: https://github.com/Mikey5007/csd-402
 * @author Mike
 */

package M2;

import java.util.Random;
import java.util.Scanner;

public class M2_2_RockPaperScissors_Erkol {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Generate computer choice (1–3)
        int computerChoice = random.nextInt(3) + 1;

        // Prompt user
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter your choice:");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");

        int userChoice = input.nextInt();

        // Convert numbers to words
        String computerMove = "";
        String userMove = "";

        switch (computerChoice) {
            case 1:
                computerMove = "Rock";
                break;
            case 2:
                computerMove = "Paper";
                break;
            case 3:
                computerMove = "Scissors";
                break;
        }

        switch (userChoice) {
            case 1:
                userMove = "Rock";
                break;
            case 2:
                userMove = "Paper";
                break;
            case 3:
                userMove = "Scissors";
                break;
            default:
                System.out.println("Invalid choice. Please run the program again.");
                return;
        }

        // Display choices
        System.out.println("\nYou chose: " + userMove);
        System.out.println("Computer chose: " + computerMove);

        // Determine winner
        if (userChoice == computerChoice) {
            System.out.println("Result: It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println("Result: You win! 🎉");
        } else {
            System.out.println("Result: Computer wins!");
        }

        input.close();
    }
}

