import java.util.*;

public class Q1
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter the pay rate for an hour: ");
		double payRatePerHour = console.nextDouble();	
		
		System.out.print("\nEnter the numbers of hours worked per week: ");
		double hoursWorked = console.nextDouble();

		double baseIncome = payRatePerHour * (hoursWorked * 4); // finds the income 
		double tax =  baseIncome * 0.14;  // finds the tax ( 14 %)
		double taxatedIncome = baseIncome - tax;

		System.out.print("\nYour income before the taxes is $" + baseIncome);
		System.out.print("\nYour income after the taxes is $" + taxatedIncome);
		
		double clothsAndAccessExpenditure =  0.10 * taxatedIncome;
		System.out.print("\nYour clothes and accessories expenditure is :$ " + clothsAndAccessExpenditure);

		double schoolSupppliesExpenditure = 0.01 * taxatedIncome;
		System.out.print("\nYour school supplies expenditure is :$ " + schoolSupppliesExpenditure);

		double remIncome = taxatedIncome - clothsAndAccessExpenditure - schoolSupppliesExpenditure;

		double boundExpen = 0.25 * remIncome;
		System.out.print("\nYour bounds expenses are :$ " + boundExpen);

		int numberOfDollars = (int)boundExpen;
		double parentsBound = numberOfDollars * 0.50;

		System.out.print("\nYour parents bought you bounds worth of : $"+ parentsBound );

	}
}