import java.util.Scanner;

public class Task4c
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);

		System.out.println("Enter an integer:");
		int x = console.nextInt();

		if (x > 0)
			System.out.println("1");
		else if (x < 0)
			System.out.println("-1");
		else
			System.out.println("0");
		
	}
}