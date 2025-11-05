
package lab7;
import java.util.Scanner;

public class Task10a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to print out its reverse: ");
        int number = input.nextInt();
        int reversedNumber = reverse(number,0);
        System.out.println(reversedNumber);
    }
    static int reverse(int n,int reversed){
        int  currentDigit;
        if(n==0)
            return reversed;
        else
        {
            currentDigit = n%10;
            reversed = reversed*10+currentDigit;
            return  reverse(n/10,reversed);
        }
    }
}
