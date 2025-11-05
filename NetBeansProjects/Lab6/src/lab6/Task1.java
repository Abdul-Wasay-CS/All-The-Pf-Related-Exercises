
package lab6;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //to store the two point's coordinates
        double x1,y1;
        double x2,y2;
        
        //prompt input of coordinates
        System.out.print("Enter Point 1 (latititude and longitude)"
                + "in degrees: ");
        x1 = Math.toRadians(input.nextDouble());
        y1 = Math.toRadians(input.nextDouble());
        
        System.out.print("Enter Point 2 (latititude and longitude)"
                + "in degress: ");
        x2 = Math.toRadians(input.nextDouble());
        y2 = Math.toRadians(input.nextDouble());
        
        final double earthRadius = 6371.01;
        
        double d = earthRadius * Math.acos( (Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y1-y2)));
        
    
        System.out.printf("\nThe distance between the two points"
                + "is %.4f\n",d);
    }
}
