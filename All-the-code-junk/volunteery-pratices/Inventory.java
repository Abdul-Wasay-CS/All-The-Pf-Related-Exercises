import java.util.*;

public class Inventory
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		int n;  						// n = number of products

		//	Asking number of products from the user, to declare arrays accordingly.

		do{
		System.out.print("Enter the number of product: ") ;
		n = console.nextInt();
		}while(n<0);       

		// The above loop forces a valid number of products.By reasking for the number of products upon negative input.

		int[] quantity = new int[n];
		String[] prodName = new String[n];
		double[] unitPrice = new double[n];
		double[] totalPrice = new double[n];
		double grandTotal = 0;

		// Deals with zero numeber of product

		if( n == 0 )
		{
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.printf("Grand Total : %.2f\n",0);
		}
		
		// takes the relevant Data from user.

		else
		{
			for( int i = 0; i < n; i++ )
			{
				console.nextLine();
				System.out.print("┃");
				System.out.printf(" Enter product number %d's name:",i+1);
				
				prodName[i] = console.nextLine();       	// takes product name.
				System.out.printf("\nEnter product number %d's quantity:",i+1);
				quantity[i] = console.nextInt();			// takes product quantity.
				System.out.printf("\nEnter product number %d's price per unit:",i+1);
				unitPrice[i] = console.nextDouble();		// takes unitPrice.
				totalPrice[i] = unitPrice[i]*quantity[i];	// calculates totalprice of the current elemnent.
				grandTotal += totalPrice[i];					// Adds total price in the grand price.

			}// end  of for loop body.
			System.out.printf("%-15s %15s %15s %15s","Product","Qty","Unit Price","Total");
			
			for(int i = 0; i < n; i++ )
			{
				System.out.printf("\n%-15s %15d %15.2f %15.2f",prodName[i],quantity[i],unitPrice[i],totalPrice[i]);
			}//end of for loop body
			System.out.println("\n------------------------------------------\n");
			System.out.printf("Grand Total: $%.2f",grandTotal);

		}// end of else body

	}//end of main method 
}//end of class