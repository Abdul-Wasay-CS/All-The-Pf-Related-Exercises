
package dietalexercies;
import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter The Base and the exponent: ");
        int base = input.nextInt();
        int exp = input.nextInt();
        
        int powerResult = integerPower(base, exp);
        
        System.out.printf("The Answer is : %-6d",powerResult );
    }
    static int integerPower(int base, int exp)
    {
        int result = 1;
        
        for(int i =1; i<= exp; i++)
        {
            result = result * base;
        }
        
        return result;
    }
}
