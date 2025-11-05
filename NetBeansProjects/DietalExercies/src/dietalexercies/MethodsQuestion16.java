
package dietalexercies;
import java.util.Scanner;
public class MethodsQuestion16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of pairs you want to enter: ");
        int numOfPairs = input.nextInt();
        int num1,num2;
        for(int i = 0; i<= numOfPairs; i++)
        {
            System.out.print("Enter the first number:");
            num1=  input.nextInt();
            System.out.print("Enter the second number: ");
            num2 = input.nextInt();
            
            if(isMultiple(num1, num2 ))
            {
                System.out.println(num2 + " is a factor of " + num1);
            }
            else
            {
                System.out.println(num2 + " is not a factor of " + num1);
            }
            
        }      
    }
    static boolean isMultiple(int  firstNumber, int possibleFactor)
    {
        if(firstNumber % possibleFactor == 0)
        {
            return true;
        }
        else 
            return false;
    }
}
