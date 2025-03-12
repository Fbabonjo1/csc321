// Fatoma Babonjo
//

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        int randomNumber, guess;

        
        Random random = new Random();
        randomNumber = random.nextInt(20) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess a number between 1 and 20:");

        while (true) {
            guess = scanner.nextInt();

            
            if (guess < 1 || guess > 20) {
                System.out.println("That number's out of range! Try another!");
                continue;
            }

            
            if (guess < randomNumber) {
                System.out.println("That's too low! The number was " + randomNumber + "!");
                break;
            } else if (guess > randomNumber) {
                System.out.println("That's too high! The number was " + randomNumber + "!");
                break;
            } else {
                System.out.println("That is correct! Good job!");

                
                for (int i = 0; i < guess; i++) {
                    System.out.println("That is correct! Good job!");
                }
                break;
            }
        }

        scanner.close();
    }
}
