import java.util.Scanner;

public class Task9
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);

		System.out.println("Try to Enter the  number of pennies,nickels,dimes and quarters that can be combined to make one exactly complete dollar:");
		int pennies = console.nextInt();
		int nickels = console.nextInt();
		int dimes = console.nextInt();
		int quarters = console.nextInt();

		// converting the coins to their respective dollar amounts and then adding them and saving the result in combinedEnteredAmount.


		double combinedEnteredAmount= pennies*0.01 + nickels*0.05 + dimes*0.10 + quarters*0.25;

		if(combinedEnteredAmount == 1)
			System.out.println("Congrats! you won the guessing game!!!");
		else if (combinedEnteredAmount > 1)
			System.out.println("Your entered amount was greater than one dollar.");
		else 
			System.out.println("Your entered amount was less than one dollar.");

	}
}