import java.util.Scanner;

public class Task8
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		int currentNumber,previosNumber = 0, c=-1;

		while(true)
		{
			currentNumber=input.nextInt();
			if(currentNumber == 0)
				break;
			if(currentNumber>previosNumber)
				c++;
			previosNumber = currentNumber;
		} 

		System.out.println("Greater count: "+c);
	}
}