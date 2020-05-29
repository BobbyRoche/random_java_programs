//Robert Roche Project 2
//Gerald Cohen Ph.D.
//Due 10/6/2016

package project2;

public final class Card {

    private static final String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
    private static final String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
    private final int cardNumber;

   public Card(int cardNumber) {
        this.cardNumber = cardNumber;
    }
    
    /**
     * Return the numerical value of the card
     * @return face value 1 to 13
     */
    public int getFaceValue() {
    	int faceValue;
        if(cardNumber > 38){
        	faceValue = cardNumber - 39;
        }
        else if(cardNumber > 25){
        	faceValue = cardNumber - 26;
        }
        else if(cardNumber > 12){
        	faceValue = cardNumber - 13;
        }
        else {
        	faceValue = cardNumber;
        }
        return faceValue;
    }
    
    public int getSuit() {
    	int suit;
        if(cardNumber > 38){
        	suit = 3;
        }
        else if(cardNumber > 25){
        	suit = 2;
        }
        else if(cardNumber > 12){
        	suit = 1;
        }
        else {
        	suit = 0;
        }
        return suit;
    }

    public String toString() {
        int suit, faceValue;
        suit = getSuit();
        faceValue = getFaceValue();
        return names[faceValue] + " of " + suits[suit];
    }

}
