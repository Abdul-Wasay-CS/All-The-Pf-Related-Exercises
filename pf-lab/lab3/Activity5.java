import java.util.Scanner;

public class Activity5
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in); // choose object name as console because it looks more formal.

		System.out.print("Enter purchase amount: ");
		double purchaseAmount = console.nextDouble();

		double tax = purchaseAmount * 0.06;

		System.out.println("\nSales tax is $"+(int)(tax * 100)/100.0); // demomstrates explicit and imiplicit conversion.
		
	}
}