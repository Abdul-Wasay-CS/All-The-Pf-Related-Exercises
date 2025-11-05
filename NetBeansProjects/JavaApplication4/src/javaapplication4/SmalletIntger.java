import java.util.Scanner;
package javaapplication4;

public class SmalletIntger {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of integers you want to enter:");
        int n = input.nextInt();
        
        int smallest= 0;
        int num;
        
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the "+(i+1)+" number:");
            num=input.nextInt();
            
            if(i==0)
                smallest = num;
            else if(num < smallest)
                smallest = num;
                
        }
        
        System.out.println("The smallest entered integer is "+smallest);
    }
    
}
