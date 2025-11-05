import java.util.*;

public class Task2
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n = console.nextInt();
		System.out.print("\nEnter the total number of apples: ");
		int k = console.nextInt();

		int studentsShare = k / n;
		int remApples = k % n;

		System.out.print("\nEach students will get " + studentsShare + "apples");
		System.out.print("\nThe remaining apples will be " + remApples);


	}
}