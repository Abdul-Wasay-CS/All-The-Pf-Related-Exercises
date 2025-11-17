import java.util.Scanner;

public class Task2
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr = new int[10];
		System.out.println("Enter the elements of the array");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = input.nextInt();
		}
		modify(arr);
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println("arr["+i+"] "+arr[i]);
		}

	}

	public static void modify(int arr[])
	{
		for(int i= 0 ; i< arr.length; i++)
		{
			arr[i] *= 3;
		}
	}
}