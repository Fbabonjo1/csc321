//Fatoma Babonjo
//
//


#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void)
{
	int i, x = 0;
	int arr[10] = {4};

	printf("the value of x is %d and it's address is %p \n",x,&x);

	{
		int y = 10;
	}
	//printf("y's value is %d \n",y);
	
	for(i = 0; i < 10;i++)
	{
		printf("address of arr[%d] = %p \n",arr[i],&arr[i]);
	}

	return EXIT_SUCCESS;
}
