
package lab7;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        boolean palindrome = isPalindrome(number);
        if(palindrome)
            System.out.println(number + " is a palindrome");
        else
            System.out.println(number + " is not a palindrome");
        input.close();
    }
    public static boolean isPalindrome(int number)
    {
        int reversedNumber = reverse(number);
        if(reversedNumber == number )
            return true;
        else
            return false;
    }
    public static int reverse(int number)
    {
        int digit,reverse = 0;
        while(number > 0)
        {
            digit = number%10;
            reverse =  reverse*10 + digit;
            number /= 10;
        }
        return reverse;
    }
    
}
