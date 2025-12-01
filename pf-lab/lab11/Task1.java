import java.util.*;

public class Task1
{
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);

		int num1, num2, sum;
		while(true)
		{
			try{
				System.out.print("Enter the first Integer value: ");
				num1 = input.nextInt();
				System.out.print("Enter the second integer value: ");
				num2 = input.nextInt();

				sum = num1+num2;

				System.out.print("The sum is "+sum);
				break;
			}
			catch(InputMismatchException ex)
			{
				System.out.println("Invalid input type...");
				System.out.println("Try again.....");
				input.nextLine();
			}
			catch(Exception e)
			{
				System.out.println("Unknown Error occured..");
			}
		}//while
	}//main
}//class