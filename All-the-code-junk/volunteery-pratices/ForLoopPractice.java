import java.util.Scanner;

public class ForLoopPractice
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = console.nextInt();
		int f = 0;
		for(int i=2; i <= num/2; i++ )
			if(num%i == 0)
			{	f++;
				break;
			}	

		if(f == 0)
			System.out.println("The entered number is a prime number");
		else 
			System.out.println("The entered number is not a prime number");
	
	}
}