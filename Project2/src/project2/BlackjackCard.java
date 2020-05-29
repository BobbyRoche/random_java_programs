//Robert Roche Project 2
//Gerald Cohen Ph.D.
//Due 10/6/2016
package project2;

public class BlackjackCard {

	private final int cardNumber;
	private final int cardSuit;
	private static final String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
    private static final String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
    public BlackjackCard(Card card) {
        cardNumber = card.getFaceValue();
        cardSuit = card.getSuit();
        
    }
    
    /**
     * Return the numerical value of the card
     * @return face value 1 to 10
     */
    public int getFaceValue() {
    	if(cardNumber == 12){
    		return 11;
    	}
    	else if(cardNumber > 7 && cardNumber < 12){
        	return 10;
        }
        else if(cardNumber == 7){
        	return 9;
        }
        else if(cardNumber == 6){
        	return 8;
        }
        else if(cardNumber == 5){
        	return 7;
        }
        else if(cardNumber == 4){
        	return 6;
        }
        else if(cardNumber == 3){
        	return 5;
        }
        else if(cardNumber == 2){
        	return 4;
        }
        else if(cardNumber == 1){
        	return 3;
        }
        else {
        	return 2;
        }
    }

    @Override
    /**
     * Return a string representation of this card.
     */
    public String toString() {
        return names[cardNumber] + " of " + suits[cardSuit];
    }

}