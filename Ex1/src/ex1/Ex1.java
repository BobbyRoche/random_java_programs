/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;
import java.util.*;
/**
 *
 * @author Bobby
 */
public class Ex1 {
static Scanner console = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char letter;
        boolean verify=false;
        System.out.println("Please enter a vowel: ");
        letter = console.next().charAt(0);
        verify = isVowel(letter);
        
        if(verify==true)
            System.out.println("Your letter is a vowel.");
        else
            System.out.println("Your letter is a consenent.");
        
    }
    public static boolean isVowel(char letter)
    {
        if(letter=='A' || letter=='a' || letter=='e' || letter=='E' || letter=='i' || letter=='I' || letter=='o' || letter=='O' ||     letter=='u' || letter=='U')
            return true;
        else
        return false;
    }
    
}
