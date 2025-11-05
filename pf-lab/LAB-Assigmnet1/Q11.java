import java.util.Scanner;

public class Q11
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		int unitsConsumed,unitsRate = 1,electricityBill,lineRent = 200;

		System.out.println("Enter the number of units consumed this month: ");
		unitsConsumed = input.nextInt();

		if(unitsConsumed >= 0)
		{
			if(unitsConsumed > 600)
				unitsRate = 8;
			else if(unitsConsumed >= 400 && unitsRate <= 600)
				unitsRate = 5;
			else
				unitsRate = 3;

			electricityBill = unitsConsumed*unitsRate + lineRent;
			System.out.println("Your electricity bill is :" + electricityBill);
		}
		else
		{
			System.out.println("Invalid input!!!");
		}
	}
}