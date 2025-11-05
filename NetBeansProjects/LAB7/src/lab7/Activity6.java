
package lab7;
import java.util.Scanner;
public class Activity6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter index for a fibonacci number: ");
        int index = input.nextInt();
        //find and display the fibonacci number
        System.out.println("The Fibonacci number at index "+index+ "  is "+fib(index));
        
          }
    public static long fib(long index)
    {
        if(index == 0)
            return 0;
        else if( index ==1)
            return 1;
        else 
            return fib(index - 1) + fib(index -2);
    }
}
    
