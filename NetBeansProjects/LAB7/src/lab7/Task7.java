
package lab7;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = input.nextInt();
        
        printMatrix(n);
    }
    static void printMatrix(int n)
    {
        //prints the matrix
        //outer loop represents the number of rows of the matrix , 
        //while the inner loop represents the number of coloumns
        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=n; j++)
            {
                //generating a random number and rounding it, so random chance of it being 1 or 0
                System.out.print((int)(Math.round(Math.random())) + " ");
            }
            System.out.println();
        }
    }
}
