
package pfassigment2;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        boolean isNotPrime;
        do{
            isNotPrime = false;
            System.out.println("Enter an integer: ");
            num = input.nextInt();
            
            for(int i = 2; i<= num/2; i++)
            {
                if(num%i ==0)
                {    isNotPrime = true;
                    break;
                }   
            }
                
        }while(isNotPrime);
    }
}
