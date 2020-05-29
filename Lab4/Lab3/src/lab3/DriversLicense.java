//Robert Roche (Partner Christopher Patrick)
//lab3
package lab3;
import java.util.GregorianCalendar;


public class DriversLicense extends Card{
    private int ExpirationYear;
    public DriversLicense(String n, int expirationYear){
        super(n);
        this.ExpirationYear = expirationYear;
        
    }
     public String format(){
        return super.format() + ExpirationYear;
    }
     public boolean isExpired(){
     boolean isExpired = false;
     GregorianCalendar calendar = new GregorianCalendar();
     calendar.get(GregorianCalendar.YEAR);
     if(ExpirationYear>calendar.get(GregorianCalendar.YEAR))
     {
         isExpired = false;
     }
     else
     {
         isExpired = true;
     }
     return isExpired;
     }
     
     public String toString(){
     return super.toString() + "[expiration year = " + ExpirationYear + "]";
        
    }

      }
    
