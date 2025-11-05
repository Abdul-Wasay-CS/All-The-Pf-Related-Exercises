import java.util.Scanner;

package missedtasks;

public class BMICalculator {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double weightKilo,heightMeter;
        final double BMI ;
        System.out.print("Enter your weight in Kilo: ");
        weightKilo = input.nextDouble();
        System.out.print("\nEnter your height in meters: ");
        heightMeter = input.nextDouble();
        
        BMI = (weightKilo)/(Math.pow(heightMeter,2));
        
        if(BMI < 18.5)
            System.out.println("\nUnderWeight.");
        else if (BMI >= 18.5 && BMI <= 24.9)
            System.out.println("Normal.");
        else if (BMI >= 25 && BMI <=29.9)
            System.out.println("Overwieht.");
        else
            System.out.println("Obese.");
        
        
    }
}
