import java.util.Scanner;

public class Module7_Roche_Assignment1 {

   public static void main(String[] args) {
  
       Scanner console = new Scanner(System.in);
        int num;

       System.out.print("Enter the index : ");
       
       num = console.nextInt();
      
       System.out.print("Here is the Fibonacci Sequence for the index "+num+":");
      
       for (int i = 0; i <= num; i++)
       {
           System.out.print(getFib(i) + " ");

       }
   }

   public static int getFib(int num) {
       if (num == 0) {
           return 0;
       } 
       else if (num == 1) {
           return 1;
       } 
       else {
           return getFib(num - 1) + getFib(num - 2);
       }
   }
}