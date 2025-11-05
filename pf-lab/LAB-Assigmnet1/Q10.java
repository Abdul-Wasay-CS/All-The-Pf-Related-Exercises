import java.util.Scanner;

public class Q10
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		int baseSalary,finalSalary = 0;

		System.out.println("Enter your Salary: ");
		baseSalary = input.nextInt();

		if(baseSalary >= 0)
		{
			if(baseSalary >= 30000)
				finalSalary = baseSalary - (int)(0.08*baseSalary);
			else if(baseSalary >= 15000 && baseSalary < 30000)
				finalSalary = baseSalary - 1000;
			else 
				finalSalary = baseSalary;


			System.out.print("Your Final Salary is: "+ finalSalary);
		}
		else
		{
			System.out.println("Invalid Input!!!");
		}
	}//end of method main
}// end of class