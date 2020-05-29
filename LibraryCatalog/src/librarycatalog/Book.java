//Robert Roche
//Gerald Cohen Ph.D.
//Programming II (Project III)

package librarycatalog;

public class Book extends printMedia implements Catalogable {
    private String genre, author,ISBN;
    public Book(String ID, String title, String ISBN, String genre, String author, String date, int numOfCopies)
    {
            super(ID,title,date,numOfCopies);
            this.genre=genre;
            this.author = author;
            this.ISBN = ISBN;

    }
    public Book(String ID, String title, String author, String date, int numOfCopies)//tester code constructor
    {
            super(ID,title,date,numOfCopies);
            this.author = author;
 
    }
    
        @Override 
          public String getDescription(){
              String description = "Title: " + super.getDescription() + "\nAuthor: " + author + "\nPublication Date: " + super.getDate();
              return description;     
          }
            
        public String toString(){
        	String s;
        	String description = this.getDescription();
        	s = "Book ID: " + super.getID() + "\n" + description + "\nNumber of copies: " + super.getNumCopies() + "\nCopies On Hand: " + super.CopiesOnHand();
        	return s;
        	
        }
    
}
