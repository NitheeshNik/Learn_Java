import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int secretNumber = random.nextInt(100) + 1;
        int maxAttempts = 7;
        int attempts = 0;
        boolean hasWon = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have picked a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.\n");

        // Loop continues as long as the player has attempts left and hasn't won
        while (attempts < maxAttempts && !hasWon) {
            System.out.print("Attempt " + (attempts + 1) + "/" + maxAttempts + " - Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low! Try a higher number.\n");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try a lower number.\n");
            } else {
                hasWon = true;
                System.out.println(
                        "Congratulations! You guessed the number " + secretNumber + " in " + attempts + " attempts.");
            }
        }

        // Check if the loop ended because the player ran out of tries
        if (!hasWon) {
            System.out.println("Game Over! You've used all your attempts. The number was: " + secretNumber);
        }

        scanner.close();
    }
}
