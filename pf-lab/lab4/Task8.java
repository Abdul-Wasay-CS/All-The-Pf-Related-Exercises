import java.util.Scanner;

public class Task8
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);

		System.out.println("Enter the date in the following format: month/day/year. each seperated by a space:");
		int month = console.nextInt();
		int day = console.nextInt();
		int year = console.nextInt();

		if(month * day == year)
			System.out.printf("%d/%d/%d is magic!",month,day,year);
		else
			System.out.printf("%d/%d/%d is not magic!",month,day,year);
	}
}