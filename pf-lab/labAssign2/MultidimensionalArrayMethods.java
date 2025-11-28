package usefullStuff;
import java.util.Scanner;
import java.util.Arrays;
public class MultidimensionalArrayMethods
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//can generate input mismatch exception
		System.out.println("Enter the number of rows in the 2D array: ");
		int rowSize = input.nextInt(); 
		System.out.println("Enter the number of elmenets in each row of the 2D array");
		int columnSize = input.nextInt();
		int[][] array = new int[rowSize][columnSize];

		putDataInArray(array, input);//done
		putRandomValueInArray(array);//done
		printArray(array);//done
		shuffleArray(array);//done
		findAndPrintLargestElement(array);//done
		findAndPrintSumOfAllElements(array);//done
		findAndPrintLargestRow(array);//done
		findAndPrintColumnSum(array);//on this
	}

	public static void putDataInArray(int[][] array, Scanner input)
	{
		for(int i=0; i<array.length; i++)
		{
			System.out.printf("Enter the Elements of Row %d: ",i+1);
			for(int j=0; j<array[i].length; j++)
				array[i][j] = input.nextInt();
			System.out.println();
		}
		printArray(array);
	}//putDataInArray

	public static void putRandomValueInArray(int[][] array)
	{
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
				array[i][j] = (int)(Math.round(Math.random()*50));
		}

		printArray(array);
	}

	public static void printArray(int[][] array)
	{
		for(int i=0; i< array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
				System.out.printf("%6d",array[i][j]);
			System.out.println();
		}
	}

	public static void shuffleArray(int[][] array)
	{
		System.out.println("Before shuffle, Array looks like this ");
		printArray(array);

		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				int columnShuffleIndex = (int)(Math.random()*(array[i].length-1));
				int rowShuffleIndex = (int)(Math.random()*(array.length-1));
				//swapped this array index to a random one
				int temp = array[i][j];
				array[i][j] =  array[rowShuffleIndex][columnShuffleIndex];
				array[rowShuffleIndex][columnShuffleIndex] = temp;
			}
		}

		System.out.println("After shuffle: ");
		printArray(array);
	}

	public static void findAndPrintLargestElement(int[][] array)
	{
		int highestElement =0;
		int highestElementIndex = 0;

		for(int i=0; i<array.length; i++)
			for(int j=0; j<array[i].length; j++)
				if(array[i][j]>highestElement)
				{
					highestElement = array[i][j];
					highestElementIndex = i;
				}

		System.out.println("The largest element is "+highestElement+" And its index is "+highestElementIndex);

	}

	public static void findAndPrintSumOfAllElements(int[][] array)
	{
		int sum=0;
		for(int i =0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
				sum += array[i][j];
		}

		System.out.println("The sum of the Elemetns of the elments is: "+sum);
	}

	public static void findAndPrintLargestRow(int[][] array)
	{
		int largestRow =0;
		int largestSum = 0;
		for(int i =0; i<array.length; i++)
		{
			int rowSum = 0;

			for(int j=0; j<array[i].length; j++)
				rowSum += array[i][j];

			if(rowSum > largestSum)
			{
				largestSum = rowSum;
				largestRow= i+1;
			}
		}	

		System.out.println("The row with the largest sum is row "+largestRow);
	}

	public static void findAndPrintColumnSum(int[][] array)
	{
		for(int i=0; i<array[0].length; i++)
		{
			int sum = 0;
			for(int j=0; j<array.length; j++)
				sum += array[j][i];

			System.out.println("The Sum of the column "+(i+1)+" is "+sum);
		}
	}
}//class