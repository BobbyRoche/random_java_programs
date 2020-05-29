/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * 
 
 */


public class JavaApplication2 {
    
    static Scanner console = new Scanner(System.in);

    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
         double num;
         System.out.println("Please enter a decimal number: ");
         num=console.nextDouble();
         System.out.println(""+(int)num);
         
    }
    
}
