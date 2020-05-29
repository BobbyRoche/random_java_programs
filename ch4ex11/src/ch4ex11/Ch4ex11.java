/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4ex11;
import java.util.*;

/**
 *
 * @author Bobby
 */
public class Ch4ex11 {
    static Scanner console = new Scanner(System.in);
    static final double tax = 0.14;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double payRate, hours, after, num1, num2,bonds, remainder, parents;
        
        System.out.println("Please enter the rate of pay you recieve per hour: ");
        payRate = console.nextDouble();
        System.out.println("Please enter the amount of hours worked: ");
        hours = console.nextDouble();
        System.out.println("How much would you like to spend on savings bonds?");
        bonds = console.nextDouble();
        System.out.println("Your income before taxes is " + (payRate * hours));
        after=(payRate*hours)-(payRate*hours*tax);
         System.out.println("Your income after taxes is " + after);
         System.out.println("You have spent " + (after * 0.1) + " on clothes and other accesories.");
         num1 = after - (after * 0.1);
         System.out.println("You have spent " + (num1 * 0.01) + " on school supplies.");
         num2 = num1 - (num1 * 0.01);
         remainder = after - (after * 0.1) - (num1 * 0.01);
         if (bonds == 0)
         {
             bonds = 0.01 * remainder;
             System.out.println("Your parents purchased " + bonds + " in savings bonds for you.");
         }
         else if (bonds == (0.25 * remainder))
         {
         parents = (bonds * 0.25) + (remainder * 0.01);
         bonds = bonds + parents;
           System.out.print("Your parents contributed ");
          System.out.printf("%.2f",parents);
          System.out.print(" to your savings bonds, you now have ");
          System.out.printf("%.2f",bonds);
         }
         else if (bonds > (0.25 * remainder))
         {
         parents = (bonds * 0.4) + (remainder * 0.02);
         bonds = bonds + parents;
          System.out.print("Your parents contributed ");
          System.out.printf("%.2f",parents);
          System.out.print(" to your savings bonds, you now have ");
          System.out.printf("%.2f",bonds);
         }
         
         
         
         
    
    
         
    }
}