//Fatoma Babonjo
//


#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
	int i, guess, y;

	srand(time(NULL));
	y = (rand() % 20) + 1;

	printf("Choose a number that's between 1 and 20:");
	
	while (guess < 1 || guess > 20) {
		scanf("%d", &guess);

		if (guess < 1 || guess > 20) {
		puts("The number's out of range.  Try again.");
		continue;
		}

		if (guess < y) {
			printf("That's too low.  The answer was %d \n",y);
		}
		else if (guess > y){
			printf("That's too high.  The answer was %d \n",y);
		}

		else {
			printf("Crangtulations!  You guess the correct number!\n");
			for (int i = 0; i < guess; i++) {
				printf("You win!  This was the number: %d \n",y);
			}
		}
	}
	return EXIT_SUCCESS;
}
