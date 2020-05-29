import java.util.Comparator;;
public class CityComparator implements Comparator<City> {
	
	public CityComparator(){
		
	}

	public int compare(City a, City b){
		int Compare;
		Compare = a.getState().compareTo(b.getState());
		if(Compare==0){
			Compare = a.getName().compareTo(b.getName());
		}
		return Compare;
}

}
