
package menubasedcode;
import java.util.Scanner;

public class MenuBasedCode 
{
    public static Scanner input = new Scanner(System.in);
    
    public static void question1()
    {
        char choice;
        do{
            System.out.println("=============================================================================================");
            System.out.print("Enter a valid SSN(DDD-DD-DDDD):");
            String ssn = input.next();
            //flag for validation result
            boolean isValid=true;
            
            //for length validation
            int standardssnLength = 11;
            int ssnlength = ssn.length();
            if(ssnlength == standardssnLength)
            {   
                
                //length is valid
                for(int i = 0; i< ssnlength; i++)
                {
                    char currentChar = ssn.charAt(i);
                    
                    if(i == 3 || i == 6)
                    {
                        if(currentChar != '-')
                            isValid = false;
                    }//end of hyphen validation
                    else
                    {
                        if(currentChar <'0' || currentChar > '9')
                        {
                            isValid = false;
                            break;
                        }
                    }
                }
            }
            else
            {//length is invalid
                isValid = false;
            }
            
            if(isValid)
                System.out.println(ssn + " is valid SSN!");
            else
                System.out.println(ssn + " is an invalid SSN!");
            
            System.out.print("Choose if you want run the program again"
                    + " \n(any character for yes, n to return to main menu) :");
            
            String userChoice = input.next();
            
            choice = userChoice.charAt(0);
        }while(!(choice == 'n' || choice == 'N'));
        System.out.println("=============================================================================================");
    }//end of method question1
    
    
    public static void question2()
    {
        System.out.println("=============================================================================================");
        char choice;
        do{
            System.out.println("Enter two Characters ( representing your major and status) :");
            String userInput= input.next();
            //flag Variable to chekc validity
            boolean isValid = true;
            String major = "";
            String status = "";
            //checking length of the input
            if(userInput.length() == 2)
            {
                //to store the first two char of our concern
                char majorChar = userInput.charAt(0);
                char statusChar = userInput.charAt(1);
                
                switch(majorChar)
                {
                    case 'I':
                        major = "Information Technology";
                        break;
                    case 'C':
                        major = "Computer Science";
                        break;
                    case 'M':
                        major = "Mathematics";
                        break;
                    default:
                        isValid = false;
                }//End of major selection 

                switch(statusChar)
                {
                    case '1':
                        status = "Freshman";
                        break;
                    case '2':
                        status = "Sophomore";
                        break;
                    case '3':
                        status = "Junior";
                        break;
                    case '4':
                        status = "Senior";
                        break;
                    default:
                        isValid = false;
                }//end of status selection
                
            }//end of length validation
            else
            {
                isValid = false;
            }
            
            
            if(isValid)
            {
                System.out.printf("%s  %s\n",major,status);
            }
            else
            {
                System.out.println("Invalid input!");
            }
            System.out.println("Do you want to run the program again? ( press n for no):");
            String userChoice = input.next();
            choice = userChoice.charAt(0);
            
        }while(!(choice == 'n' || choice == 'N' ));
    }//end of mehtod question2
    
    
    public static void question3()
        {
            System.out.println("=============================================================================================");
            char choice;
            do{
                System.out.print("Enter a word: ");
                String orgWord = input.next();
                int length = orgWord.length();
                String reverseWord="";
                //finding the reverse word
                for(int i = length-1; i>=0; i--)
                {
                    reverseWord = reverseWord+orgWord.charAt(i);
                }   
                if(reverseWord.equals(orgWord))
                    System.out.println(orgWord +" is a palindrome");
                else
                    System.out.println(orgWord +" is not a palindrome");
                System.out.println("Do you want to run the program  again( n for no): ");
                String userChoice = input.next();
                choice = userChoice.charAt(0); 
            }while(!(choice == 'n' || choice == 'N'));
        }//end of mehtod question3
    public static void question4()
        {
            System.out.println("=============================================================================================");
            char choice;
            do{
                System.out.println("Enter a number to find its binary: ");
                int num = input.nextInt();

                String binary = "",reverseBinary = "";

                int tempNum = num;
                do{
                    //storing the reminder of num/2 in reverseBinary
                    reverseBinary = reverseBinary + (tempNum %2);
                    tempNum /= 2;
                }while(tempNum >=1);

                //reversing the reverse binary to recive correct binary
                int length = reverseBinary.length();

                for(int i = length-1;i >= 0; i--)
                {
                    binary = binary + reverseBinary.charAt(i);
                }
                System.out.println("Binary of "+ num + " is: " + binary) ;

                System.out.println("Do you want to run the program  again( n for no): ");
                String userChoice = input.next();
                choice = userChoice.charAt(0); 

            }while(!(choice == 'n' || choice == 'N'));
        }
    public static void question5()
        {
            System.out.println("=============================================================================================");
            char choice;
            do{
                int correcAnwers = 0;

                correcAnwers += checkPart1();
                correcAnwers += checkPart2();
                correcAnwers += checkPart3();
                correcAnwers += checkPart4();
                correcAnwers += checkPart5();

                System.out.println("You got "+ correcAnwers +" out of 5.");
                System.out.println("Do you want to run the program  again( n for no): ");
                String userChoice = input.next();
                choice = userChoice.charAt(0); 
            }while(!(choice == 'n' || choice == 'N'));
        }
    public static void question6()
        {
            System.out.println("=============================================================================================");
            char choice;
            do{
                System.out.println("Enter a number: ");
                int number = input.nextInt();

                if(isPrime(number))
                    System.out.println(number+ " is a prime number");
                else
                    System.out.println(number + " is not a prime number");
                System.out.println("Do you want to run the program  again( n for no): ");
                    String userChoice = input.next();
                    choice = userChoice.charAt(0); 
            }while(!(choice == 'n' || choice == 'N'));
        }
    
    
    public static void main(String[] args) {
      
        do{
            System.out.println("=============================================================================================");
            System.out.println("                                        Main Menu                           ");
            System.out.println("=============================================================================================");
            //prints the question options.
            for(int i = 1; i<=6; i++)
            {
                System.out.printf("%d- Question-%d\n",i,i);
            }
            System.out.println("=============================================================================================");
            System.out.println("Choose a question(1-6) to execute the respective program.Press 0 to exit.");
            System.out.println("\nEnter your Choice:");
            int choice = input.nextInt();
            
            if(choice == 0)
            {
                break;
            }
            else
            {
                //calling program in accordance to choice
                switch(choice)
                {
                    case 1:
                        System.out.println("=============================================================================================");
                        System.out.println("Loading Question1.........\nExecuting Question1..........");
                        question1();
                        System.out.println("=============================================================================================");
                        System.out.println("Executed Question1 Successfully.");
                        System.out.println("=============================================================================================");
                        break;
                    case 2:
                        System.out.println("=============================================================================================");
                        System.out.println("Loading Question2..............\nExecuting Question2................");
                        question2();
                        System.out.println("=============================================================================================");
                        System.out.println("Executed Question2 Successfully.");
                        System.out.println("=============================================================================================");
                        break;
                    case 3:
                        System.out.println("=============================================================================================");
                        System.out.println("Loading Question3..............\nExecuting Question3................");
                        question3();
                        System.out.println("=============================================================================================");
                        System.out.println("Executed Question3 Successfully.");
                        System.out.println("=============================================================================================");
                        break;
                    case 4:
                        System.out.println("=============================================================================================");
                        System.out.println("Loading Question4..............\nExecuting Question4................");
                        question4();
                        System.out.println("=============================================================================================");
                        System.out.println("Executed Question4 Successfully.");
                        System.out.println("=============================================================================================");
                        break;
                    case 5:
                        System.out.println("=============================================================================================");
                        System.out.println("Loading Question5..............\nExecuting Question5................");
                        question5();
                        System.out.println("=============================================================================================");
                        System.out.println("Executed Question5 Successfully.");
                        System.out.println("=============================================================================================");
                        break;
                    case 6:
                        System.out.println("=============================================================================================");
                        System.out.println("Loading Question6..............\nExecuting Question6................");
                        question6();
                        System.out.println("=============================================================================================");
                        System.out.println("Executed Question6 Successfully.");
                        System.out.println("=============================================================================================");;
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a number between 1 to 6.");
                }//end of switch
            }//end of else body
        }while(true);

        System.out.println("=============================================================================================");
        System.out.println("                                    Good Bye !!");  
        System.out.println("=============================================================================================");
    }//end of method main


    static int checkPart1()
    {
        char correctChoice = 'b';
        System.out.println("Q1. Which data structure uses the principle of Last In, First Out (LIFO)?");
        System.out.println("A) Queue \nB) Stack\nC) Linked List\nD) Binary Tree");
        System.out.println("Enter your answer:");
        input.nextLine();
        String answer = input.nextLine();
        answer = answer.toLowerCase();
        char choice = answer.charAt(0);

        if(choice == correctChoice)
            return 1;
        else 
            return 0;
    }
    
    static int checkPart2()
    {
        char correctChoice = 'b';
        System.out.println("Q2. In Java, which keyword is used to inherit a class?");
        System.out.println("A) implements\nB) extends\nC) inherits\nD) superclass");
        System.out.println("Enter your answer:");
        String answer = input.nextLine();
        answer = answer.toLowerCase();
        char choice = answer.charAt(0);

        if(choice == correctChoice)
            return 1;
        else 
            return 0;
    }
    static int checkPart3()
    {
        char correctChoice = 'b';
        System.out.println("Q3. Which of the following is not a characteristic of an algorithm?");
        System.out.println("A) Finitenes\nB) Ambiguity\nC) Input\nD) Output");
        System.out.println("Enter your answer:");
        String answer = input.nextLine();
        answer = answer.toLowerCase();
        char choice =answer.charAt(0);

        if(choice == correctChoice)
            return 1;
        else 
            return 0;
    }
    static int checkPart4()
    {
        char correctChoice = 'c';
        System.out.println("Q4. The binary number 10110 is equivalent to which decimal number?");
        System.out.println("A) 20\nB) 21\nC) 22\nD) 23");
        System.out.println("Enter your answer:");
        String answer = input.nextLine();
        answer = answer.toLowerCase();
        char choice = answer.charAt(0);

        if(choice == correctChoice)
            return 1;
        else 
            return 0;
    }
    
    static int checkPart5()
    {
        char correctChoice = 'c';
        System.out.println("Q5. Which layer of the OSI model handles logical addressing and routing of data packets?");
        System.out.println("A) Application Layer\nB) Transport Layer\nC) Network Layer\nD) Data Link Layer");
        System.out.println("Enter your answer:");
        String answer = input.nextLine();
        answer = answer.toLowerCase();
        char choice = answer.charAt(0);

        if(choice == correctChoice)
            return 1;
        else 
            return 0;
    }
    static boolean isPrime(int num){
        boolean prime = true;
        if(num ==1)
            prime = false;
        else
            for(int i = 2 ; i<= Math.sqrt(num); i++)
                if(num % i == 0)
                {
                    prime = false;
                    break;
                }

        return prime;

    }
}
