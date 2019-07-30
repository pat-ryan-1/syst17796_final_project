
package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * This class tests the PlayedCardPile class and it's associated methods. Note
 * most of the API has been tested by the TestHand class.
 * 
 * @author pear
 */
public class TestDiscardPile {
    
    public TestDiscardPile() {
    }
    
    // Good tests and boundary tests. These tests include the only boundary state:
    // when there are no cards in the pile to begin with.
    @Test
    public void TestPut() {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(CardColor.BLUE, CardValue.EIGHT));
        PlayedCardPile pile = new PlayedCardPile(cards);
        
        Card red_nine = new Card(CardColor.RED, CardValue.NINE);
        pile.put(red_nine);
        assertEquals(pile.getTop(), new Card(CardColor.RED, CardValue.NINE));
        assertNotEquals(pile.getTop(), new Card(CardColor.RED, CardValue.TEN));
    }
    
    @Test
    public void TestGetTop() {
        PlayedCardPile pile = new PlayedCardPile(new ArrayList<>());
        pile.put(new Card(CardColor.RED, CardValue.NINE));
        pile.put(new Card(CardColor.RED, CardValue.TEN));
        pile.put(new Card(CardColor.GREEN, CardValue.DRAW_TWO));
        
        assertEquals(pile.getTop(), new Card(CardColor.GREEN, CardValue.DRAW_TWO));
    }
    
    // Bad Tests
    
    @Test(expected = IllegalStateException.class)
    public void TestBadGetTop() {
        PlayedCardPile pile = new PlayedCardPile(new ArrayList<>());
        pile.getTop(); // should throw!
    }
}
