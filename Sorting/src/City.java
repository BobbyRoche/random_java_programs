public class City implements Comparable<City>{
	private String name;
	private String state;
	
	public City(String name, String state){
		this.name = name;
		this.state = state;
	}
	
	public int compareTo(City a){
		int lessThan;
		lessThan = this.name.compareTo(a.name);
		if(lessThan == 0){
			lessThan = this.state.compareTo(a.state);
		}
		return lessThan;
	}
	
	public String getName(){
		return name;
	}
	
	public String getState(){
		return state;
	}
	
	public String toString(){
		return name + ", " + state;
	}
	
	
    
}
