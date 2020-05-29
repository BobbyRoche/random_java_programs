//Robert Roche Project 2
//Gerald Cohen Ph.D.
//Due 10/6/2016
package project2;
import java.util.ArrayList;

public class BlackjackHand implements Comparable<BlackjackHand> {

	private final ArrayList<BlackjackCard> hand;
    public BlackjackHand() {
        hand = new ArrayList<BlackjackCard>();
    }
    
    public void addCard(BlackjackCard card) {
        hand.add(card);
    }
    
    public BlackjackCard getCard(int i) {
        if (i >= hand.size()) return null;
        return hand.get(i);
    }

    /**
     * Determine the value of the cards in as hand
     * If an Ace does not cause the ranking to exceed 21 then its value is
     * counted as an 11
     * @return value of the hand
     */
    public int getRank() {
    	int currentRank = 0;
        for(int i = 0; i < hand.size(); i++){
        	if(hand.get(i).getFaceValue() + currentRank > 21 && hand.get(i).getFaceValue() == 11){
        		currentRank = currentRank + 1;
        	}
        	else {
        		currentRank = currentRank + hand.get(i).getFaceValue();
        	}
        }
        return currentRank;
    }

    @Override
    public int compareTo(BlackjackHand otherBlackjackHand) {
        if(this.getRank() > otherBlackjackHand.getRank()){
        	return 1;
        }
        else {
        	return 0;
        }
    }
    
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
