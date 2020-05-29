//Robert Roche
//Gerald Cohen Ph.D.
//Programming II (Project III)
package librarycatalog;

public class Car extends Vehicle{
    public Car(String type, String make_model, String ID, int year , String location){
        super(type, make_model, ID, year, location);
    }
    
    
     
          public String toString(){
              String description = "Type: " + super.getType() + "\nMake/Model: " + super.getMake();
              return description + "\nID: " + super.getID() + "\nYear: " + super.getYear() + "\nLocation: " + super.getLoc();     
          }
          
}
