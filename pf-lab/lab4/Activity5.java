import java.util.Scanner;

public class Activity5
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);

		int number;
		System.out.println("Enter 1, 2, or 3: ");
		number = console.nextInt();

		switch (number)
		{
			case 1:
				System.out.println("You entered 1.");
				break;
			case 2:
				System.out.println("You entered 2.");
				break;
			case 3:
				System.out.println("You entered 3.");
				break;
			default:
				System.out.println("That's not 1, 2, or 3!");
		}//end of switch body
	}//end of method main
}//end of class