
package lab7;
import java.util.Scanner;
public class Task1b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        reverse(number);
    }
    public static void reverse(int number)
    {
        int digit,reverse = 0;
        while(number > 0)
        {
            digit = number%10;
            reverse =  reverse*10 + digit;
            number /= 10;
        }
        System.out.println("The reverse of the number is: "+ reverse);
    }
}
