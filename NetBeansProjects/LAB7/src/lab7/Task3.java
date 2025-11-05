
package lab7;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        
        displaySortedNumbers(num1, num2, num3);
    }
    public static void displaySortedNumbers(double num1, double num2, double num3)
    {
      double largest,smallest,middle;
      largest = Math.max(Math.max(num1, num2), num3);
      smallest = Math.min(Math.min(num1, num2), num3);
      middle =  num1 + num2 + num3 - largest - smallest;
      
        System.out.println(smallest + " ,"+middle+","+largest );
    }
}
