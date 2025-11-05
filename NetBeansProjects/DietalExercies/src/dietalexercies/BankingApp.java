
package dietalexercies;
import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rows of the pyramidd: ");
        int n  =input.nextInt();
        for(int i = 0; i < n; i++) {
    for(int j = 0; j < 2*n-1; j++) {
        if(j >= mid - i && j <= mid + i)
            System.out.print("*");
        else
            System.out.print(" ");
    }
    System.out.println();
}

    }//end of method main
}
