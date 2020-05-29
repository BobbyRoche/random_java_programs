/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex19;
import java.util.*;
/**
 *
 * @author cstudent
 */
public class Ex19 {
    static Scanner console = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double total, interest, payment, num, num2;
        int i, count=0;
        System.out.println("Enter the amount you owe to the bank without interest: ");
        total = console.nextDouble();
        System.out.println("Enter the interest rate: ");
        interest = console.nextDouble()/100;
        System.out.println("Enter monthly payment: ");
        payment = console.nextDouble();
        if(payment<(interest*total))
            System.out.println("The monthly payment is less than the interest, restart the program and change your monthly payment accordingly.");
        do
        {
           num = interest*total;
           num2 = payment-num;
           total=total-num2;
           count++;
        }while(total>0);
        System.out.print("It will take " + count + " months to repay the loan.");
     }
    
}
