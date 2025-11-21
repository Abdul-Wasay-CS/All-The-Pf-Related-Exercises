import java.util.Scanner;
import java.util.Arrays;
public class sortedCheckOnArray
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number of elements: ");
		int size = input.nextInt();

		int arr[] = new int[size];

		System.out.print("Enter array elements: ");
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = input.nextInt();
		}
		if(isSorted(arr))
		{
			System.out.print("Array is already Sorted: ");
			for(int i = 0; i<arr.length; i++)
			{
				System.out.printf("%3d",arr[i]);
			}	
		}
		else
		{
			System.out.println("Array is not already sorted");
			Arrays.sort(arr);
			System.out.print("The Sorted array is: ");
			for(int n : arr)
			{
				System.out.printf("%2d",n);
			}
		}//end of else
		System.out.println();//an extra line , for the custom runjava function in shell
	}//end of main

	public static boolean isSorted(int arr[])
	{
		boolean sortedFlag = true;

		for(int i = 0; i<arr.length; i++)
			for(int j = i ; j<arr.length; j++)
				if(arr[i]>arr[j])
				{
					sortedFlag = false;
					return sortedFlag; //to avoid unnecessary itirations
				}

		return sortedFlag;
	}
}