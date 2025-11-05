import java.util.Scanner;
public class SquareAsterik {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of square:");
        int sides = input.nextInt();
        
        //Printing Top Row
        
        for(int i =1; i<=sides; i++)
        {
            System.out.printf("%s","*");
        }
        
        System.out.println();
        
        //Printing all the middle rows
        
        for(int i = 3; i<= sides; i++)
        {
            System.out.printf("%s%"+(sides)+"s","*","*\n");
        }
        
        
        //Printing the last Row
        
        for(int i = 1; i<= sides; i++)
        {
            System.out.printf("%s","*");
        }
        
        
        
        
           
    }
}
