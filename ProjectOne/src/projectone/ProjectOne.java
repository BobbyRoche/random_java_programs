//Robert Roche
//Project1
package projectone;

import java.util.Collections;

public class ProjectOne {

    public static void main(String[] args) {
Item[] inventory = {
 new Item("Stanley", "Hammer", 11.99, 22),
 new Item("Walltec", "Paint", 18.59, 54),
 new Item("Cutrite", "Saw", 8.56, 3),
 new Item("GE", "Bulbs", 5.99, 18),
 new Item("Stanley", "Screwdriver", 4.99, 12),
 new Item("Stanley", "Screwdriver", 2.99, 101)
        
 }; 
float total=0;
int totalQ=0;

for(int i = 0; i <= inventory.length-1;i++ )
{
    System.out.println(inventory[i].toString());
  
}
for (int i = 0; i <=inventory.length-1; i++)
{
    total+=inventory[i].getPrice()*inventory[i].getQuantity();
}
System.out.println("Total value of inventory: " +total);
for (int i = 0; i <=inventory.length-1; i++)
{
    totalQ+= inventory[i].getQuantity();
}
System.out.println("Total quantity of inventory: " + totalQ);




    
    
    
    }
    
}
