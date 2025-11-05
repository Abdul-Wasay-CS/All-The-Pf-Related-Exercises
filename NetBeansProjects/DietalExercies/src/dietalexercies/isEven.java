
package dietalexercies;
import java.util.Scanner;
public class isEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of integers you want to enter: ");
        int limit = input.nextInt();
        int num;
        for(int i = 1; i<= limit; i++)
        {
            System.out.println("Enter a number to check if its even or not: ");
            num = input.nextInt();
            if(isEven(num))
            {
                System.out.println( num + " is even");
            }
            else
            {
                System.out.println(num + " is not even");
            }
        }
    }   
    static boolean isEven(int possibleEven)
    {
        if(possibleEven % 2 ==0 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
