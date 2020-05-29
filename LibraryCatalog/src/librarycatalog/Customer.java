//Robert Roche
//Gerald Cohen Ph.D.
//Programming II (Project III)
package librarycatalog;
import java.util.ArrayList;
public class Customer implements Catalogable {

    public Customer(){
    	
    }
    public void borrowItem(Catalogable anItem){
    	anItem.isBorrowed();
    }
	
    public void borrowItem(Vehicle aVehicle){
    }
	
	@Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    
}
