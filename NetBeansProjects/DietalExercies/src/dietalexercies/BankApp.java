
package dietalexercies;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the pyrammid");
        int  length= input.nextInt();
        
        for(int i =1 ; i<=length; i++)
        {
            for(int j=0; j<length-i;j++)
                System.out.print("    ");
            for(int k = 0; k<i; k++)
                System.out.printf("%4d",(int)Math.pow(2,k));
          for(int s = i-1; s>0;s--)
                System.out.printf("%4d",(int)Math.pow(2,s-1));
              
            /*another way to do this
          
            Scanner input = new Scanner(System.in);
        System.out.print("Enter a the length of the pyramid");
        int n = input.nextInt();
        
        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=n-i ; j++)
                System.out.print("    ");
            for(int k = 1 ;k<=i; k++)
               System.out.printf("%4.0f",Math.pow(2,k-1));
            for(int s = 1; s<= i-1; s++)
                System.out.printf("%4.0f",Math.pow(2,i-s-1));
            
            System.out.println();
          
          */
            System.out.println();
        }
    }
}
