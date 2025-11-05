
package lab7;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to find the sum of its digits: ");
        int num = input.nextInt();
        int digiSum = sumDigits(num);
        System.out.println("The sum is "+ digiSum);
    }
    public static int sumDigits(long n)
    {
        long digit,sum = 0;
        do{
            digit = n%10;
            sum += digit;
            //executes only when the only the last digit is left,i.e only one digit number. e.g 4%10 is 4 
            if(n % 10 == n)
                break;
            n /= 10;//trims out the used digit out of the number
        }while(true);
        
        return (int)sum;
    }
}
