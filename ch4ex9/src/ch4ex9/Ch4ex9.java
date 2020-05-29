/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4ex9;
import java.util.*;

/**
 *
 * @author Bobby
 */
public class Ch4ex9 {
    static Scanner console = new Scanner(System.in);
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        char op;
        String str;
        System.out.println("Please enter the first number, operator, then second number (press 'enter' in bewteen each): ");
        num1 = console.nextInt();
        str = console.next();
        num2 = console.nextInt();
        if(str.charAt(0) == '+')
        System.out.println(num1 + " " + str + " " + num2 + " = " + (num1+num2));
        else if(str.charAt(0) == '-')
            System.out.println(num1 + " " + str + " " + num2 + " = " + (num1-num2));
        else if(str.charAt(0) == '*')
            System.out.println(num1 + " " + str + " " + num2 + " = " + (num1*num2));
        else if(str.charAt(0) == '/')
        {
            if(num2==0)
                System.out.println(num1 + " " + str + " " + num2 + " = " +"Undefined, cannot divide by zero");
            else
            System.out.println(num1 + " " + str + " " + num2 + " = " + (num1/num2));
        }
        else
            System.out.println("Error, invalid operator, or invalid integers.");
    }
    
}
