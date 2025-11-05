
package labassigment2;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

	System.out.print("Enter the number to find its factorial:");
	int num = input.nextInt();
	long fact = 1;
	for(int i = 1; i <= num ; i++)		
	{
            fact *= i;
	}

	System.out.println("\nThe factorial of "+ num + " is " + fact);        
    }
    
}
