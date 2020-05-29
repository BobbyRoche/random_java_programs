/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timelapse;
import java.util.*;

/**
 *
 * @author Bobby
 */
public class TimeLapse {
    static Scanner console= new Scanner (System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hours, mins, secs,num1,num2;
        System.out.println("Please enter the amount of hours:");
        hours = console.nextInt();
        System.out.println("Enter the amount of minutes:");
        mins = console.nextInt();
        System.out.println("Enter the amount of seconds:");
        secs = console.nextInt();
        num1 = hours*3600;
        num2 = mins * 60;
        System.out.println("The total number of seconds is " + (secs+num1+num2));
        // TODO code application logic here
    }
    
}
