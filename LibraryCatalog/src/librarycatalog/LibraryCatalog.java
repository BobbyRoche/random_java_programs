//Robert Roche
//Gerald Cohen Ph.D.
//Programming II (Project III)
package librarycatalog;
import java.util.ArrayList;

public class LibraryCatalog {


        public static void main(String[] args) {        
            ArrayList<Catalogable> media = new ArrayList<>();
               
        VehicleList vehicles = new VehicleList();               
        media.add(new Book("123456", "To Kill A Mocking Bird","Harper Lee", "1960", 4));       
        media.add(new DVD("1111", "The Godfather","Francis Ford Coppola", "1981",215, "Drama", 3));        
        media.add(new CD("4-456", "Hell Freezes Over",  "The Eagles", "1994", "Rock", 1));       
        vehicles.addVehicle(new Car("1CAR-4U", "Yugo GV", "1YUGO-01234", 1985,"1600 Pennsylvania Ave., Washington, DC"));       
        vehicles.addVehicle(new Car("1CAR-4U", "Yugo GV", "1YUGO-01309", 1986,"1600 Pennsylvania Ave., Washington, DC"));               
        Customer aCustomer = new Customer(); 
        aCustomer.borrowItem(media.get(0));    
        aCustomer.borrowItem(vehicles.borrowVehicle());
        System.out.println("Media List:");       
        for (Catalogable c : media) {            
        System.out.println(c);        
           }      
        System.out.println();       
        System.out.println("Vehicle List:");        
        System.out.println(vehicles);    
}}
