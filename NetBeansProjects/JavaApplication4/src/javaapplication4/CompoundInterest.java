
package javaapplication4;


public class CompoundInterest {
    public static void main(String args[])
    {
        double amount;  //amount on deposit at end of each year
        double principal = 1000.0;  // intial amount before interest
        double rate = 0.05;
        
        //display headers
        System.out.printf("%s  %-20s\n","Year","Amount on depsoit");
        
        //calculate and output the CI with the current rate.
        //and then increase the rate by 1%(or 0.01)
            
        
        for(rate = 0.05 ; rate <= 0.09 ; rate += 0.01)
        {   
            System.out.printf("\nRate Now: %.2f%%\n ",(rate*100));
            //calculate amount on deposit for each of ten years
            
            for(int year = 1; year <=10; year ++)
            {
                //calculate new amount for specified year.

                amount = principal * Math.pow(1.0+rate, year);

                //display the year and the amount

                System.out.printf("%-4d %-,20.2f\n", year, amount );
            
            }//end of for loop

        }
    }
}
