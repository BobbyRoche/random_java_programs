/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module8_roche_assignment1;

import java.util.Stack;

/**
 *
 * @author Bobby
 */
public class Module8_Roche_Assignment1 {

    /**
     * @param args the command line arguments
     */
static int num = 0;
public static void main(String[] args)
{
  
  long x = 1, y = 1, temp;
    
 Stack<Long> tree = new Stack<Long>();

  tree.push(x);
  
  tree.push(y);
  
  num += 2;

  int n = 5;  
  
  for(int i = 2; i < n; i++)
  {
   temp = x;
   x = y;
   y += temp;
   tree.push(y);
   
   num += 4;
  }

  System.out.println("Fibonacci Numbers:");
  while(!tree.isEmpty())
  {
   System.out.println(tree.pop() + " ");
  }
  
  System.out.println("\nLines of code executed: " + num);
}
}
