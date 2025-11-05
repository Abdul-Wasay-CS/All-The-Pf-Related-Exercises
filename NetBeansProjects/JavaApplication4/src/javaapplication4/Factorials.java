
package javaapplication4;


public class Factorials {
    public static void main(String args[])
    {
        //intialized temporarily so java doesnt screams.
        long fact=1;
        System.out.printf("%-15s   %-50s","Number","Factorial");
        for(long i =1;i<=20;i++)
        {
            fact=1;
            for(long j=1; j<=i; j++)
            {
                fact *= j;
            }
            System.out.println();
            System.out.printf("%-15d   %-50d",i,fact);
            
        }    
    }    
}
