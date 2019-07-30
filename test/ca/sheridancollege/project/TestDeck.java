/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class Tests the Deck class. Note that most of the API for this class has
 * already been tested in the TestHand class.
 *
 * @author pear
 */
public class TestDeck {

    public TestDeck() {
    }

    // Good and boundary tests. The only boundary condition exists when the 
    // deck has a single card left in it.
    @Test
    public void TestDraw() {
        Deck deck = new Deck(new ArrayList<>());
        deck.add(new Card(CardColor.WILD, CardValue.DRAW_FOUR));

        assertEquals(deck.draw(), new Card(CardColor.WILD, CardValue.DRAW_FOUR));
    }

    // Bad Tests
    @Test(expected = IllegalStateException.class)
    public void TestBadDraw() {
        Deck deck = new Deck(new ArrayList<>());
        deck.draw();
    }

}
