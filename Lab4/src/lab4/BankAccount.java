/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Bobby
 */
public class BankAccount implements Comparable <BankAccount> {
 private double balance;
 private String owner;
 public BankAccount(String owner, double balance) {
 this.owner = owner;
 this.balance = balance;
 }
 public double getBalance() {
 return balance;
 }
 public String getName() {
 return owner;
 }
 @Override
  public int compareTo(BankAccount other)
 {
     if(other.balance > this.balance)
         return-1;
     else if( this.balance>other.balance)
         return 1;
     else
         return 0;
 }
    
}

