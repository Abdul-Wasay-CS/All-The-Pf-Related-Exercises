import java.util.Scanner;

public class Activity4
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter a number a to choose Menu: ");
		System.out.println("1: For input and display the Array ");
		System.out.println("2: For searching Element in an Array ");
		System.out.println("3: FOr largest and Smallest element in the array");
		System.out.println("4: For copying data to another array");

		int choice = input.nextInt();

		switch(choice)
		{
			case 1:
				int a1[] = new int[10];
				input(a1);
				display(a1);
				break;
			case 2:
				a1 = new int[10];
				input(a1);
				System.out.println("Enter the element to be searched: ");
				int searchKey = input.nextInt();
				search(searchKey, a1);
				break;
			case 3:
				a1 = new int[10];
				input(a1);
				largest(a1);
				smallest(a1);
				break;
			case 4:
				a1 = new int[10];
				input(a1);
				int[] copiedArray = new int[10];
				copyData(a1, copiedArray);
				display(copiedArray);
				break;
			default:	
				System.out.println(" You entered invalid number");
		}
	}//main

	public static void input(int arr[])
	{
		System.out.println("Enter array elements");
		for(int i = 0; i<arr.length; i++)
			arr[i] = input.nextInt();	
	}//input


	public static void display(int arr[])
	{
		for(int i =0 ;i<arr.length; i++)
			System.out.println("arr["+i+"] = " + arr[i]);
	}

	public static void search(int searchKey, int arr[])
	{
		boolean isFound = false;
		int foundIndex= 0;
		for(int i =0 ; i<arr.length; i++)
			if(arr[i] == searchKey)
			{
				isFound = true;
				foundIndex = i;
				break;
			}

		if(isFound)
		{
			System.out.println("Element Found");
			System.out.println("Index of element = " + foundIndex);
		}		
		else
		{
			System.out.println("Element Not Found");
		}
	}//search

	public static void largest(int arr[])
	{
		int largestElement = arr[0],largestIndex = 0;
		for(int i = 0 ;i <arr.length; i++)
			if(arr[i] > largestElement)
			{
				largestElement = arr[i];
				largestIndex = i;
			}
		int temp = arr[9];
		arr[9] = largestElement;
		arr[largestIndex] = temp;
		System.out.println("largest element = "+arr[9]);
	}
	public static void smallest(int arr[])
	{
		int smallestElement = arr[0], smallestIndex=0;

		for(int i = 0 ;i < arr.length; i++)
			if(arr[i] < smallestElement)
			{
				smallestElement = arr[i];
				smallestIndex = i;
			}
		int temp = arr[0];
		arr[0] = smallestElement;
		arr[smallestIndex] = temp;
		System.out.println("Smallest Element = " + arr[0]);
	}
	public static void copyData(int arr[], int copiedArray[])
	{
		for(int i=0 ;i<arr.length; i++)
			copiedArray[i] = arr[i];
	}

}//class