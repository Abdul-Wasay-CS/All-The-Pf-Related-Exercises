import java.util.Scanner;

public class Q12
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the temperature in Celcius:");
		int temperature = input.nextInt();

		if(temperature>= 0)
		{
			if(temperature > 35)
				System.out.println("Hot Day!");
			else if(temperature >= 25 && temperature <= 35 )
				System.out.println("Pleasant Day");
			else if( temperature >= 18 && temperature <=24)
				System.out.println("Cool Day");
			else 
				System.out.println("Cold Day");

		}
		else
		{
			System.out.println("Invalid input!!");
		}
	}
}