//Robert Roche Project 2
//Gerald Cohen Ph.D.
//Due 10/6/2016
package project2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;


public final class Deck {

    private final ArrayList<Card> deckOfCards = new ArrayList<>();

    public Deck() {
        for(int i = 0; i < 52; i++){
        	Card toBeAdded = new Card(i);
        	deckOfCards.add(toBeAdded);
        }
        Collections.shuffle(deckOfCards);
    }

    public Card deal() throws EmptyDeckException {
        if (deckOfCards.isEmpty()) {
            throw new EmptyDeckException("Cannot deal from an empty deck");
        }
        Card toBeThrown = deckOfCards.get(0);
        deckOfCards.remove(0);
        return toBeThrown;
        
        
    }
    @Override
    public String toString() {
        return "Deck has " + deckOfCards.size() + " cards remaining";
    }
}

