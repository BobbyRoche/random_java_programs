/*Robert Roche
 * Programming II
 * Lab 1 Problem 1
 * 9/15/2016
 */
package arrays;
import java.util.*;
/**
 *
 * @author cstudent
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //main method from lab sheet
    double x[] = {8, 12, 16, 24, 48};
    System.out.println("Before Roation: ===================");
    for(int i = 0; i< x.length; i++)
    {
        System.out.println( "x[ " + i + "] :    " + x[i]);
   
    }
    double y[] = {rotate(x,3)};
    }
    
    public static double[] rotate(double[] x, int positions)
    {
        double[] y = new double [x.length];
        for(int i = 0; i < x.length; i ++)
        {
            y[i] = x[i];
        }
        for (int i = 0; i <positions; i ++)
        {
            double temp = y[i];
            for( int j  = 1; i <x.length; i ++)
            {
                y[j-1] = y[j];
                y[y.length-1] = temp;
            }
        }
            
        return y;
        
    }
    
}
