/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4ex6;
import java.util.*;

/**
 *
 * @author Bobby
 */
public class Ch4Ex6 {
    static Scanner console = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int side1, side2, side3;
        System.out.println("Please enter the length of side1: ");
        side1 = console.nextInt();
         System.out.println("Please enter the length of side2: ");
        side2 = console.nextInt();
         System.out.println("Please enter the length of side3: ");
        side3 = console.nextInt();
        if ((Math.pow(side1,2)+Math.pow(side2,2))== Math.pow(side3,2))
            System.out.println("It is a right triangle");
        else if ((Math.pow(side1,2)+Math.pow(side3,2))== Math.pow(side2,2))
            System.out.println("It is a right triangle");
        else if ((Math.pow(side3,2)+Math.pow(side3,2))== Math.pow(side1,2))
            System.out.println("It is a right triangle");
        else
            System.out.println("It is not a right triangle.");
        
        }
    
}
