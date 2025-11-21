import java.util.Scanner;
import java.util.Arrays;

public class CheckForConsectuiveFourElements
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the Number of elements you want in the array: ");
		int arrSize = input.nextInt();
		int[] testList = new int[arrSize];
		System.out.print("Enter the Values: ");
		for(int i=0; i<testList.length; i++)
		{
			testList[i] = input.nextInt();
		}

		if(isCosecutiveFour(testList))
			System.out.println("The list has consecutive fours");
		else
			System.out.println("The list has no consecutive fours");

	}//main

	public static boolean isCosecutiveFour(int[] list)
	{
		boolean isCosective = false;
		for(int i =0 ; i<(list.length-3); i++)
		{	
			if(list[i] == list[i+1] && list[i+1] == list[i+2]
			 	&& list[i+2] == list[i+3] )
			{
				isCosective = true;
				return isCosective; //to avoid extra itirations.
			}
		}

		return isCosective;
	}
}//class