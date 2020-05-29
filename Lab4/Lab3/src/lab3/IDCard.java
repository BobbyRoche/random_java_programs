//Robert Roche (Partner Christopher Patrick)
//lab3
package lab3;


public class IDCard extends Card {
    private String IDnumber;
    public IDCard(String n, String id){
        super(n);
        this.IDnumber = id;
    }
    public String format(){
        return super.format() + IDnumber;
    }
    public String toString(){
     return super.toString() +"[ID = "+ IDnumber + "]";
        
    }
    
}
