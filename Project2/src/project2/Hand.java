//Robert Roche Project 2
//Gerald Cohen Ph.D.
//Due 10/6/2016
package project2;


import java.util.ArrayList;


public abstract class Hand<T> {

    private final ArrayList<T> hand;

    public Hand() {
        hand = new ArrayList<>();
    }

    /**
     * Add a card to this hand
     * @param card to be added
     */
    public void addCard(T card) {
        hand.add(card);
    }

    /**
     * Remove a specific card from this hand
     * @param card to be removed
     * @return 
     */
    public boolean removeCard(T card) {
        return hand.remove(card);
    }
    
    /**
     * Determine the numerical ranking of a card 0 to N
     * 0 being the lowest
     * @return number representing the numerical rank
     */
    public abstract int getRank();
    
    /**
     * Returns the number of cards in the hand
     * @return number of cards in the hand
     */
    public int size() {
        return hand.size();
    }
    
    /**
     * return a card from the hand having n cards
     * @param i number of the card returned 0 : n-1
     * @return the ith card in the hand or null if invalid
     */
    public T getCard(int i) {
        if (i >= hand.size()) return null;
        return hand.get(i);
    }

    @Override
    public String toString() {
        if (hand.size() == 0) {
            return "[<empty>]";
        }
        String currentHand = "[ " + hand.get(0);
        for (int i = 1; i < hand.size(); i++) {
            currentHand += " | " + hand.get(i);
        }
        return currentHand + " ]";
    }

}
