
package dietalexercies;
import java.util.Scanner;
public class MethodsQuestion15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Base of the right angle triangle: ");
        double base = input.nextDouble();
        System.out.println("Enter the Height of the right angle triangle: ");
        double height = input.nextDouble();
        
        double hyp = findHypotenuse(base , height);
        
        System.out.printf("The hypotenuse of the given triangle is %-6.2f",hyp);
        
        input.close();
    }
    static double findHypotenuse(double side1 ,double side2)
    {
        double side3 = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        return side3;
    }
    
}
