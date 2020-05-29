//Robert Roche
//Gerald Cohen Ph.D.
//Programming II (Project III)
package librarycatalog;
import java.util.ArrayList;

public class VehicleList {
	private ArrayList<Vehicle>Vehicles = new ArrayList();
	private ArrayList<Vehicle>BorrowedVehicles = new ArrayList();
	
	public VehicleList(){
		
	}
	
	public void addVehicle(Vehicle newVehicle){
		Vehicles.add(newVehicle);
	}
	
	public Vehicle borrowVehicle(){
		Vehicle temp = Vehicles.get(0);
		Vehicles.remove(0);
		BorrowedVehicles.add(temp);
		return temp;
	}
	
	public String toString(){
		String s = ">> Vehicles on hand:\n";
		for(int i = 0; i < Vehicles.size();i++){
				s = s + Vehicles.get(i).toString() + "\n";
		}
		s = s + "\n\n>> Vehicles borrowed:\n";
		for(int i = 0; i < BorrowedVehicles.size();i++){
				s = s + BorrowedVehicles.get(i).toString() + "\n";
		}
		return s;
	}
	

}
