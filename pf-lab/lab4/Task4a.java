import java.util.Scanner;

public class Task4a
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);

		System.out.println("Enter two integers, seperated by a space: ");
		int num1 = console.nextInt();
		int num2 = console.nextInt();
		int max;
		if(num1 > num2)
			max = num1;
		else 
			max = num2;

		System.out.println("The bigger number is " + max);

	}
}