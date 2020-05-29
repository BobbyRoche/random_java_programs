/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.util.Comparator;

/**
 *
 * @author Bobby
 */
public class XYZ implements Comparator<BankAccount> {

    public int compare(BankAccount o1, BankAccount o2) {
             return o1.getName().compareTo(o2.getName());

    }
    
}
