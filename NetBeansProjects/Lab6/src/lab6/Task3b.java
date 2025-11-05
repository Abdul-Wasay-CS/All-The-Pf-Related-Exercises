
package lab6;
import java.util.Scanner;
public class Task3b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a hex digit: ");
        String hex = input.nextLine();
        
        char hexCh = hex.charAt(0);

        //to store the respective decimal value
        int dec = 0;
        
        
        boolean isValid = true;
        switch(hexCh)
        {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                dec =hexCh - '0';
                break;
            case 'A':
                dec = 10;
                break;
            case 'B':
                dec = 11;
                break;
            case 'C': 
                dec = 12;
                break;
            case 'D':
                dec = 13;
                break;
            case 'E':
                dec = 14;
                break;
            case 'F':
                dec = 15;
                break;
            default:
                  isValid = false;
        }//end of switch 
        
        
        //checking if the  entered number is correct
        if(isValid)
        {
            //converting the respective deci to binary

            String bin = "";

            //variable to store each bit, 
            int bit;

            //dealing with the zero exception
            if(dec == 0)
                bin ="0";

            //finds the binary in reverse order and 
            //stores it in a string

            while(dec!=0)
            {
                bit = dec%2;
                bin = bin+bit;

                dec /=2;
                if(dec == 1 )
                {
                    bin = bin+dec;
                    break;
                }
            }

            //variable to store the length of the binary number

            int binlength = bin.length();

            //gives the correct sequnce of bits by 
            //reversing the reversed binary number
            System.out.print("The binary value is ");
            for(int i =(binlength-1) ; i>=0; i--)
                System.out.print(bin.charAt(i));       

        }//end of correct input if
        else
        {
            System.out.println(hexCh + " is an invalid input");
        }
    }
}
