/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

import java.util.Scanner;
public class JavaApplication33 {

    public static void main(String[] args) {
Scanner prompt = new Scanner(System.in);

System.out.println("Enter a positive integer: ");
 int number = prompt.nextInt();
System.out.println("Please enter the amount of digits: ");
int num2 = prompt.nextInt();
System.out.print(intToBinary(number,num2));
    }
    
   
    
public static String intToBinary(int number, int size) {
    StringBuilder num = new StringBuilder();

    for(int i = 15; i >= 0 ; i--) {
        int mask = 1 << i;
        num.append((number & mask) != 0 ? "1" : "0");

        if (i % 4 == 0)
            num.append(" ");
    }
    num.replace(num.length() - 1, num.length(), "");
    return num.toString();
}

   
}
