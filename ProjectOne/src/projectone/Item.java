//Robert Roche
//Project 1 (item class)
package projectone;


public class Item{
    
    private String manufacturer;
    private String description;
    private double price;
    private int quantity;
    public Item(String manufacturer,String description, double price, int quantity )
    {
        this.manufacturer = manufacturer;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }
    public String toString()
    {
       Double Price = price;
       Integer Quantity = quantity;
       String a = "Manufacturer: " + manufacturer + ", Description: " + description + ", Price: " + Price.toString() + ", Quantity: " + Quantity.toString();
       return a;
       
    }
    
    public double getPrice(){
        return price;
    }
    
    public int getQuantity(){
        return quantity;
    }
    public double totalPrice(){
        return quantity * price;
    }

   
    
    
}
