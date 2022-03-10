/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seatworkk;

import java.util.Scanner;

/**
 *
 * @author Jarvis
 */
public class Seatworkk {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a shape type\n>Rectangle\n>Circle\n>Cylinder:");
        String input = scanner.next();
        
       if ("rectangle".equalsIgnoreCase(input)) {
           System.out.print("Enter the length of rectangle: ");
           double length = scanner.nextDouble();
           System.out.println("Enter the width of rectangle: ");
           double width = scanner.nextDouble();
           
           double A = length * width;
           double P = 2 * (length + width);
           double RA = Math.round(A*100/100.0);
           double RP = Math.round(P*100/100.0);
           System.out.println("The area of the rectangle is: " + RA);
           System.out.println("The perimeter of the rectangle is: " + RP);
           
    }
        if ("circle".equalsIgnoreCase(input)) {
            System.out.print("Enter the radius: ");
            
            double RAD = scanner.nextDouble();
            double Area = Math.PI * (RAD * RAD);
            double RArea = Math.round(Area*100/100.0);
            System.out.println("The area of circle is: " + RArea);
            double C = Math.PI * 2 * RAD;
            double RC = Math.round(C*100/100.0);
            System.out.println("The circumference of the circle is: " + RC);
    
   
    }  
        if ("Cylinder".equalsIgnoreCase(input)) {
        System.out.print("Enter the radius of the cylinder: ");
        double RC = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double HC = scanner.nextDouble();
       
        double S = (2 * Math.PI * RC * (RC + HC));
        double RAS = Math.round(S *100/100.0);
        double V = Math.PI * RC * RC * HC;
        double RAV = Math.round( V *100/100.0);
        System.out.println("The surface area of the cylinder is: " + (RAS));
        System.out.println("The volume of the cylinder is : " + (RAV));
        
        
        }
        
    }
    
}

    
