import java.util.Scanner;

public class Task4b
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);

		System.out.println("Enter two intger:");
		int num1 = console.nextInt();
		int num2 = console.nextInt();
		int min;
		if(num1 < num2)
			min = num1;
		else 
			min = num2;

		System.out.println("The smaller value is "+ min);


	}
}