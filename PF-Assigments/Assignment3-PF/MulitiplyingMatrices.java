import java.util.Scanner;
import java.util.Arrays;

public class MulitiplyingMatrices
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of rows of Matrix 1: ");
		int r1 = input.nextInt();

		System.out.print("Enter the number of coloumns of matrix 1: ");
		int c1 = input.nextInt();
		int[][] matrix1 = new int[r1][c1];

		//matrix 1 inputs
		for(int i =0 ; i<matrix1.length; i++)
		{
			for(int j=0; j<matrix1[i].length; j++)
			{
				System.out.printf("Enter value number %d of %d row :",j,i);
				matrix1[i][j] = input.nextInt();
			}
			System.out.println();
		}

		System.out.print("Enter the number of row of Matrix 2: ");
		int r2 = input.nextInt();

		System.out.print("Enter the number of coulumn of Matrix 2: ");
		int c2 = input.nextInt();

		int[][] matrix2 = new int[r2][c2];

		//matrix 2 inputs

		for(int i =0 ; i<matrix2.length; i++)
		{
			for(int j=0; j<matrix2[i].length; j++)
			{
				System.out.printf("Enter value number %d of %d row :",j,i);
				matrix2[i][j] = input.nextInt();
			}
			System.out.println();
		}

		if(c1 == r2)
		{
			int[][] newMatrix = multiplyMatrices(matrix1, matrix2);
			for(int i =0; i<newMatrix.length; i++)
			{
				for(int j=0; j<newMatrix[i].length; j++)
				{
					System.out.printf("%3d",newMatrix[i][j]);
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("The matrixes are not Multiplyable");
		}


	}//main

	public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2)
	{
		// assumes they are multiplyable
		int[][] productMatrix = new int[matrix1.length][matrix2[0].length];

		for(int i=0; i<productMatrix.length; i++)
		{
			for(int j = 0; j<productMatrix[i].length; j++)
			{
				productMatrix[i][j] = multiplyRowAndColoumn(i,j,matrix1,matrix2);
			}
		}

		return productMatrix;
	}
	public static int multiplyRowAndColoumn(int i,int j, int[][] matrix2, int[][] matrix1)
	{
		//i remains same, and j increments one after each interation
		//product[0][0]=matrix1[i][j]*matrix2[j][i]+matrix1[0][1]*matrix2[1][0]+matrix1[0][2]*matrix2[2][0];
		int sum = 0;

		for(int s = 0; s<matrix2.length; s++)
		{
			int product = matrix1[i][s]*matrix2[s][j];
			sum += product;
		}

		return sum;
	}
}