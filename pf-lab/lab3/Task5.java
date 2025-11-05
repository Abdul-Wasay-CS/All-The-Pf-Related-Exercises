import java.util.*;

public class Task5
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);

		double cartonSpace = 3.78;
		double prodCostPerLiter = 0.38;
		double profitPerCarton = 0.27;
		// takes amount of milk produced from the user.
		System.out.print("Enter the total amount of milk ( in liters ) produced in the morning: ");
		double  milkProduced = console.nextDouble(); 

		int numberOfCartons = (int)(Math.round(milkProduced/cartonSpace));
		
		System.out.println(numberOfCartons+"\n cartons are needed for holding " + milkProduced + "liters of milk");
		double totalProdCost = milkProduced*prodCostPerLiter;
		
		System.out.println("The cost for producing "+ milkProduced + "liters of milk is " + totalProdCost);
		double totalProfit = profitPerCarton * numberOfCartons;
		
		System.out.println("The profit made for "+ numberOfCartons + " cartons of milk is : " + totalProfit);




	}
}