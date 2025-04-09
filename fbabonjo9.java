// Fatoma Babonjo
//

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        int guess = 0;
	int y;

        
        Random random = new Random();
        y=random.nextInt(20) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick a number between 1 and 20:");

        while (guess < 1 || guess > 20) {
            guess = scanner.nextInt();

            
            if (guess < 1 || guess > 20) {
                System.out.println("That number's out of range! Try another!");
                continue;
            }

            
            if (guess < y) {
                System.out.printf("That's too low.  The answer was %d%n",y);
            } 
	    else if (guess > y) {
                System.out.printf("That's too high.  The answer was %d%n",y);
                } 
	    else {
                System.out.println("Congratulations!  You guessed the correct number!");

                
                for (int i = 0; i < guess; i++) {
                    System.out.printf("You win! This is the number: %d%n", y);
                }
               
            }
        }

        scanner.close();
    }
}
