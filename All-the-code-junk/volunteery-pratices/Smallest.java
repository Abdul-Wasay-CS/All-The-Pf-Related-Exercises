import java.util.Scanner;

public class Smallest
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the three numbers:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();

		int smallestnum = num1;

		if(num2 < smallestnum)
			smallestnum = num2;
		else if(num3 < smallestnum)
			smallestnum = num3;

		System.out.println("The smallest num is " + smallestnum);


		
	}
}