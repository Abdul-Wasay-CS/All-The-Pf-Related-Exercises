/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author FA25-BSE-002
 */
import java.util.*;
public class Task2 {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int width;
        System.out.println("Enter the width: ");
        width = console.nextInt();
        System.out.println();
        int length;
        System.out.println("Enter the length");
        length = console.nextInt();
        System.out.println();
        int area,perimeter;
        area = length * width;
        System.out.println("Area = "+ area);
        perimeter = 2 * (length + width );
        System.out.println("Perimeter = "+perimeter);
       
    }
}
