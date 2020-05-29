//Robert Roche
//Gerald Cohen Ph.D.
//Programming II (Project III)
package librarycatalog;


public class AVMedia extends Item implements Catalogable {
    private String year, genre;
    public AVMedia(String title, String ID, String year, String genre, int numOfCopies){
        super(title, ID,numOfCopies);
        this.year = year;
        this.genre = genre;
    }
    
    public String getGenre(){
    	return genre;
    }
    
    public String getYear(){
    	return year;
    }
    
}
