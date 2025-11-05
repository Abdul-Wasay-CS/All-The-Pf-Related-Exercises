import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int customer=1,accountNumber,beginBalance,chargesMonth,creditsMonth,creditLimit,newBalance;

        while(true)
        {
            System.out.println("Enter customer "+(customer)+"'s account number:\nEnter 0 to exit");
            accountNumber = input.nextInt();
            if(accountNumber == 0)
                break;
            System.out.println("Enter Balance at the start of the month:");
            beginBalance = input.nextInt();
            System.out.println("Enter items charged by customer this month:");
            chargesMonth = input.nextInt();
            System.out.println("Enter credits applied this month:");
            creditsMonth = input.nextInt();
            System.out.println("Enter credit limit:");
            creditLimit = input.nextInt();

            newBalance = beginBalance + chargesMonth - creditsMonth;

            if(newBalance > creditLimit)
                System.out.println("Credit limit Exceeded!!");
            else
                System.out.println("Balance is under credit Limit.");
            
            customer++;
        }    
    }
}
