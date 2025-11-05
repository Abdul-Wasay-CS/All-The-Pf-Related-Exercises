
package quiz1;
import java.util.Scanner;
public class SortingWithoutLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter three numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        
        //Variables to store , maximum, minimum and the middle.
        
        
        if( (num1 >= num2 && num1 >= num3))
        {
            max = num;
            //num1 is max
            if(num2 <=num3)
            {
                min = num2;
                middle = num3;
            }
            else if(num3 <= num2)
            {
                min = num3;
                middle = num2;
            }
            
                
        }//end of num1 is max if case.
        
        else if( (num2 >= num1 && num2 >= num3) )
        {   
            max = num2;
            //num1 is max
            if(num2 <=num3)
            {
                min = num2;
                middle = num3;
            }
            else if(num3 <= num2)
            {
                min = num3;
                middle = num2;
            }
            
        }//end of num2 is max if case
        
    }
}
