import java.util.Scanner;

public class SecretWordGame {
    public static void main(String[] args) {
        
        String secretWord = "apple"; 
        int fullAttempts = 5;
        
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        boolean hasWon = false;

        System.out.println("Welcome to the Secret Word Game!");
        System.out.println("You have " + fullAttempts + " attempts to guess the secret word.");

       
        do {
            System.out.print("Enter your guess: ");
            String guess = scanner.nextLine();

            if (guess.equals(secretWord)) {
                System.out.println("Congratulations! You've guessed the secret word!");
                hasWon = true;
            } else {
               
                if (guess.length() < secretWord.length()) {
                    System.out.println("Too short! Try again.");
                } else if (guess.length() > secretWord.length()) {
                    System.out.println("Too long! Try again.");
                } else {
                    System.out.println("Wrong word! Try again.");
                }
                attempts++;
                System.out.println("Attempts left: " + (fullAttempts - attempts));
            }
        } while (attempts < fullAttempts && !hasWon); 

        if (!hasWon) {
            System.out.println("Sorry, you've used all your attempts. The secret word was: " + secretWord);
        }

        scanner.close();
    }
}
