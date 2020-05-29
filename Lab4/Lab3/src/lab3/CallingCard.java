//Robert Roche (Partner Christopher Patrick)
//lab3
package lab3;


public class CallingCard extends Card{
    private String CardNumber;
    private int PIN;
    public CallingCard(String n, String cardNum, int pinNum){
        super(n);
        this.CardNumber = cardNum;
        this.PIN = pinNum;        
    }
    public String format(){
        return super.format() + "Card Number: " + CardNumber + "PIN: " + PIN;
    }
    public String toString(){
     return super.toString() + " [number = "+ CardNumber + ", pin = "+  PIN + "]";
        
    }
    
}
