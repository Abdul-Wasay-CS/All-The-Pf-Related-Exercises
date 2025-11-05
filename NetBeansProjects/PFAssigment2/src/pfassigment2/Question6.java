package pfassigment2;
import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        for(int i = 1; i<=8; i++)
        {
            for(int j = 1; j<=8-i ; j++)
                System.out.print("    ");
            for(int k = 1 ;k<=i; k++)
               System.out.printf("%4.0f",Math.pow(2,k-1));
            for(int s = 1; s<= i-1; s++)
                System.out.printf("%4.0f",Math.pow(2,i-s-1));
            
            System.out.println();
        }
    }
}
