/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7ex2;
import java.util.*;
/**
 *
 * @author Bobby
 */
public class Assignment7Ex2 {
static Scanner console = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str;
        int vowels;
        System.out.println("Please enter a series of letters: ");
        str = console.next();
        vowels = isVowel(str);
        
        System.out.println("There are " + vowels + " vowels.");
        
    }
    public static int isVowel(String str)
    {
        int count = 0;
        char letter;
        for(int i = 0; i<str.length(); i++)
        {
            letter = str.charAt(i);
        if(letter=='A' || letter=='a' || letter=='e' || letter=='E' || letter=='i' || letter=='I' || letter=='o' || letter=='O' ||     letter=='u' || letter=='U')
           count++;
        }
        return count;
    }
    
}
