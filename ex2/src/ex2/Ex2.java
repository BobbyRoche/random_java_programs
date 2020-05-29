/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;
import java.util.*;



public class Ex2 {
    static Scanner console= new Scanner(System.in);
    static final double PI = 3.14159; 
    public static void main(String[] args) {
        double height, radius, volume, area;
        
        System.out.println("Enter the height of the cylinder: ");
        height = console.nextDouble();
        System.out.println("Please enter the radius of the cylinder: ");
        radius = console.nextDouble();
        volume = PI * Math.pow(radius , 2) * height;
        area = (2 * PI * Math.pow(radius, 2)) + (2 * PI * radius * height);
        System.out.printf("The volume of the cylinder =  %.2f ", volume );
        System.out.println();
        System.out.printf("The surface area of the cylinder: %.2f ", area);
        
        
        
        

    }
    
}
