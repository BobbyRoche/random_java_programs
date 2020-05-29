/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Bobby
 */
public class JavaApplication3 {
    static Scanner console= new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2, num3, num4, num5;
        System.out.println("Please enter 5 decimal numbers: ");
        num1=console.nextDouble();       
        num2=console.nextDouble();
        num3=console.nextDouble();
        num4=console.nextDouble();
        num5=console.nextDouble();
        int total=(int)(num1+num2+num3+num4+num5);
        System.out.println("The total rounded to an integer is : "+total);

        
        
    }
    
}
