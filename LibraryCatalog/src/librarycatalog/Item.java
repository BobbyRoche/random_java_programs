//Robert Roche
//Gerald Cohen Ph.D.
//Programming II (Project III)
package librarycatalog;


public class Item implements Catalogable {
    private String title;
    private String ID;
    private int numOfCopies;
    private int OnHandCopies;
    public Item(String title, String ID, int numOfCopies){
        this.title = title;
        this.ID = ID;
        this.numOfCopies = numOfCopies;
        this.OnHandCopies = numOfCopies;
 
    }
    @Override
    public String getDescription(){
        return title;
    }
     @Override
    public String getID(){
        return ID;
    }
    
     public int getNumCopies(){
    	 return numOfCopies;
     }
     
     public int CopiesOnHand(){
    	 return OnHandCopies;
     }
     
     @Override
     public void isBorrowed(){
    	 OnHandCopies--;
     }
    
    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
