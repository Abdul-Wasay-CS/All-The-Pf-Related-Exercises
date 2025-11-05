import java.util.Scanner;

public class Task6
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int number;
		int maxIndex=1, max = 0;

		for(int i = 1;; i++)
		{
			number =  input.nextInt();
			if(number == 0)
				break;
			if(number > max )
			{
				max = number;
				maxIndex = i;
			}
		}

		System.out.println("The index of the largest number is " + maxIndex);
	}
}