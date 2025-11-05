import java.util.Scanner;

public class Task1d
{
	public static void main(String[] args) 
	{	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num =input.nextInt();
		int cube, sumOfCubes = 0;
		for(int i = 1; i <= num; i++)
		{
			 cube =  i*i*i;
			 sumOfCubes += cube; 
		}
		System.out.println("The sum of cubes of numbers up to "+ num + " is "+ sumOfCubes);
	}
}