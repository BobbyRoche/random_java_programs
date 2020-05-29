//Robert Roche (Partner Christopher Patrick)
//lab3
package lab3;


public class BillFold extends Card{
        private Card card1;
        private Card card2;

    
   public BillFold(Card c1, Card c2){
        this.card1 = c1;
        this.card2 = c2;
        
    }

    void addCard(Card newCard)
    {
        if (card1 == null)
        {
            card1 = newCard;
        }
        else
        {
            if(card2 == null)
            {
                this.card2 = newCard;
            }
        }
    }
    public String formatCards(){
        return "[" + card1.toString() + "|" + card2.toString() + "]";
        
    }
    public int getExpiredCardCount(){
        int count = 0;
        if(card1.isExpired()==true)
            count+=1;
        if(card2.isExpired() == true)
            count+=1;
       
        return count;
    }
    
}
