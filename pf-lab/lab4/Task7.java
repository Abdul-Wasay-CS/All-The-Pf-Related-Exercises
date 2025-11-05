import java.util.Scanner;

public class Task7
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);

		System.out.println("Enter the length and width of the first rectangle: ");
		double lenghthRectangle1 = console.nextDouble();
		double widthRectangle1 = console.nextDouble();

		double areaRectangle1 = lenghthRectangle1*widthRectangle1;

		System.out.println("Enter the length and width of the second rectangle: ");
		double lenghthRectangle2 = console.nextDouble();
		double widthRectangle2 = console.nextDouble();

		double areaRectangle2 = lenghthRectangle2 * widthRectangle2;

		if(areaRectangle1 > areaRectangle2)
			System.out.printf("The rectangle with length %.2f and width %.2f has greater Area", lenghthRectangle1,widthRectangle1);

		else if(areaRectangle2 > areaRectangle1)
			System.out.printf("The rectangle with length %.2f and width %.2f has greater Area", lenghthRectangle2,widthRectangle2);
		else
			System.out.println("Both the rectangles are equal in Area.");

		 
	}
}