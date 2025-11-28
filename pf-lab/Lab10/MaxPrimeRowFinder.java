import java.util.Scanner;

public class MaxPrimeRowFinder
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[][] array = new int[3][4];

		for(int i=0 ; i<array.length; i++)
		{
			System.out.print("Enter the elements of Row #"+(i+1));

			for(int j=0; j<array[i].length; j++)
				array[i][j] = input.nextInt();
		}


		int maxRowPrimeNum = 0;
		int maxRowPrime = 1;
		for(int i=0; i<array.length; i++)
		{
			int primeCount = 0;
			for(int j=0; j<array[i].length; j++)
				if(isPrime(array[i][j]))
					primeCount++;

			if(primeCount > maxRowPrimeNum)
			{
				maxRowPrimeNum = primeCount;
				maxRowPrime = i+1;
			}
		}

		int maxColumnPrimeNum = 0;
		int maxColumnPrime = 1;

		for(int i=0; i<array[0].length; i++)
		{
			int primeCount = 0;
			for(int j=0; j<array.length; j++)
				if(isPrime(array[j][i]))
					primeCount++;

			if(primeCount > maxColumnPrimeNum)
			{
				maxColumnPrimeNum = primeCount;
				maxColumnPrime = i+1;
			}
		}


		if(maxRowPrimeNum > maxColumnPrimeNum)
			System.out.println("The maximum number of prime numbers is in Row #"+maxRowPrime);
		else
			System.out.println("The maximum number of prime numbers is in Column #"+maxColumnPrime);

	}//main

	public static boolean isPrime(int n)
	{
		boolean prime = true;

		for(int i =2; i<Math.sqrt(n); i++)
		{
			if(n%i == 0)
			{
				prime = false;
				break;
			}
		}

		return prime;
	}//end of isPrime
}