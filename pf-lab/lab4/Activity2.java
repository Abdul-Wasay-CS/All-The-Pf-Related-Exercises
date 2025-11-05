import java.util.Scanner;

public class Activity2
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);

		System.out.println("Enter an integer ");
		int number = console.nextInt();

		if( number % 5 == 0 ) 
			System.out.println("HiFive");
		if( number % 2 == 0)
			System.out.println("HiEven");
	}//end of method main
}//end of class