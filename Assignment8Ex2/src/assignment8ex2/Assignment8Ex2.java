/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment8ex2;
import java.util.*;
/**
 *
 * @author Bobby
 */
public class Assignment8Ex2 {
static Scanner console = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] array = new int[5];
        int length = array.length;
        System.out.println("Enter 5 integers: ");
        array[0] = console.nextInt();
        array[1] = console.nextInt();
        array[2] = console.nextInt();
        array[3] = console.nextInt();
        array[4] = console.nextInt();
        
       int small = getSmallest(length, array);
       System.out.println(small);
    }
      public static int getSmallest ( int length, int [] array)
      {
          int smallest = 0;
          for(int l = 4; l>=0; l--)
          {
          for(int i = 1; i<5; i++)
          {
              if(array[l]<array[i])
                  smallest = l;
              else
                  smallest = i;
          }
        
          }
          return smallest;
     }
    
    
}
