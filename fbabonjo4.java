//fatoma babonjo, lab 4
//


import java.util.Scanner;

public class fbabonjo4
{
	public static void main(String[] args)
	{
		int x = 0;

		System.out.println("Select an option");
		System.out.println("1. BlazBlue");
		System.out.println("2. Persona 4 Arena");
		System.out.println("3. Under Night In-Birth");
		System.out.println("4. RWBY");
		System.out.println("5. Arcana Heart");
		System.out.println("6. Senran Kagura");
		System.out.println("7. Akatsuki Blitzkampf");

		Scanner userinput = new Scanner(System.in);
		x = userinput.nextInt();

		System.out.println("You chose "+ x);
		if (x < 1 || x > 7 ) {
			System.out.println("The choice is too large/small.  Try between 1 and 7.");
		}
	}
}

