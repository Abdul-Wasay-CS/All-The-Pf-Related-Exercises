package pfassigment2;
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of lines: ");
        int n = input.nextInt();
        
        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=n-i ; j++)
                System.out.print("   ");
            for(int k = i ;k>=1; k--)
               System.out.printf("%3d",k);
            for(int s = 1; s<= i-1; s++)
                System.out.printf("%3d",s+1);
            
            System.out.println();
        }
    }
    
}
