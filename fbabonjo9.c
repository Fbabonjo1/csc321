//Fatoma Babonjo
//


#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    int randomNumber, guess;

    
    srand(time(NULL));
    randomNumber = rand() % 20 + 1;

    printf("Guess a number between 1 and 20:\n");

    while (1) {
        scanf("%d", &guess);

        
        if (guess < 1 || guess > 20) {
            printf("That number's out of range!  Try another!\n");
            continue;
        }

        
        if (guess < randomNumber) {
            printf("That's too low!  The number was %d!\n", randomNumber);
            break;
        } else if (guess > randomNumber) {
            printf("That's too high!  The number was %d!\n", randomNumber);
            break;
        } else {
            printf("That is correct!  Good job!\n");

            
            for (int i = 0; i < guess; i++) {
                printf("That is correct!  Good job!\n");
            }
            break;
        }
    }

    return 0;
}

