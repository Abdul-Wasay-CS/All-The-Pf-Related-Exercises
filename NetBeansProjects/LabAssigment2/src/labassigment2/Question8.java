
package labassigment2;
import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number to find its table: ");
        int num = input.nextInt();
        
        int i=1;
        while(i<=10)
        {
            //prints table line by line
            System.out.printf("%2d x %2d = %2d",num,i,(num*i));
            
            System.out.println();//line break
            i++;
        }
    }
    
}
