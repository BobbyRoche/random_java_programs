/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

import java.util.Arrays;

/**
 *
 * @author Bobby
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] x = {1,2,3,4};
        int positions = 3;
    
       double[] y = new double [x.length];
        for(int i = 0; i < x.length; i ++)
        {
            y[i] = x[i];
        
        for (int k = 0; k <positions; k ++)
        {
            double temp = y[i];
            for( int j  = 1; i <x.length; i ++)
            {
                y[j-1] = y[j];
                y[y.length-1] = temp;
           
            }
            System.out.println(y);
        }
        }
    }
            
       