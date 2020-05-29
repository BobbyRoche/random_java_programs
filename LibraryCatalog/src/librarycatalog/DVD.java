//Robert Roche
//Gerald Cohen Ph.D.
//Programming II (Project III)
package librarycatalog;

    public class DVD extends AVMedia implements Catalogable {
    private String director;
    private int runTime;
    public DVD(String ID, String title, String director, String year,int runTime, String genre, int numOfCopies){
        super(title,ID,year,genre, numOfCopies);
        this.director = director;
        this.runTime = runTime;
    }
    
     
          public String toString(){
              String description = "Title: " + super.getDescription() + "\nDirector: " + director + "\nGenre: " + super.getGenre() + "\nYear Released: " + super.getYear() + "\nRun Time: " + runTime + " minutes";
              return "Video ID: " + super.getID() + "\n" + description + "\nNum of Copies: " + super.getNumCopies() + "\nCopies On Hand: " + super.CopiesOnHand();     
          }
          
    
    
    
}

