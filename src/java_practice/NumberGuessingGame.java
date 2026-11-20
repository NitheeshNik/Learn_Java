public class NumberGuessingGame {

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have picked a number between 1 and 100. Can you guess it?");

        // Keep looping until the user guesses the secret number
        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");

            // Check if the user entered a valid integer
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                attempts++;

                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                } else if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > secretNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                }
            } else {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.next(); // Clear the invalid input
            }
        }

        scanner.close();
    }
}

}
