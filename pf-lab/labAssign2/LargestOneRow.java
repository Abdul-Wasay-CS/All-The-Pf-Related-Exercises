import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class LargestOneRow
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[][] matrix = new int[4][4];

		fillMatrixWithOneAndZeros(matrix);

		printArray(matrix);

		int largestRow = findLargestRow(matrix);

		int largestColumn = findLargestColumn(matrix);

		System.out.printf("The largest Row index: %d\n",largestRow);

		System.out.printf("The largest Column index : %d\n",largestColumn); 
	}//main

	public static void printArray(int[][] array)
	{
		for(int i=0; i< array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
				System.out.printf("%6d",array[i][j]);
			System.out.println();
		}
	}


	public static void fillMatrixWithOneAndZeros(int[][] matrix)
	{
		Random random = new Random();

		for(int i=0; i<matrix.length; i++)
			for(int j=0; j<matrix[i].length; j++)
				matrix[i][j] = random.nextInt(2);

	}

	public static int findLargestRow(int[][] matrix)
	{
		int higestOneCount= 0;
		int higestOneRowIndex =0;
		for(int i=0; i<matrix.length; i++)
		{
			int count =0;
			for(int j=0; j<matrix[i].length; j++)
				if(matrix[i][j] == 1)
					count++;

			if(count>higestOneCount)
			{
				higestOneCount = count;
				higestOneRowIndex = i;
			}
		}

		return higestOneRowIndex;
	}

	public static int findLargestColumn(int[][] matrix)
	{
		int highestCount= 0;
		int highestColumnIndex = 0;

		for(int i=0; i<matrix[0].length; i++)
		{
			int count =0; 

			for(int j=0; j<matrix.length; j++)
				if(matrix[j][i]==1)
					count++;

			if(count > highestCount)
			{
				highestCount = count;
				highestColumnIndex = i;
			}
		}

		return highestColumnIndex;
	}//largestColumn
}//class