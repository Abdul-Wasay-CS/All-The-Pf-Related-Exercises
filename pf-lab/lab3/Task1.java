import java.util.Scanner;
public class Task1
{
	public static void main(String args[])
	{
        Scanner console = new Scanner(System.in);
		System.out.print("Enter the total amount: ");
		double totalAmount = console.nextDouble();
		int cents = (int)(totalAmount * 100);
		int dollars = (int)(cents /100);

		cents %=100; // puts the remaining cents in cents.
		int remCents = cents;
		int quarters = cents / 25; // extracts the quarter and saves in quarter; 
		cents %= 25;
		int dimes = cents / 10; // extracts the dimes and saves in dimes.
		cents %= 10;
		int nickels = cents / 5; // extracts the pennies and saves in pennies.
		cents %= 5;

		int pennies = cents;

		System.out.printf("\nThe amount is %d dolars, %d cents, %d quarters, %d dimes, %d nickels and %d pennies.",dollars,remCents,quarters,dimes,nickels,pennies);
	}
}