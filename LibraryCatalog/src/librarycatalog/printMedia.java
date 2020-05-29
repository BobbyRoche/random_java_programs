//Robert Roche
//Gerald Cohen Ph.D.
//Programming II (Project III)
package librarycatalog;

public class printMedia extends Item implements Catalogable {
    private String date;
    public printMedia(String ID, String title,String date, int numOfCopies)
    {
        super(title,ID,numOfCopies);
        this.date = date;
        
    }
    
    public String getDate(){
    	return date;
    }
    
}
