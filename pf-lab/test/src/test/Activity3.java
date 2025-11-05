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
public class Activity3
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        String firstName;
        String lastName;
        int age;
        double weight;
        System.out.println("Enter first name , last name , " + " age, and weight seperated" +"by spaces.");
        firstName = console.next();
        lastName = console.next();
        age = console.nextInt();
        weight = console.nextDouble();
        System.out.println("Name:" + firstName+" " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Weight "+ weight);
        
        
    }
    
}
