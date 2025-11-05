import java.util.Scanner;

public class Task1c
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of integers you want to input: ");
		int N = input.nextInt();

		int num ,sum =0;

		for(int i =1; i<=N; i++)
		{
			System.out.println("Enter the "+i+ " number: ");
			num = input.nextInt();

			sum += num;
		}	
		System.out.println("The sum of the given numbers is "+ sum);

	}
}