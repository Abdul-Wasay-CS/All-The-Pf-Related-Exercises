import java.util.Scanner;

public class MulitplesOf3And5
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int sum = 0;
		for(int i = 1; i< 1000 ; i++)
		{
			if(i%3 == 0 || i%5 == 0)
				sum += i;
		}
		System.out.println("The Sum of the numbers is:" + sum);
	}
}