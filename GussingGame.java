import java.util.Random;
import java.util.Scanner;

class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        int min = 1;
        int max = 100;
        int round = 1;
        int score = 0;
        
        System.out.println("Welcome to the guessing game!");
        System.out.println("Guess a number between " + min + " and " + max);
        
        while (true) {
            int num = rand.nextInt(max - min + 1) + min;
            System.out.println("Round " + round + ":");
            
            int attempts = 0;
            while (true) {
                System.out.print("Enter your guess: ");
                int guess = input.nextInt();
                attempts++;
                
                if (guess == num) {
                    System.out.println("Congratulations, you guessed the number in " + attempts + " attempts!");
                    score += max - attempts + 1;
                    break;
                } else if (guess < num) {
                    System.out.println("Too low, try again.");
                } else {
                    System.out.println("Too high, try again.");
                }
                
                if (attempts >= 5) {
                    System.out.println("Sorry, you have reached the maximum number of attempts.");
                    break;
                }
            }
            
            System.out.println("Your score is " + score);
            System.out.print("Play again? (y/n): ");
            String choice = input.next();
            if (choice.equalsIgnoreCase("n")) {
                break;
            }
            
            round++;
        }
        
        System.out.println("Thanks for playing!");
    }
}
