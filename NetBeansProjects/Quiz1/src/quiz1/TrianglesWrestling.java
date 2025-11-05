
package quiz1;
import java.util.Scanner;
public class TrianglesWrestling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Vaiables to store the sides.
        
        System.out.println("Enter the Three sides of a Trianlge: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        
        if((side1+side2>side3 && side1+side3>side2 && side2+side3>side1)
                && (side1>=0 && side2>=0 && side3>=0))
        {
            //The triangle is valid
            
            if(side1==side2 && side2==side3 && side1 == side3)
            {
                //Equilateral triangle body
                
                System.out.println("Equilateral Triangle");
                
                //Very ugly check for pythogoras Theorem.
                
                if((Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2)) ||
                        (Math.pow(side3, 2) + Math.pow(side2, 2) == Math.pow(side1, 2)) || 
                        (Math.pow(side1, 2) + Math.pow(side3, 2) == Math.pow(side2, 2)))
                {
                    System.out.println("Right-angled Triangle");
                }//end of Pythogoras If
                
            } //End of equalateral trainlge if
            else if(side1==side2 || side2==side3 || side1 == side3)
            {
                //Isoceles Triangle Body
                
                System.out.println("Isosceles Triangle");
                
                //right angle triangle check
                
                if((Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2)) ||
                        (Math.pow(side3, 2) + Math.pow(side2, 2) == Math.pow(side1, 2)) || 
                        (Math.pow(side1, 2) + Math.pow(side3, 2) == Math.pow(side2, 2)))
                {
                    System.out.println("Right-angled Triangle");
                }//end of Pythogoras If
                
            }//end of Isosceles Triangle if
            
            else
            {
                //Scalene triangle
                System.out.println("Scalene Triangle");
                
                //right angle triangle check
                
                if((Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2)) ||
                        (Math.pow(side3, 2) + Math.pow(side2, 2) == Math.pow(side1, 2)) || 
                        (Math.pow(side1, 2) + Math.pow(side3, 2) == Math.pow(side2, 2)))
                {
                    System.out.println("Right-angled Triangle");
                }//end of Pythogoras If
                
            }//end of Scalene Triangle if
            
        }//end of Valid triangle if
        else
        {
            System.out.println("Invalid Triangle");
        }
        
        input.close();
    }
}
