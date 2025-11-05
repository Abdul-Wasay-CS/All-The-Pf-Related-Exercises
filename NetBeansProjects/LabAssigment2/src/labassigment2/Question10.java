package pflabassigment2;
import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        
        int sum = 0;
        
        for(int i =1 ; i<=n; i++)
            sum += (i*i);
        
        System.out.println("Sum = "+sum);
    }
}
