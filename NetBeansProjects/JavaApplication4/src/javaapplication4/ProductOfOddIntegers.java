
package javaapplication4;

public class ProductOfOddIntegers {
    public static void main(String args[])
    {   
        int oddProd = 1;
        for(int i = 1; i<=15 ;i+=2)
        {
            oddProd *=i;
        }   
        System.out.println("The prodcut is " + oddProd);
    }
}
