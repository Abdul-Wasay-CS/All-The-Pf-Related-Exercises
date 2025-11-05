
public class TableMaking {
    public static void main(String args[])
    {
        System.out.printf("%-10s%-10s%-10s%-10s\n\n","N","10*N","100*N","1000*N");
        for(int n=1; n<=5; n++)
        {
            System.out.printf("%-10d%-10d%-10d%-10d\n",n,10*n,100*n,1000*n);
        }
            
    }
}
