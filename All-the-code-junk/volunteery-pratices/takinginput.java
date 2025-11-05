import java.util.*;

public class takinginput
{
	public static void main(String [] args)
	{
		String name;
		int age;

		// Takes name and age from user. 

		Scanner input =  new Scanner(System.in);
		System.out.println("Enter your name:");
		name = input.next();
		System.out.println("Enter your age:");
		age = input.nextInt();

		// Outputs the entered values in the folowing format.

		System.out.printf("Hello , %s.You are %d years old.",name,age);


	}
}