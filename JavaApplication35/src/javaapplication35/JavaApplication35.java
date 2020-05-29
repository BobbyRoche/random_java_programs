/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

/**
 *
 * @author Bobby
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int n = 10;
   double num = goldenMean(n);
   System.out.println("The goldenMean is: " + num);
    }
    public static double goldenMean(int n){
System.out.println("Entering goldenMean: n = " + n);
if(n==0)
return 1;
else
return 1 + (1/goldenMean(n-1));
    
}
}
