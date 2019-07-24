/**
 * SYST 17796 Project Winter 2019
 *
 * Patrick Ryan and Karam Fasih
 * June 9, 2019
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than once. The group of cards has a maximum
 * size attribute which is flexible for reuse.
 *
 * @author dancye
 */
public abstract class GroupOfCards {

    private int size;
    private ArrayList<Card> cards;

    public GroupOfCards(int size) {
        this.size = size;
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public final ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public final int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public final void setSize(int size) {
        this.size = size;
    }
    
    public final void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

}//end class
