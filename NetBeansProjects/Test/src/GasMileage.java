import java.util.Scanner;
public class GasMileage {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int trips;
        double miles, gallons, totalMiles=0, totalGallons=0, tripMileage, totalMileage = 0;
        
        
        System.out.println("Enter the number of trips upto this point:");
        trips = input.nextInt();
        
        for(int i = 1; i <= trips; i++)
        {
            System.out.println("Enter the miles covered in trip "+i);
            miles = input.nextDouble();
            System.out.println("Enter the gallons used in trip "+i);
            gallons = input.nextDouble();
            tripMileage = miles/gallons;
            System.out.println("The mileage of trip "+i+" is "+tripMileage+" Miles per gallon");
            
            totalMiles += miles;
            totalGallons += gallons;
            
        }   
        totalMileage = totalMiles/totalGallons;
        System.out.println("The combined Mileage is "+totalMileage+" Miles per gallon");
        
    }
}
