
package excersise16;
 import java.util.*;

public class Excersise16 {
    static Scanner console=new Scanner (System.in);
    
    static final double tax = 0.14;

    
    public static void main(String[] args) {
        double payRate, hours, after, num1, num2;
               int bonds;
        
        System.out.println("Please enter the rate of pay you recieve per hour: ");
        payRate = console.nextDouble();
        System.out.println("Please enter the amount of hours worked: ");
        hours = console.nextDouble();
        System.out.println("Your income before taxes is " + (payRate * hours));
        after=(payRate*hours)-(payRate*hours*tax);
         System.out.println("Your income after taxes is " + after);
         System.out.println("You have spent " + (after * 0.1) + " on clothes and other accesories.");
         num1 = after - (after * 0.1);
         System.out.println("You have spent " + (num1 * 0.01) + " on school supplies.");
         num2 = num1 - (num1 * 0.01);
         System.out.println("You have spent " + (num2 * 0.25) + " on savings bonds.");
         bonds = (int)(num2 * 0.25);
         System.out.println("Your parents spent " + (bonds * 0.5) + " on additional bonds.");
    
    
         
    }
}