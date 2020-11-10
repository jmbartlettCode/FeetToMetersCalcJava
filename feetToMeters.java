/*
 * Josh Bartlett
 * Purpose: To convert feet to meters
 * April 20, 2019
 * Bellevue University
 * feetToMeters.java
 */

import java.util.Scanner;

public class feetToMeters {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // ask user for imput, declare feet variable, add input to feet variable
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();
        
        // declare meter variable, convert feet to meters
        double meters = feet * 0.305;
        
        // display result to output
        System.out.println(feet + " feet is " + meters + " meters");
        
    }
    
}
