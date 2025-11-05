package labassigment2;
import java.util.Scanner;
public class Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //using .next() because a ssn doesnt contain any spaces.
        System.out.print("Enter a SSN: ");
        String ssn = input.next();
        //variable which tells if ssn is valid or not.
        String isValid = "a valid";
        
        
        int length = ssn.length();
        //ssn is always 11 digits long.
        if(length == 11)
        {
            //validating first part,
            int startFirstPart= 0, endFirstPart = 2;
            for(int i =startFirstPart; i<=endFirstPart;i++)
            {
                //checks for invalidation
                if(ssn.charAt(i)<'0' || ssn.charAt(i)>'9')
                {
                    isValid = "an invalid";
                    break;
                }
            }//end of first part validation.
            
            if(isValid.equalsIgnoreCase("a valid"))
            {   
                if(ssn.charAt(3)!='-')
                    isValid = "an invalid";
                else
                {
                    //first part is valid
                    
                    int startSecondPart = 4, endSecondPart =5;
                    
                    for(int i=startSecondPart; i<=endSecondPart; i++)
                    {
                        //checks for invalidation
                        if(ssn.charAt(i)<'0' || ssn.charAt(i)>'9')
                        {
                            isValid = "an invalid";
                            break;
                        }
                    }//end of second part Validtion
                    
                    
                    if(isValid.equalsIgnoreCase("a valid"))
                    {
                        //7th postion is always a hyphen
                        if(ssn.charAt(6) != '-')
                        {
                            isValid = "an invalid";
                        }
                        else
                        {
                            //2nd part is valid.
                            
                            //checking the third part.
                            
                            int startThirdPart = 7, endThirdPart = 10;
                            for(int i = startThirdPart; i<=endThirdPart; i++)
                            {
                                if(ssn.charAt(i)<'0' || ssn.charAt(i)>'9')
                                {
                                    isValid = "an invalid";
                                    break;
                                }
                            }//end of third part validation loop
                        }
                    }//end of 2nd part is valid if block
                }
            }//end of 1st part is valid if block
            
        }//end of valid length checker if block
        else
        {
            isValid = "an invalid";
        }
        
        //validation is complete
        
        System.out.println(ssn+" is "+isValid+" social security number");
    }
}
