/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Bobby
 */
public class Project1 {
    static Scanner console = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String password;
        boolean check1,check2, check3, check4, check5;
        char valid='N';
       
      password= JOptionPane.showInputDialog(null,"Please enter your password: ","Password",JOptionPane.INFORMATION_MESSAGE);
       do
       {
        
        check1 =length(password);
        check2 = upper(password);
        check3=lower(password);
        check4=special(password);
      check5=digit(password);
       if((check1==true)&&(check2==true)&&(check3==true)&&(check4==true)&&(check5==true))
                   valid='Y';
       else 
           password=JOptionPane.showInputDialog(null,"Error: Password requirements not met. Please try again(Must contain: 8 characters minimum, 1 uppercase, 1 lowercase, 1 special character, 1 number):","Error",JOptionPane.ERROR_MESSAGE);
           
       
       }while(valid!='Y');
       
       JOptionPane.showMessageDialog(null,"Password accepted.","Accepted", JOptionPane.INFORMATION_MESSAGE);
    }
       
    
    public static boolean length(String password){
       if(password.length()>=8)
           return true;
           
        return false;
        }
    
    
    public static boolean upper(String password){
       
        for( int i = 0; i<=password.length()-1; i++)
        {
            if(Character.isUpperCase(password.charAt(i))==true)
               return true;
        }
             return false;}
    
    public static boolean lower(String password)
    {
        for(int i = 0; i<=password.length()-1; i++)
        { 
            if(Character.isLowerCase(password.charAt(i))==true)
             return true;
        }
            return false;}

    
    public static boolean special(String password)
    { 
        for(int i = 0; i<=password.length()-1; i++)
        {
            if((Character.isLetter(password.charAt(i))== false) && (Character.isDigit(password.charAt(i))== false))
              return true;
        }
        return false;
    }

        
    
    public static boolean digit(String password){
        
        for(int i = 0; i<=password.length()-1; i++)
        {
            if(Character.isDigit(password.charAt(i))== true)
             return true;
        }
             return false;}
 
}
