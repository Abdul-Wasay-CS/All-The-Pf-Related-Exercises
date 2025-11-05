import java.util.Scanner;

public class Task5
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);

		System.out.println("Enter three integers: ");
		int num1 = console.nextInt();
		int num3 = console.nextInt();
		int num2 = console.nextInt();
		int numOfEqualIntegers = 0;

		if(num1 == num2)
		{	
			numOfEqualIntegers=2;
			if(num1 == num3)
				numOfEqualIntegers=3;
		}
		else if(num2 == num3)
		{
			numOfEqualIntegers = 2;
			if(num2 == num1)
				numOfEqualIntegers = 3;
		}
		else if(num1 == num3)
		{
			numOfEqualIntegers = 2;
			if(num2 == num1)
			{
				numOfEqualIntegers = 3;
			}
		}
		System.out.println("The number of equal integers: "+numOfEqualIntegers);

	}
}