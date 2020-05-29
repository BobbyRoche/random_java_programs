/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7ex12;
import java.util.*;
/**
 *
 * @author Bobby
 */
public class Assignment7Ex12 {
static Scanner console = new Scanner(System.in);//sets up input
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//main
    double num;
    boolean prime=false;
    System.out.println("Please enter a number: ");
    num = console.nextInt();//reds in number
    prime = isPrime(num);//passes num to method isPrime
    if(prime==true)//displays result
    System.out.println(num + " is a prime number.");
    else
        System.out.println(num + " is not a prime number.");
    }//end of main
    public static boolean isPrime(double num)//determines if the number is prime
    {
       for(double sr = Math.sqrt(num); sr>0; sr--)
       {
          if(((num%(Math.sqrt(num))==0)||(num%2==0))&&(num!=2))
              return false;
       }
       return true;
    }
    
}
