/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Bobby
 */
public class Lab4{
  
 
    public static void main(String[] args) {
    
      ArrayList<BankAccount> list = new ArrayList<BankAccount>();
     BankAccount ba1 = new BankAccount("Bob",1000.0);
     BankAccount ba2 = new BankAccount("Alice",101.0);
     BankAccount ba3 = new BankAccount("Tom",678.0);
     BankAccount ba4 = new BankAccount("Tom",1100.0);
     BankAccount ba5 = new BankAccount("Ted",256.0);
      list.add(ba1);
      list.add(ba2);
      list.add(ba3);
      list.add(ba4);
      list.add(ba5);


Collections.sort(list);
for (int i = 0; i < list.size(); i++)
{
 BankAccount b = list.get(i);
 System.out.println(b.getName() + ": $" + b.getBalance());
} 

//////////////////////////////////////////////


BankAccount [] accounts = new BankAccount[5];
  BankAccount a1 = new BankAccount("Bob",1000.0);
     BankAccount a2 = new BankAccount("Alice",101.0);
     BankAccount a3 = new BankAccount("Tom",678.0);
     BankAccount a4 = new BankAccount("Tom",1100.0);
     BankAccount a5 = new BankAccount("Ted",256.0);
     accounts[0] = a1;
     accounts[1]=a2;
     accounts[2]=a3;
     accounts[3]=a4;
     accounts[4]=a5;
     Arrays.sort(accounts,new XYZ());
for (int i = 0; i < list.size(); i++)
{
 BankAccount b = accounts[i];
 System.out.println(b.getName() + ": $" + b.getBalance());
}
     


}
}
