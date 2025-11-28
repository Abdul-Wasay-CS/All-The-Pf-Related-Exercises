import java.util.Scanner;
import java.util.Arrays;

public class ArraysNewMethods
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {


		System.out.println("Enter the size of the array: ");
		int size = input.nextInt();

		int arr[] = new int[size];
		System.out.print("Enter the Elements of the array: ");
		for(int i=0; i<arr.length; i++)
			arr[i] = input.nextInt();

		//till here, array intialized
		int choice;
		do{
			choice = 0;

			System.out.println("\t\t\tMain Menu.");
			System.out.println("count the number of occurence of an element."
				+"\nPartition Array"
				+"\nFind the frequencies of the elements"
				+"\nDo circular movement"
				+"\nShift cicular movement");

			System.out.print("Enter your choice: ");
			choice = input.nextInt();

			switch(choice)
			{
				case 1:
					count(arr);
					break;
				case 2:
					partition(arr);
					break;
				case 3:
					duplicates(arr);
					break;
				case 4:
					circular(arr);
					break;
				case 5:
					shiftCicular(arr);
					break;
				case 6:
					return;
				default:
					System.out.println("Invalid Choice, Please enter a valid choice.");
			}
		}while(choice != 0);


		System.out.print("Goodbye");
	}//main

	public static void count(int [] arr)
	{
		int count = 0;
		System.out.print("Enter the number whose occurence you want to find in the given array");
		int x = input.nextInt();

		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == x)
				count++;
		}

		System.out.println(x+" occurs "+ count +" number of times in the given array.");
	}

	public static void partition(int[] arr)
	{
		int x = arr[0];
		int temp, index = 1;
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]<x)
			{
				temp = arr[index]; // Store the element at index
				arr[index] = arr[i]; // Move smaller element to index
				arr[i] = temp; // Put the element originally at index back at i
				index ++;
			}

		}//end of for
		arr[0] = arr[index-1];
		arr[index - 1] = x;
		//display the new matrix
		for(int i =0; i<arr.length; i++)
		{
			System.out.println(arr[i]+", ");
		}
	}

	public static void duplicates(int[] arr)
	{
		int[] unique = new int[10];

		for(int i=0; i<arr.length; i++)
		{
			int count = 0;
			for(int j=0; j<arr.length; j++)
				if(arr[i] == arr[j])
					count++;

			System.out.println(arr[i]+" occurs " + count +" times ");
		}
	}

	public static void circular(int[] arr)
	{
		int[] cicularArray = new int[arr.length];
		for(int i =0; i<arr.length; i++)
		{
			cicularArray[i] = arr[(i+1)%arr.length] + arr[(i+2)%arr.length];	//modulus by length, to avoid overflow
		}

		printArray(cicularArray);

	}

	public static void shiftCicular(int[] arr)
	{
		int[] shiftedArray = new int[arr.length];
		for(int i=0; i<arr.length; i++)
		{
			shiftedArray[i] = arr[(i+2)%arr.length];
		}

		printArray(shiftedArray);
	}

	public static void printArray(int[] arr)
	{
		for(int i =0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}