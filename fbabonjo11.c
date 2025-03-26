//Fatoma Babonjo
//
//
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

double trianglehypo(double height, double length);

int main(void)
{
	double height;
	double length;
	double result;


	printf("Enter the triangle's height: ");
	scanf("%lf", &height);

	printf("Enter the triangle's length: ");
        scanf("%lf", &length);
	
	result = trianglehypo(height, length);

	printf("Your triangle's hypotenuse is %lf \n" ,result);

	

	return EXIT_SUCCESS;
}

double trianglehypo(double height, double length)
{
	double x = sqrt(pow(height,2)+pow(length,2));
	return x;
}
