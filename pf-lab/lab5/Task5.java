import java.util.Scanner;

public class Task5
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int max;
		int num1 = input.nextInt();
		max = num1;
		while(true)
		{
			int num2 = input.nextInt();
			if(num1 == 0 || num2 == 0)
				break;
			else if (num2 >max)
				max = num2;

			num1 = num2;
		}
		System.out.println("The maximum number is "+max);
	}
}