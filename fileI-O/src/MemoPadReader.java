import java.util.*;
import java.io.*;

public class MemoPadReader{   
public static void main(String[] args) throws IOException   {      
Scanner console = new Scanner(System.in);      
System.out.print("Input file: ");      
String inputFileName = console.nextLine();            
File inFile = new File(inputFileName);
     
Scanner in = new Scanner (inFile);     
 boolean done = false;      
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
