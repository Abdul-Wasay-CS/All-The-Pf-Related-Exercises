import java.util.Scanner;

public class Activity5
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		int number, sum = 0, count;
		
		for(count = 0 ; count < 5 ; count++)
		{
			number = input.nextInt();
			sum += number;
		}	
		System.out.println("The sum is " + sum);
	}
}