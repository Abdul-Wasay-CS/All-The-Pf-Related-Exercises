import java.util.Scanner;

public class Q9
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first number:	");
		int num1 = input.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = input.nextInt();

		System.out.println("Menu.\n1.Addition\n2.Subtraction.\n3.Multiplication.\n4.Division");
		System.out.println("Enter your choice: ");
		int operator = input.nextInt();

		switch(operator)
		{
			case 1:
				System.out.println(num1 +" + " + num2 +" = " +(num1+num2) );
				break;
			case 2:
				System.out.println(num1 + " - " + num2 + " = " + (num1-num2) ); 
				break;
			case 3:
				System.out.println(num1 + " * " + num2 + " = " + (num1*num2) ); 
				break;
			case 4:
				System.out.printf( "%d / %d  = %.3f",num1,num2,((double)num1/num2)); 
				break;
						
			default:
				System.out.println("Invalid input!");
		}
	}
}