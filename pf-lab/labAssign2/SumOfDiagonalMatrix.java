import java.util.Scanner;

public class SumOfDiagonalMatrix
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the length of the matrix you want to enter: ");
		int size = input.nextInt();

		double[][] matrix = new double[size][size];

		System.out.printf("Enter elements of a %d-by-%d matrix, row by row: \n",size,size);

		for (int i =0; i<matrix.length; i++) 
			for(int j=0; j<matrix[i].length; j++)
				matrix[i][j] = input.nextDouble();

		double diagSum = sumMajorDiagonal(matrix);


		System.out.println("The sum of the elemetns of the major diagonal is:"+diagSum);
	}

	public static double sumMajorDiagonal(double[][] arr)
	{
		double sum=0;

		for(int i =0; i<arr.length; i++)
			for(int j=0; j<arr[i].length; j++)
				if(i == j)
					sum += arr[i][j];


		return sum;
	}
}