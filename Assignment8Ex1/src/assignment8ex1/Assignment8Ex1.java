/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment8ex1;
import java.util.*;
/**
 *
 * @author Bobby
 */
public class Assignment8Ex1 {
static Scanner console = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] array = new double[50];
        
        for(int i = 0; i<=25; i++)
        {
            array[i] = i*i;
        }
        for(int i =26; i<50; i++)
        {
            array[i] = i * 3;
        }
        for(int i = 0; i<10; i++)
        {
            System.out.print(array[i] + " ");
        }
       
         for(int i = 0; i<10; i++)
        {
            System.out.print(array[i] + " ");
        }
         System.out.println();
          for(int i = 10; i<20; i++)
        {
            System.out.print(array[i] + " ");
        }
          System.out.println();
          for(int i = 20; i<30; i++)
        {
            System.out.print(array[i] + " ");
        }
          System.out.println();
          for(int i = 30; i<40; i++)
        {
            System.out.print(array[i] + " ");
        }
          System.out.println();
          for(int i = 40; i<50; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
    
}
