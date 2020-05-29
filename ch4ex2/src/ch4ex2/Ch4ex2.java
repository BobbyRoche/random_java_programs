/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4ex2;
import java.util.*;
/**
 *
 * @author Bobby
 */
public class Ch4ex2 {
static Scanner console = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3;
        System.out.println("Please enter the first integer: ");
            num1 = console.nextInt();
            System.out.println("Please enter the second integer: ");
            num2 = console.nextInt();
            System.out.println("Please enter the third integer: ");
            num3 = console.nextInt();
            if((num1<num2)&&(num1<num3))
            {
                if(num2<num3)
                    System.out.println(num1 + " " + num2 + " " + num3);
                else if(num3<num2)
                    System.out.println(num1 + " " + num3 + " " + num2);
            }
            else if((num2 < num1) && (num2 < num3))
                    {
                        if(num1<num3)
                            System.out.println(num2 + " " + num1 + " " + num3);
                        else if(num3<num1)
                            System.out.println(num2 + " " + num3 + " " + num1);
                    
                    }
            else if((num3 < num2) && (num3<num1))
            {
                if(num2<num1)
                    System.out.println(num3 + " " + num2 + " " + num1);
                else if(num1<num2)
                    System.out.println(num3 + " " + num1 + " " + num2);
            }
            else
                System.out.println("Multiple numbers are equal, please restart the program and try again.");
    }
    
}
