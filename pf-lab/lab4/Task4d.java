import java.util.Scanner;

public class Task4d
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);

		System.out.println("Enter three integers, seperated by a space: ");
		int num1 = console.nextInt();
		int num2 = console.nextInt();
		int num3 = console.nextInt();
		int min = 0;

		if(num1 < num2)
		{	if(num1 < num3)
			{
				min = num1;
			}
		}

		else if(num2 < num3)
		{	if(num2 < num3)
			{	
				min = num2;
			}
		}
		else if(num3 < num1)
		{
			if(num3 < num2)
			{
				min = num3;
			}
		}
	
		System.out.println("The minimum number is " + min);

	}
}