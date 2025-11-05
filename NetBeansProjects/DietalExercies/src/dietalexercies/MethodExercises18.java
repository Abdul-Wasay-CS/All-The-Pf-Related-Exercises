
package dietalexercies;
import java.util.Scanner;
public class MethodExercises18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dimension of the square: ");
        int dim = input.nextInt();
        
        squareOfAsteriks(dim);
        
        input.close();
    }
    static void squareOfAsteriks( int dimension)
    {
        for(int i =1; i<= dimension; i++)
        {
            for(int j=1; j<= dimension; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
