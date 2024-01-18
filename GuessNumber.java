
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Additional details
        int maxAttempts = 10;
        int roundsPlayed = 0;
        int totalAttempts = 0;

        boolean playAgain = true;

        while (playAgain) {
            // Step 1: Generate a random number within the specified range
            int secretNumber = random.nextInt(100) + 1;

            // Increment rounds played
            roundsPlayed++;

            System.out.println("\nRound " + roundsPlayed + ": Guess the number between 1 and 100");

            int attempts = 0;

            while (attempts < maxAttempts) {
                // Step 2: Prompt the user to enter their guess
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                // Step 3: Compare the user's guess and provide feedback
                if (userGuess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number " + secretNumber + " in " + (attempts + 1) + " attempts.");
                    totalAttempts += attempts + 1;
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                attempts++;
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + secretNumber + ".");
            }

            // Ask if the user wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }

        // Display the user's score
        System.out.println("\nGame Over! You played " + roundsPlayed + " rounds and your average score was " + (double) totalAttempts / roundsPlayed + " attempts per round.");
    }
}
