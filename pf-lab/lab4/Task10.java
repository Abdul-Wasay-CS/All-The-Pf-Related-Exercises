import java.util.Scanner;

public class Task10
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);

		System.out.println("Enter the amount of boooks purchased this month:");
		int purchasedBooksAmount = console.nextInt();
		int points = 0;
		if(purchasedBooksAmount == 1)
			points += 5;
		else if( purchasedBooksAmount == 2)
			points += 15;
		else if( purchasedBooksAmount == 3)
			points += 30;
		else if( purchasedBooksAmount >= 4)
			points += 60;

		System.out.println("You have been awarded "+ points + " points");
	}
}