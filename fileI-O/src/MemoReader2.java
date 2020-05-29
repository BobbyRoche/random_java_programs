import java.util.*;
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane.*;

public class MemoReader2 {
  public static void main(String[] args) throws FileNotFoundException {
      Scanner console = new Scanner(System.in);      
        JFileChooser chooser = new JFileChooser();
        int returnValue = chooser.showOpenDialog(null); //this method returns an int
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File inFile = chooser.getSelectedFile();
            String filename = chooser.getName(inFile);
            System.out.println(filename);
            Scanner in = new Scanner(inFile);
             boolean done = false;      

   while (in.hasNextLine()&& !done) {
while (in.hasNextLine() && !done)      {        
 String topic = in.nextLine();         
String dateStamp = in.nextLine();        
 String message = in.nextLine();        
 System.out.println(topic + "\n" + dateStamp + "\n" + message);            
         if (in.hasNext() == true) // You should only ask to display the next memo if                     // there are more memos in the file
         {           
System.out.println("Read the next memo (y/n)?");            
String ans = console.nextLine();            
if (ans.equalsIgnoreCase("n")){              
 done = true;           
 }
else
    done = false;
}
  //if the file has ended then the program ends
 }   
}}

    
}
  }
  
