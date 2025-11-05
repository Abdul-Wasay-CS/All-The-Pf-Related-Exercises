import java.util.Scanner;

public class Q13
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		int number;

		System.out.println("Enter a number:");
		number = input.nextInt();

		// unfortunately conditional operator returns the result, so a plain S.O.P gives an error

		String isDivisible = (number%4 == 0)?"Divisible":"not Divisible";

		System.out.printf("%d is %s by 4",number,isDivisible);

	}
}