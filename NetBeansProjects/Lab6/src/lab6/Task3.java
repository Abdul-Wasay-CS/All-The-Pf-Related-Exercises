
package lab6;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a decimal value( 0 to 15 ): ");
        int decNum = input.nextInt();
        //putting a linebreak.
        System.out.println();
        //variable to store the hex value.
        String hex = ""; // intialized empty to avoid a runtime error.
        if(decNum >=0 && decNum <=15)
        {
            switch(decNum)
            {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    //string + int results in a string,
                    //with the numerical value concatinated to it.
                    
                    hex = hex+decNum;
                    break;
                
                case 10:
                    hex = "A";
                    break;
                case 11:
                    hex = "B";
                    break;
                case 12:
                    hex = "C";
                    break;
                case 13:
                    hex = "D";
                    break;
                case 14:
                    hex = "E";
                    break;
                case 15:
                    hex = "F";
                    break;
            }//end of switch
            
            System.out.println("The hex value is "+hex);
            
        }//end of if
        else
        {
            System.out.println(decNum+" is an invalid input");
        }
    }
    
}
