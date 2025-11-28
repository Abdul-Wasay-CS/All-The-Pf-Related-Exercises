import java.util.Scanner;
import java.util.Arrays;

public class MultiplyingMatrices
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[][] matrix1 = new int[3][4];


		//matrix 1 inputs
		System.out.printf("%40s","Matrix 1 Elements\n");
		for(int i =0 ; i<matrix1.length; i++)
		{
			System.out.printf("Enter the values of row %d:",i+1);
			for(int j=0; j<matrix1[i].length; j++)
			{
				matrix1[i][j] = input.nextInt();
			}
			System.out.println();
		}

		int[][] matrix2 = new int[4][3];

		//matrix 2 inputs

		System.out.printf("%40s","Matrix 2 Elements\n");
		for(int i =0 ; i<matrix2.length; i++)
		{
			System.out.printf("Enter values of  row %d :",i+1);
			for(int j=0; j<matrix2[i].length; j++)
			{
				matrix2[i][j] = input.nextInt();
			}
			System.out.println();
		}
		System.out.println("The New Matrix is : ");
		int[][] newMatrix = multiplyMatrices(matrix1, matrix2);
		for(int i =0; i<newMatrix.length; i++)
		{
			for(int j=0; j<newMatrix[i].length; j++)
			{
				System.out.printf("%-5d",newMatrix[i][j]);
			}
			System.out.println();
		}
	}//main

	public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2)
	{
		// assumes they are multiplyable
		int r1 = matrix1.length;
		int c1 = matrix1[0].length;
		int c2 = matrix2[0].length;
		int[][] productMatrix = new int[matrix1.length][matrix2[0].length];

		for(int i=0; i<r1; i++)
		{
			for(int j = 0; j<c2; j++)
			{
				int sum = 0;
				for(int k=0; k<c1; k++)
					sum += matrix1[i][k] * matrix2[k][j];
				productMatrix[i][j] = sum;
			}
		}

		return productMatrix;
	}

}