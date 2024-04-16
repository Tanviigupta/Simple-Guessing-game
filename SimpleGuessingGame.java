// Importing necessary Java utility classes
import java.util.Scanner; // Importing Scanner class for user input
import java.util.Random; // Importing Random class for generating random numbers

// Declaring the main class
public class SimpleGuessingGame {
    // Main method where the program execution starts
    public static void main(String[] args) {
        // Initializing Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Initializing Random object for generating random numbers
        Random random = new Random();
        // Generating a random number between 1 and 100
        int systemInput = random.nextInt(100) + 1;
        // Declaring variables to store user input, number of guesses, and the system-generated number
        int userInput;
        int noOfGuesses = 0;
        
        // Printing welcome message and instructions
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have 10 attempts to guess the number.");
        
        // Looping until the user either guesses the number or exhausts all attempts
        while (noOfGuesses < 10) {
            // Prompting the user to guess the number
            System.out.print("Guess the number (between 1 and 100): ");
            // Reading user input
            userInput = scanner.nextInt();
            // Incrementing the number of guesses
            noOfGuesses++;
            
            // Checking if the user guessed the correct number
            if (userInput == systemInput) {
                // Printing a congratulatory message if the guess is correct
                System.out.println("Congratulations, you guessed the number " + systemInput + " in " + noOfGuesses + " guesses.");
                // Exiting the loop
                break;
            } else if (userInput < systemInput) {
                // Providing feedback if the guess is too low
                System.out.println("Too low");
            } else {
                // Providing feedback if the guess is too high
                System.out.println("Too high");
            }
        }
        
        // Checking if the user exhausted all attempts without guessing the correct number
        if (noOfGuesses == 10) {
            // Printing a message if the user ran out of attempts
            System.out.println("No attempts left. Better luck next time!");
        }
        
        // Closing the Scanner object to release resources
        scanner.close();
    }
}
