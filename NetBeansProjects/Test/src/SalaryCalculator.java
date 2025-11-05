import java.util.Scanner;
public class SalaryCalculator
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of items sold by one salesperson:");
        int itemsSold = input.nextInt();
        
        double itemsValue, totalValue = 0, salary;
        for(int i=1; i <=itemsSold ; i++)
        {
            System.out.println("Enter the "+(i)+" item's value:");
            itemsValue = input.nextDouble();
            
            totalValue += itemsValue;
        }    
        
        salary = (0.09*totalValue) + 200;
        System.out.printf("This sales person sold $%,.2f 's worth of items last week\n",totalValue);
        System.out.println("The salary of this salesperson is $"+salary);
        
    }
        
}
