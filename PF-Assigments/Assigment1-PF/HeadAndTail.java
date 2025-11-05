import java.util.Scanner;

public class HeadAndTail
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);

		System.out.println("Menu\n0.Heads\n1.Tails");
		System.out.println("Enter a guess:");
		int guess = console.nextInt();

		// generating a random number ( between 0 ---> 1 ) and
		// rounding it off to the nearsest integer.

		int result = (int)(Math.round(Math.random()));

		if (result == guess)
			System.out.println("Your guess was correct.");
		else 
			System.out.println("Your guess was wrong.");
	}
}