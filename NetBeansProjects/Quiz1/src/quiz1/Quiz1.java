import java.util.Scanner;
package quiz1;
public class Quiz1 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the units consumed this month");
       int units = input.nextInt();
       
       // decalring vairable for unitrate and final bill.
       // default rate set for units  <= 100
       
       int rateUnit=5,totalBill = 0;
       
       if(units>=0)
       {
           // calculates rate according to units used.
           
           if(units<= 100)
               rateUnit = 5;
           else if(units> 100 && units <= 200)
               rateUnit = 8;
           else
               rateUnit = 10;
           
           totalBill = units*rateUnit;
           
           //adding Rs. 500 if bill is greater than 2000
           
           if(totalBill > 2000)
               totalBill += 500;
           
           System.out.println("Your monthly Electricity bill is "
                   + "Rs. "+ (totalBill) + "\\-");
       }
       else
       {
           System.out.println("Invalid Units!");
       }
    }
    
}
