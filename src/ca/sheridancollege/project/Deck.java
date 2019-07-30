
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * This class models the Uno game's deck.
 * 
 * @author Patrick Ryan
 */
public class Deck extends GroupOfCards {

    public Deck(ArrayList<Card> cards) {
        super(cards);
    }
    
    /**
     * Remove and return the top card of the deck. If the deck is empty, an
     * IllegalStateException is thrown
     * @return the card at the top of the deck
     * @throws IllegalStateException if the deck is empty
     */
    public Card draw() throws IllegalStateException {
        
        if (isEmpty()) {
            throw new IllegalStateException("Deck is empty");
        }
        
        return remove(getSize() - 1);
    }
}
