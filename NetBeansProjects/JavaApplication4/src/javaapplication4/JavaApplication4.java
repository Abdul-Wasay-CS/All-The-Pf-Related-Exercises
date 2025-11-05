
package javaapplication4;
import java.util.*;

public class JavaApplication4 {

    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Enter the amount of inputs:");
        int inputs = console.nextInt();
        
        int[] integers = new int[inputs];
        
        for(int i=0; i<inputs;i++)
        {
            System.out.println("Enter the "+ i+1 + "Integer");
            integers[i] = console.nextInt();
            
        }
        int max = 0, min = 0;
        for(int i=0;i<inputs;i++)
        {
            if(i == 0)
            {    max = integers[i];
                min = integers[i];
            }
            else
            {
                if(integers[i]>max)
                    max = integers[i];
                if(integers[i]<min)
                    min = integers[i];
            }
        }
    }
    
}
