/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;
import java.io.*;
import java.util.*;




public class Ex6 {

    /**
     *
     * @param args
     * @throws FileNotFoundException
     */
    public static void main (String[] args) throws FileNotFoundException
    {
        double fed, state, soc, med, pen, health, gross, net;
        String name;
        Scanner inFile = new Scanner (new FileReader("prog.dat"));
        PrintWriter outFile = new PrintWriter("prog.out");
       
        outFile.println("Please enter your name: ");
        name = inFile.next();
        outFile.println("Please enter your gross income: ");
        gross = inFile.nextDouble();
        fed = gross * .15;
        state = gross * .035;
        soc = gross * .0575;
        med = gross * .0275;
        pen = gross * .05;
        health = 75;
        net = gross - (fed + state + soc + med + pen) - health;
        outFile.println(name);
        outFile.printf("Gross Amount: \t %.2f", gross);
        outFile.println();
        outFile.printf("Federal Tax: \t %.2f", fed);
        outFile.println();
        outFile.printf("State Tax: \t %.2f", state);
        outFile.println();
        outFile.printf("Social Security Tax: \t %.2f", soc);
        outFile.println();
        outFile.printf("Medicare/Medicade Tax: \t %.2f", med);
        outFile.println();
        outFile.printf("Pension Plan: \t %.2f", pen);
        outFile.println();
        outFile.printf("Health Insurance: \t %.2f", health);
        outFile.println();
        outFile.printf("Net Pay: \t %.2f", net);
        
        inFile.close();
        outFile.close();

    }
    
}
