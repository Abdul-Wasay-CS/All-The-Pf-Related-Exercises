
package lab7;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        printPyramid(5,0);
        System.out.println();
        printRightPattern(1);
        System.out.println();
        printLeftOneTriangle(1);
        System.out.println();
        printLeftPattern(5);
    }
    static void printPyramid(int n, int k) 
{ 
    if (n < 0)  
        return;
    printPyramid(n - 1, k + 1); 

    for (int i = 0; i < k; i++) // it makes spaces 
        System.out.printf(" "); 
    for (int i = 0; i < n; i++) // for print * 
        System.out.printf("* "); 
    System.out.printf("\n"); // for next line 
} 
    static void printLeftOneTriangle(int n)
    {
        if(n<=5)
        {
            printLeftOneStar(n);
            System.out.println();
            printLeftOneTriangle(n+1);
        }
    }
    static void printLeftOneStar(int n)
    {
        if(n>=1){
            System.out.print("* ");
            printLeftOneStar(n-1);
        }
    }
    
    public static void printLeftPattern(int n) {
        if (n > 0) {
            printStars(n);
            System.out.println();
            printLeftPattern(n - 1);
        }
    }

    public static void printStars(int n) {
        if (n > 0) {
            System.out.print("* ");
            printStars(n - 1);
        }
    }
    
     static void printRightPattern(int n)
    {
        if(n<=5)
        {
            printSpaces(5-n);
            printRightOneStar(n);
            System.out.println();
            printRightPattern(n+1);
        }
    }
    static void printRightOneStar(int n)
    {
        if(n>=1){
            System.out.print("* ");
            printRightOneStar(n-1);
        }
    }
    static void printSpaces(int n)
    {
        if(n>=1){
            System.out.print("  ");
            printSpaces(n-1);
        }
            
    }
}


