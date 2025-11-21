import java.util.Scanner;
import java.util.Arrays;

public class MergingSortedArrays
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of elements in the first list: ");
		int arr1Size = input.nextInt();
		int[] arr1 = new int[arr1Size];

		System.out.print("Enter the values of array 1:");

		for(int i = 0; i<arr1.length; i++)
		{
			arr1[i] = input.nextInt();
		}

		System.out.print("Enter the number of elements in the second list: ");
		int arr2Size = input.nextInt();
		int[] arr2 = new int[arr2Size];
		
		System.out.print("Enter the values of array 2:");

		for(int i = 0; i<arr2.length; i++)
		{
			arr2[i] = input.nextInt();
		}

		int[] mergedArray = mergeArrays(arr1, arr2);

		System.out.print("The sorted merged array is: ");

		for(int n: mergedArray)
		{
			System.out.print(n+ " ");
		}
	}//main

	public static int[] mergeArrays(int[] arr1, int[] arr2)
	{
		int[] mergedArray = new int[arr1.length + arr2.length];
		int mergedIndex= 0;
		for(int i =0 ; i<arr1.length; i++)
		{
			mergedArray[mergedIndex] = arr1[i];
			mergedIndex++;
		}

		for(int i =0; i<arr2.length; i++)
		{
			mergedArray[mergedIndex] = arr2[i];
			mergedIndex++;
		}

		Arrays.sort(mergedArray);

		return mergedArray;

	}
}//class