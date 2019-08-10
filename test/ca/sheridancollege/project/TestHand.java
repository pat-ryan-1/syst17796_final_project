package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * This class tests the methods implemented in the abstract class GroupOfCards,
 * obtained through the Hand class.
 *
 * NOTE: GroupOfCards is merely a restrictive wrapper of an ArrayList<Card>
 * with descriptive method names. Hence, a majority of the API does not need to
 * be tested, we assume the JDK is well-implemented.
 *
 * @author Patrick Ryan
 */
public class TestHand {

    public TestHand() {
    }

    // Good tests and boundary tests. Boundaries exist at the start and end of
    // the underlying list, and are covered in both remove and get tests
    @Test
    public void TestGet() {

        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(CardColor.BLUE, CardValue.ONE));
        cards.add(new Card(CardColor.RED, CardValue.ONE));
        cards.add(new Card(CardColor.GREEN, CardValue.ONE));
        cards.add(new Card(CardColor.YELLOW, CardValue.ONE));
        Hand hand = new Hand(cards);

        assertEquals(hand.get(0), new Card(CardColor.BLUE, CardValue.ONE));
        assertEquals(hand.get(1), new Card(CardColor.RED, CardValue.ONE));
        assertEquals(hand.get(2), new Card(CardColor.GREEN, CardValue.ONE));
        assertEquals(hand.get(3), new Card(CardColor.YELLOW, CardValue.ONE));
    }

    @Test
    public void TestRemove() {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(CardColor.BLUE, CardValue.ONE));
        cards.add(new Card(CardColor.RED, CardValue.ONE));
        cards.add(new Card(CardColor.GREEN, CardValue.ONE));
        cards.add(new Card(CardColor.YELLOW, CardValue.ONE));
        Hand hand = new Hand(cards);

        // non boundary removal
        assertEquals(hand.remove(2), new Card(CardColor.GREEN, CardValue.ONE));

        // end boundary removal
        assertEquals(hand.remove(2), new Card(CardColor.YELLOW, CardValue.ONE));
        // start boundary removal
        assertEquals(hand.remove(0), new Card(CardColor.BLUE, CardValue.ONE));

        // ensure we actually removed things...
        assertEquals(hand.getSize(), 1);

        // another start boundary removal, this time emptying the hand
        assertEquals(hand.remove(0), new Card(CardColor.RED, CardValue.ONE));

        // ensure we are at an empty hand
        assertEquals(hand.getSize(), 0);
    }
    
        @Test
    public void TestForEachLoop() {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(CardColor.WILD, CardValue.WILD));
        cards.add(new Card(CardColor.WILD, CardValue.DRAW_FOUR));
        cards.add(new Card(CardColor.RED, CardValue.ONE));
        cards.add(new Card(CardColor.GREEN, CardValue.TWO));
        cards.add(new Card(CardColor.BLUE, CardValue.THREE));
        Hand hand = new Hand(cards);
        
        int i = 0;
        for (Card card : hand) {
            assertEquals(card, cards.get(i));
            ++i;
        }
    }
    
    // Bad tests

    @Test(expected = IllegalArgumentException.class)
    public void TestEmptyGet() {
        Hand hand = new Hand(new ArrayList<>());
        hand.get(0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void TestOutOfBoundsGet() {
        Hand hand = new Hand(new ArrayList<>());
        hand.add(new Card(CardColor.WILD, CardValue.WILD));
        hand.get(1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void TestEmptyRemove() {
        Hand hand = new Hand(new ArrayList<>());
        hand.remove(0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void TestOutOfBoundsRemove() {
        Hand hand = new Hand(new ArrayList<>());
        hand.add(new Card(CardColor.WILD, CardValue.WILD));
        hand.remove(1);
    }
    
}
