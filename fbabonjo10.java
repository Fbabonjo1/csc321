//Fatoma Babonjo
//

import java.util.Scanner;

public class fbabonjo10
{
	
	public static void main(String[] args) {
		int x = 0, y = 0, i = 0;
		double z = 0, radius = 0, side = 0, height = 0;

		System.out.println("Enter the length of the square. (X)");
		Scanner input = new Scanner(System.in);
		side = input.nextDouble();

		System.out.println("Enter the height of the square (Y)");
		height = input.nextDouble();

		z = squareArea(side, height);

		System.out.println("The area of your square is "+ z + "inches");
	}


	static double squareArea(double side, double height)
	{
		double v = side * height;
		return v;
	}

}
