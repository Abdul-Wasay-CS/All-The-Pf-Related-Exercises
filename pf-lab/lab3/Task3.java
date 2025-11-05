import java.util.*;

public class Task3
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);

		System.out.print("Enter the number of students in the first class:");
		int a = console.nextInt();

		System.out.print("\nEnter the number of students in the second class:");
		int b = console.nextInt();

		System.out.print("\nEnter the number of students int the third class:");
		int c = console.nextInt();

		int totalStudents = a + b + c;
		int desks = totalStudents/2;
		int Totaldesks = desks + (totalStudents % 2);  // adds a desk for a single student if the total number of students is odd.
		System.out.print("\nThe number of desks required are:"+Totaldesks);

	}
}