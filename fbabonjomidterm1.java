//Fatoma Babonjo
//
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {

        int number = 4;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a number between 1 and 10: ");

        int guess = scanner.nextInt();


        if (guess == number) {
            System.out.println("Congratulations!  You guessed correctly and got $20,000!");
        } else {
            System.out.println("You missed that one!  Try another!");
        }

        scanner.close();
    }
}
