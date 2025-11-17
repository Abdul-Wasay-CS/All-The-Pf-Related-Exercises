import java.util.Scanner;

public class Activity2
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int integerArr[] = new int[5];

		System.out.println("Enter array elements:");

		for(int i =0; i<5; i++)
		{
			integerArr[i] = input.nextInt();
		}

		int sum = findSum(integerArr);

		System.out.println("The sum of the elements is: " + sum);

	}

	public static int findSum(int arr[])
	{
		int s=0;

		for(int x : arr)
			s += x;

		return s;
	}
}