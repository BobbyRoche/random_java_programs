//Robert Roche
//Gerald Cohen Ph.D.
//Programming II (Project III)
package librarycatalog;

public class CD extends AVMedia implements Catalogable {
    private String artist;
    public CD(String ID, String title, String artist, String year, String genre, int numOfCopies)
    {
            super(title, ID, year, genre,numOfCopies);
            this.artist = artist;
    }
    
     
          public String toString(){
              String description = "Title: " + super.getDescription() + "\nArtist: " + artist + "\nGenre: " + super.getGenre() + "\nYEar Released: " + super.getYear();
              return "CD ID: " + super.getID()+ "\n" + description + "\nNum of Copies: " + super.getNumCopies() + "\nCopies On Hand: " + super.CopiesOnHand();     
          }
          
    
    
    
    
}
