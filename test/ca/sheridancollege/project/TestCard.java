package ca.sheridancollege.project;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * Unit tests for the Card class. By proxy, the CardValue and CardColor enums
 * are also tested within this class.
 *
 * @author Patrick Ryan
 */
public class TestCard {

    public TestCard() {
    }

    // Good Tests
    @Test
    public void TestEquality() {
        Card wild = new Card(CardColor.WILD, CardValue.WILD);
        Card red_one = new Card(CardColor.RED, CardValue.ONE);
        Card wild2 = new Card(CardColor.WILD, CardValue.WILD);

        assertFalse(wild.equals(null));
        assertFalse(wild.equals(new String("a")));
        assertFalse(wild.equals(red_one));
        assertTrue(wild.equals(wild2));
    }

    @Test
    public void TestGetters() {
        Card wild = new Card(CardColor.WILD, CardValue.WILD);
        Card red_one = new Card(CardColor.RED, CardValue.ONE);

        assertEquals(red_one.getColor(), CardColor.RED);
        assertEquals(red_one.getValue(), CardValue.ONE);
        assertEquals(wild.getColor(), CardColor.WILD);
        assertEquals(wild.getValue(), CardValue.WILD);
    }

    @Test
    public void TestToString() {
        Card red_one = new Card(CardColor.RED, CardValue.ONE);
        Card wild = new Card(CardColor.WILD, CardValue.WILD);
        Card draw_four = new Card(CardColor.WILD, CardValue.DRAW_FOUR);

        assertEquals(red_one.toString(), "Red 1");
        assertEquals(wild.toString(), "Wild Wild");
        assertEquals(draw_four.toString(), "Wild Draw Four");
    }

    // Bad Tests
    @Test(expected = IllegalArgumentException.class)
    public void TestInvalidCardValue() {
        Card c = new Card(CardColor.WILD, CardValue.ONE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestInvalidCardColorDrawFour() {
        Card c = new Card(CardColor.RED, CardValue.DRAW_FOUR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestInvalidCardColorWild() {
        Card c = new Card(CardColor.RED, CardValue.WILD);
    }

    // No boundary tests exist for this class.
}
