import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock", "paper", "scissors"};

        System.out.println("=== Welcome to Rock-Paper-Scissors Game ===");

        while (true) {
            // Get user's choice
            System.out.print("Enter your choice (rock, paper, or scissors): ");
            String userChoice = scanner.next().toLowerCase();

            // Validate user input
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            // Generate computer's choice
            int computerIndex = random.nextInt(3);
            String computerChoice = choices[computerIndex];
            System.out.println("Computer chose: " + computerChoice);

            // Determine the result
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a draw!");
            } else if (
                (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock"))
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            // Ask if the user wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }

        scanner.close();
    }
}
