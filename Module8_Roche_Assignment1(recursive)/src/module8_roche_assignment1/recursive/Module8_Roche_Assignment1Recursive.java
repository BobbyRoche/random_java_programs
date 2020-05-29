/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module8_roche_assignment1.recursive;

/**
 *
 * @author Bobby
 */
public class Module8_Roche_Assignment1Recursive {

    /**
     * @param args the command line arguments
     */
public static void main(String ar[])
{
  Fibonacci num = new Fibonacci();
  System.out.println("\n fib(5): " + num.getFib(5));
  //the count gives the number of calls to the fib() method
  System.out.println("\n The count is "+num.count);
  //System.out.println(ob.fib(3));  
}

}

class Fibonacci
{
static int count = 0;
int getFib(int n) {
  count ++;
    if(n == 0)
        return 0;
    else if(n == 1)
      return 1;
   else
      return getFib(n - 1) + getFib(n - 2);
}
}

