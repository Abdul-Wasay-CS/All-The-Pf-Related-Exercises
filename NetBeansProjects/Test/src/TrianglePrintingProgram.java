
public class TrianglePrintingProgram {
    public static void main(String args[])
    {
        
        System.out.printf("%-20s\n","(a)");
        
        //i represents row number
        
        for(int i = 1; i <= 10; i++)
        {
            //each j represents coloumn number
            //here number of astericks = row number
            
            for(int j = 1; j<=i; j++)
                System.out.print("*");
            
            // goes to the next line after
            // the inner loops executes completely
            
            System.out.println();
        }
        
        System.out.printf("\n%-20s\n","(b)");
        
         for(int i = 10; i >= 1; i--)
        {
            //each j represents coloumn number
            //here number of astericks = row number
            
            for(int j = 1; j<=i; j++)
                System.out.print("*");
            
            // goes to the next line after
            // the inner loops executes completely
            
            System.out.println();
        }
        
         
        System.out.printf("\n%-20s\n","(c)");
        
        for(int i = 10; i >= 1; i--)
        {
            //each j represents coloumn number
            //here number of astericks = row number
            for(int z = 10; z>i;z--)
                    System.out.print(" ");
            for(int j = 1; j<=i; j++)
            {    
                
                System.out.print("*");
            }
            // goes to the next line after
            // the inner loops executes completely
            
            System.out.println();
        }
         
        System.out.printf("\n%-20s\n","(c)");
        
        for(int i = 1; i <= 10; i++)
        {
            //each j represents coloumn number
            //here number of astericks = row number
            //Puts spaces equal to : i-1
            for(int z = 10; z>i;z--)
                    System.out.print(" ");
            for(int j = 1; j<=i; j++)
            {    
                
                System.out.print("*");
            }
            // goes to the next line after
            // the inner loops executes completely
            
            System.out.println();
        }
        
    }
}
