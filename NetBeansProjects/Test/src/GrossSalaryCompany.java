import java.util.Scanner;
public class GrossSalaryCompany {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        double hoursWorked,hourlyRate,grossPay;
        
        for(int i = 1; i <= 3; i++)
        {
            System.out.println("\nEnter the employee "+i+"'s Hours worked last week:");
            hoursWorked = input.nextDouble();
            System.out.println("Enter the employee "+i+"'s Hourly Rate:");
            hourlyRate = input.nextDouble();

            if(hoursWorked > 40)
            {
                grossPay = 40*hourlyRate + ( (1.5*hourlyRate)*(hoursWorked-40) );
                System.out.printf("\nEmployee "+i+"'s Gross pay is $%.2f",grossPay);    
            }
            else if (hoursWorked <= 40)
            {
                grossPay = hourlyRate*hoursWorked;
                System.out.printf("Employee "+i+"'s Gross pay is $%.2f",grossPay);
            }
            else
                System.out.println("Invalid input");
            
        }
    } 
}
