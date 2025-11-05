
package lab7;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number and its raise to the power:");
        int a = input.nextInt();
        int n = input.nextInt();
        
        int result = power(a, n);
        
        System.out.println("The result is " + result);
    }//end of method main
    
    public static int power(int a, int n)
    {
        if(n== 0)
            return 1;
        else
            return a*power(a , n-1);
    }//end of method resulst
    
}
