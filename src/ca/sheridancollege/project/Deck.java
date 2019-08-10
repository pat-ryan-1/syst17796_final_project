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
     *
     * @return the card at the top of the deck
     * @throws IllegalStateException if the deck is empty
     */
    public Card draw() throws IllegalStateException {

        if (isEmpty()) {
            throw new IllegalStateException("Deck is empty");
        }

        return remove(getSize() - 1);
    }

    public static Deck standardDeckFactory() {
        Deck d = new Deck(new ArrayList<>());

        // Add two of each standard number cards, skip, and draw two for colours
        for (int i = 0; i < 2; ++i) {
            for (CardColor color : CardColor.values()) {
                d.add(new Card(color, CardValue.ONE));
                d.add(new Card(color, CardValue.TWO));
                d.add(new Card(color, CardValue.THREE));
                d.add(new Card(color, CardValue.FOUR));
                d.add(new Card(color, CardValue.FIVE));
                d.add(new Card(color, CardValue.SIX));
                d.add(new Card(color, CardValue.SEVEN));
                d.add(new Card(color, CardValue.EIGHT));
                d.add(new Card(color, CardValue.NINE));
                d.add(new Card(color, CardValue.SKIP));
                d.add(new Card(color, CardValue.DRAW_TWO));
                
                // add wilds
                d.add(new Card(CardColor.WILD, CardValue.WILD));
                d.add(new Card(CardColor.WILD, CardValue.WILD));
                d.add(new Card(CardColor.WILD, CardValue.DRAW_FOUR));
                d.add(new Card(CardColor.WILD, CardValue.DRAW_FOUR));
            }
        }
        
        d.shuffle();
        return d;
    }
}
