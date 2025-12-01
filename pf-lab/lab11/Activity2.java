import java.util.*;

public class Activity2
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while(true)
		{
			try{
				System.out.print("Enter an Integer  Value ");
				int n = input.nextInt();
				System.out.println("Factorial = "+factorial(n));
				break;
			}
			catch(InputMismatchException ex)
			{
				System.out.println("You have entered An invalid input ");
				System.out.println("Try again");
                                input.nextLine();
			}
		}//while
	}//main

	static long factorial(int n)
	{
		long f=1;
		for(int i =1; i<=n; i++)
			f= f*i;
		return f;
	}
}