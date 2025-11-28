import java.util.*;

public class PattternPrintingUsingRecursion
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		printPiramid(5);
		System.out.println();
		printRightAlignedTriangle(5);
		System.out.println();
		printLeftAlignedTriangle(5);
		System.out.println();
		printFlippedTriangle(5);
	}

	public static void printPiramid(int n)
	{
		if(n>0)
			printPiramid(n-1);
		
		for(int i=1; i<=5-n; i++)
			System.out.print(" ");
		for(int i =1; i<=n; i++)
			System.out.print("* ");
		System.out.println();
	}

	public static void printRightAlignedTriangle(int n)
	{
		if(n>1)
			printRightAlignedTriangle(n-1);
		
		for(int i=1; i<=5-n; i++)
			System.out.print("  ");
		for(int i =1; i<=n; i++)
			System.out.print(" *");
		System.out.println();
	}	

	public static void printLeftAlignedTriangle(int n)
	{
		if(n>1)
			printLeftAlignedTriangle(n-1);

		for(int i=1; i<=n; i++)
			System.out.print("* ");
		System.out.println();
	}

	public static void printFlippedTriangle(int n)
	{

		for(int i=n; i>=1; i--)
			System.out.print("* ");
		System.out.println();
		if(n>1)
			printFlippedTriangle(n-1);
	}
}//class