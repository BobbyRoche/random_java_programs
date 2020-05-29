//Robert Roche
package module3_roche_assignment1;

import java.util.Stack;

/**
 *
 * @author Bobby
 */
public class Module3_Roche_Assignment1 {

    public static void main(String[] args) {
        System.out.println("The first 50 numbers in the fibbonaci sequence are: \n");
        Stack <Long> fib = new Stack <Long>();//creates stack
        long num;
        for(int i =0; i<50; i++){//sets limit to 50 elements
            num = getFibonacci(i);//calls method to get the number
            fib.push(num);//adds the number to the stack
            
        }
        long num1;
        for(int i = 50; i > 0; i--){
            num1 = fib.pop();
            System.out.print(num1 + "  ");
    }
    }
    public static long getFibonacci(int n)  {
    if(n == 0)
        return 0;
    else if(n == 1)
      return 1;
   else
      return getFibonacci(n - 1) + getFibonacci(n - 2);
    
}
}
