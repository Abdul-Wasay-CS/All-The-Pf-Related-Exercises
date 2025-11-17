import java.util.Scanner;

public class Task3
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i = 0; i<arr.length; i++)
			arr[i] = input.nextInt();
		int copiedArr[] = new int[10];
		for(int i = arr.length -1; i>= 0; i--)
			copiedArr[9-i] = arr[i];

		System.out.println();

		for(int i = 0 ; i<copiedArr.length; i++)
			System.out.println(copiedArr[i]);
	}
}