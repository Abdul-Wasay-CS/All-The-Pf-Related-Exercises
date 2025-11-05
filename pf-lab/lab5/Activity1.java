import java.util.Scanner;

public class Activity1
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);

		System.out.println("\nWhat is " + number1 + " + "+ number2 + "? ");
		int answer = input.nextInt();

		while(number1 + number1 == answer)
		{
			System.out.println("Wrong answer. Try again. what is "+ number1 + " + " +number2 + "? ");
			answer = input.nextInt();
		}

		System.out.println("You got it!!");
	}
}