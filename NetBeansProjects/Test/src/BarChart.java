import java.util.Scanner;
public class BarChart {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter five numbers seperated by spaces ( 1___30):");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        
        // bar for num1
        
        System.out.println("Bar for "+num1);
        
        for(int i =1; i<=num1; i++)
            System.out.print("*");
        System.out.println();
        
        // bar for num2
        
        System.out.println("Bar for "+num2);
        
        for(int i =1; i<=num2; i++)
            System.out.print("*");
        System.out.println();
        
        // bar for num3 
        
        System.out.println("Bar for "+num3);
        
        for(int i =1; i<=num3; i++)
            System.out.print("*");
        System.out.println();
        
        // bar for num4
        
        System.out.println("Bar for "+num4);
        
        for(int i =1; i<=num4; i++)
            System.out.print("*");
        System.out.println();
        
        // bar for num5
        
        System.out.println("Bar for "+num5);
        
        for(int i =1; i<=num5; i++)
            System.out.print("*");
        System.out.println();
        
    }
    
}
