/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayspt2;

/**
 *
 * @author Bobby
 */
public class Arrayspt2 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) { //main method from lab sheet
    double x[] = {8, 12, 16, 24, 48};
    
      
       
    System.out.println("Before Roation: ===================");
      for (int i = 0; i < x.length; i++){         
    
    System.out.println("x[" + i + "]:  " + x[i]);      
}
     rotateLeft(x, 3);
    System.out.println("After in-place rotation:  ======================");      

     for (int i = 0; i < x.length; i++){         
    
    System.out.println("x[" + i + "]:  " + x[i]);      
}
    }
    
    public static double[] rotateLeft(double[] x, int positions)
    {
        double temp;
            for(int j = 0; j<positions; j++)
            {
             temp = x[j];
                 for(int i = j; i< x.length-1; i ++)
                       x[i] = x[i+1];
                      x[x.length-1] = temp;}

                           
                 
               
      
        return x;}
        
    }
    

