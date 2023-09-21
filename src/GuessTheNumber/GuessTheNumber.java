package GuessTheNumber;

import java.util.Random;
import java.util.Scanner;

    public class GuessTheNumber{
            public static void main(String[] args) {
                int lowerBound = 1;
                int upperBound = 100;
                int maxAttempts = 10;
                int score = 0;

                Random random = new Random();
                int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

                Scanner scanner = new Scanner(System.in);
                System.out.println("Welcome to Guess the Number game!");
                System.out.println("Try to guess the number between " + lowerBound + " and " + upperBound);

                for (int attempt = 1; attempt <= maxAttempts; attempt++) {
                    System.out.print("Attempt " + attempt + "/" + maxAttempts + ": Enter your guess: ");
                    int guessedNumber = scanner.nextInt();

                    if (guessedNumber < targetNumber) {
                        System.out.println("Try a higher number.");
                    } else if (guessedNumber > targetNumber) {
                        System.out.println("Try a lower number.");
                    } else {
                        System.out.println("Congratulations! You guessed the number in " + attempt + " attempts.");
                        score += maxAttempts - attempt + 1;

                        System.out.print("Do you want to play again? (yes/no): ");
                        String playAgain = scanner.next();
                        if (playAgain.equalsIgnoreCase("yes")) {
                            targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
                            attempt = 0;
                        } else {
                            System.out.println("Game over! Your final score: " + score);
                            break;
                        }
                    }
                }

                scanner.close();
            }
        }


