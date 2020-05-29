//Robert Roche Project 2
//Gerald Cohen Ph.D.
//Due 10/6/2016
package project2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BlackJack {

    public static String getAuthor() {
        return "G Cohen";
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deck deck = new Deck();

        BlackjackHand dealer = new BlackjackHand();
        BlackjackHand player = new BlackjackHand();

        BlackjackCard dealerUpCard = null;

        try {
            // deal first two cards
            player.addCard(new BlackjackCard(deck.deal()));
            player.addCard(new BlackjackCard(deck.deal()));
            dealer.addCard(new BlackjackCard(deck.deal()));
            dealer.addCard(new BlackjackCard(deck.deal()));
            dealerUpCard = dealer.getCard(1);
            if (player.getRank() == 21) {
                declareHand("Player", "wins", player);
            }
        } catch (EmptyDeckException ex) {
            Logger.getLogger(BlackJack.class.getName()).log(Level.SEVERE, null, ex);
        }

        declareHand("Player", "holds", player);
        declareHand("Dealer", "holds", dealer);
        // Player goes first
        if (dealerUpCard.getFaceValue() < 9) // Hold is dealer has a high card
        {
            do {
                try {
                    // deal another card to player
                    player.addCard(new BlackjackCard(deck.deal()));
                    declareHand("Player", "draws to", player);
                    if (player.getRank() >= 18) {
                        break;  // Hold on 18
                    }
                } catch (EmptyDeckException ex) {
                    Logger.getLogger(BlackJack.class.getName()).log(Level.SEVERE, null, ex);
                }
            } while (player.getRank() < 21);
        }

        if (isBusted(player)) {
            declareHand("Player", "busted", player);
            System.exit(0);

        }

        while (dealer.getRank() < 16) {
            try {
                // deal another card to dealer
                dealer.addCard(new BlackjackCard(deck.deal()));
                declareHand("Dealer", "draws to", dealer);
            } catch (EmptyDeckException ex) {
                Logger.getLogger(BlackJack.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (isBusted(dealer)) {
            declareHand("Player", "busted", dealer);
            System.exit(0);

        }

        if (player.compareTo(dealer) > 0) {
            declareHand("Player", "wins", player);
            declareHand("Dealer", "lost", dealer);
        } else {
            declareHand("Player", "lost or tied", player);
            declareHand("Dealer", "won or tied ", dealer);
        }

    }

    private static boolean isBusted(BlackjackHand hand) {
        return hand.getRank() > 21;
    }

    private static void declareHand(String p, String message, BlackjackHand hand) {
        System.out.println(p + " " + message + " " + hand.getRank() + ": " + hand);
    }

}
