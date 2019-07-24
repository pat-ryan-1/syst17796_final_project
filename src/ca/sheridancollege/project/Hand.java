
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author Patrick Ryan
 */
public class Hand extends GroupOfCards {

    public Hand(ArrayList<Card> cards) {
        super(cards.size());
        setCards(cards);
    }
}
