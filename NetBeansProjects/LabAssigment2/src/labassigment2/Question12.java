package labassigment2;
import java.util.Scanner;
public class Question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a valid vehicle plate number: ");
        String numPlate = input.next();
        
        int plateLength = numPlate.length();

        String isValid = "correct";
        
        //number plate number must 7 digits long
        if(plateLength == 7)
        {
            int startFirstPart = 0,endFirstPart = 2;
            //validating fist part
            for(int i = startFirstPart; i<=endFirstPart; i++)
            {
                if(numPlate.charAt(i)<'A' || numPlate.charAt(i)>'Z')
                {
                    isValid = "incorrect";
                    break;
                }
            }//end of first part validation
            
            if(isValid.equalsIgnoreCase("correct"))
            {
                //first part is valid
                
                int startSecondPart = 3, endSecondPart = 6;
                for(int i = startSecondPart; i<=endSecondPart; i++)
                {
                    if(numPlate.charAt(i)<'0' || numPlate.charAt(i)>'9')
                    {
                        isValid = "incorrect";
                        break;
                    }
                }//end of second part validation
            }
        }//check of plate number length
        else
        {
            isValid = "incorrect";
        }
        
        System.out.println(numPlate+" is in "+isValid+" format");
    }
}
