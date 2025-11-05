
package dietalexercies;
import java.util.Scanner;
public class DietalExercies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the maximum width of the diamond: ");
//        int width = input.nextInt();
//        System.out.println("Enter a character to print out its diamond: ");
//        String userInput = input.next();
//        
//        char symbol = userInput.charAt(0);
//        
//        for(int i=1; i<=width; i++)
//        {
//            for(int j = 1; j<= width-i; j++)
//               System.out.print(" ");
//            for(int k = 1; k<=i; k++)
//               System.out.printf("%s",symbol);
//            for(int s = 1; s<=i-1; s++)
//               System.out.printf("%s",symbol);
//           
//            System.out.println();
//        }//end of upper pyramid
//        for(int i = width-1; i>=1 ; i--)
//        {
//            for(int j = width-i; j>=1; j--)
//                System.out.print(" ");
//            for(int k = i; k>=1; k--)
//               System.out.printf("%s",symbol);
//            for(int s = i-1; s>=1; s--)
//               System.out.printf("%s",symbol);
//           
//            System.out.println("");
//        }
//
//            for(int i = 1; i<=10; i++)
//            {
//                for(int j = 1; j<=i; j++)
//                {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }//end of first trinagle
//            System.out.println();
//            for(int i = 10; i>= 1; i--)
//            {
//                for(int j =1; j<=i; j++)
//                {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }//end of second triangle
//            System.out.println();
//            for(int i = 10; i>=1; i--)
//            {
//                //takes care of the spaces
//                for(int j = 10-i; j>=1;j--)
//                {
//                    System.out.print(" ");
//                }
//                //prints the stars
//                for(int k = 1; k<=i;k++)
//                {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }//end of the third triangle
//            System.out.println();
//            
//            for(int i =1; i<=10; i++)
//            {
//                for(int j =10-i; j>=1; j--)
//                {
//                    System.out.print(" ");
//                }
//                for(int k = i ; k>=1; k--)
//                {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
            for(int i =1 ; i<=10; i++)
            {
                for(int j = 1; j<=i; j++)
                {
                    System.out.print("*");
                }
                for(int d = 12-i; d>=1; d--)
                {
                    System.out.print(" ");
                }
                for(int k = 10; k>=i; k--)
                {
                    System.out.print("*");
                }
                for(int d = i+3; d>1; d--)
                    {
                        System.out.print(" ");
                    }
                for(int s =1; s<= i; s++ )
                {
                    System.out.print(" ");
                }
                for(int m = i; m<=10;m++)
                {
                    System.out.print("*");
                }
                    for(int d = 5; d>1; d--)
                    {
                        System.out.print(" ");
                    }
                for(int n = 10-i;n>=1;n--)
                {
                    System.out.print(" ");
                }
                for(int o = 1;o<=i; o++)
                {
                    System.out.print("*");
                }
                
                System.out.println("");
            }
            
        }
    }
    
