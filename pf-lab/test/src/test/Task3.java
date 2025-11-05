/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.util.*;
/**
 *
 * @author FA25-BSE-002
 */
public class Task3 
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        final int SECRET = 11;
        final double RATE = 12.50;
        int num1,num2,newNum;
        String name;
        double hoursWorked,wages;
        
        System.out.println("Enter two integers:");
        num1 = console.nextInt();
        num2 = console.nextInt();
        System.out.println("The value of num1 = "+num1+" and the value of num2 = "+num2);
        newNum = (num1 * 2) + num2;
        System.out.println("The value of newNum ="+newNum);
        newNum = newNum + SECRET;
        System.out.println("The new value of newNum = "+newNum);
        System.out.println("Enter your lastname");
        name = console.next();
        System.out.println("Enter a decimal number number between 0 and 70:");
        hoursWorked = console.nextDouble();
        wages = RATE * hoursWorked;
        System.out.println("Name:"+name+"\nPay Rate: $"+RATE+"\nHours Worked: "+hoursWorked+"\nSalary: $"+wages);
        
        
        
        
    }
        
}
