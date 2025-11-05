import java.util.Scanner;

public class Activity1
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);

		System.out.println("Enter a year:");
		int year = console.nextInt();
		boolean isLeapYear = (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);
		System.out.println(year+ " is a leap year? " + isLeapYear);

	}//end of method main
}// end of class 