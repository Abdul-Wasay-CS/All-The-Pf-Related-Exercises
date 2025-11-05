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
public class Activity5 {
    public static void main(String[] args)
    {
        final double PI = 3.14158;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number for radius");
        double radius = input.nextDouble();
        
        double area = PI * radius * radius;
        
        System.out.println("The area of the circle is :"+area);
        
    }
}
