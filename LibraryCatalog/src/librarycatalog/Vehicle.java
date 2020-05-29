//Robert Roche
//Gerald Cohen Ph.D.
//Programming II (Project III)
package librarycatalog;
import java.util.ArrayList;
public class Vehicle{
    private int year;
    private String type,location, make_model, ID;
   
    public Vehicle(String type, String make_model, String ID, int year, String location){
        this.type = type;
        this.make_model = make_model;
        this.ID = ID;
        this.year = year;
        this.location = location;

    }
    
    public String getType(){
    	return type;
    }

    public String getMake(){
    	return make_model;
    }
    public String getID(){
    	return ID;
    }
    public int getYear(){
    	return year;
    }
      public String getLoc(){
    	return location;
    }
    
    
}
