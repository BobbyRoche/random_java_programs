/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;
import java.util.*;
import javax.swing.JOptionPane;
import java.io.*;

/**
 *
 * @author Bobby
 */
public class Project4 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) throws FileNotFoundException
    {

        //Declare and initialize variables in a method
        char    c;    // or c = 'A' to initialize
        byte    b;
        short   s;
        int     i;
        long    l;
        float   fl;
        double  db;
        boolean t_f;
        String  str, inputStr, outputStr = "";
        final double PI = 3.14159265;   //Declare named constant
        
        
        
        // for console I/O
        Scanner console = new Scanner(System.in);
        System.out.print("Do not forget to prompt user for input ");
        str = console.nextLine();
        l = console.nextLong();
        System.out.println();
        
        // for file read
    	Scanner inFile = new Scanner(new FileReader("D:\\folder\\subfoler\\input.file"));
        str = inFile.next();
	i = inFile.nextInt();

        // for file write
        PrintWriter outFile =  new PrintWriter("D:\\foler\\subfoler\\output.file");
        outFile.println("Print to output file");
        
        // for Dialog Box input
        inputStr = JOptionPane.showInputDialog("Prompt user input in Dialog Box");
        db = Double.parseDouble(inputStr);
        
        // for Dialog Box output
        JOptionPane.showMessageDialog(null, outputStr, "Box Title", JOptionPane.INFORMATION_MESSAGE);
        
        
        // Methods call samples
        db = Math.pow(2, 3.4);
    

        // Output format control samples
        // to be comleted ...... 
        System.out.printf("Formating: %d  %5d  %-5d", i, i, i);
        
	// Add more please........
    
        
        // close files and exit program
        inFile.close();
        outFile.close();
        System.exit(0);
        //method call
        //method1();
        //method declaration
       // public static void method1()
        //if else
        int num=0,num2=0;
        if (num == num2) {
 
        } else {
}
        //switch
        int verse=3;
        switch (verse) {
case 1:
 
    break;
case 2:
 
    break;
case 3:
 
    break;
default:
 
    break;
}
        //loops
        int z =0;
        while(z = 0)//condition
        {
                //statements
        }
        for(; ;)//condiiton
            //statements
        do
        {
            //statements
        }while()//conditions
                
         //constructors
           /* class Temperature {
     double number;
     ScaleName scale;
 
    public Temperature() {
        number = 0.0;
        scale = ScaleName.fahrenheit;
    }
 
    public Temperature(double number, ScaleName scale) {
        this.number = number;
        this.scale = scale;*/
                
      //math.
       abs();
       sqrt();
       pow( , );
       //JOptionpane
       JOptionpane(null, title, dialog, JOptionpane_MESSGAETYPE);
       
            
        
        //array declaration and length assignment
        int [] array = new int[10];
        
        
            
        
    }
}