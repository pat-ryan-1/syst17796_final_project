/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kd
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPlayerID method, of class Player.
     */
    @Test
    public void testGetPlayerID() {
        System.out.println("getPlayerID");
        Player instance = null;
        String expResult = "";
        String result = instance.getPlayerID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerID method, of class Player.
     */
    @Test
    public void testSetPlayerID() {
        System.out.println("setPlayerID");
        String givenID = "";
        Player instance = null;
        instance.setPlayerID(givenID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHand method, of class Player.
     */
    @Test
    public void testGetHand() {
        System.out.println("getHand");
        Player instance = null;
        Hand expResult = null;
        Hand result = instance.getHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHand method, of class Player.
     */
    @Test
    public void testSetHand() {
        System.out.println("setHand");
        Hand hand = null;
        Player instance = null;
        instance.setHand(hand);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCard method, of class Player.
     */
    @Test
    public void testGetCard() {
        System.out.println("getCard");
        int index = 0;
        Player instance = null;
        Card expResult = null;
        Card result = instance.getCard(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCardToHand method, of class Player.
     */
    @Test
    public void testAddCardToHand() {
        System.out.println("addCardToHand");
        Card c = null;
        Player instance = null;
        instance.addCardToHand(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCardFromHand method, of class Player.
     */
    @Test
    public void testRemoveCardFromHand() {
        System.out.println("removeCardFromHand");
        Card c = null;
        Player instance = null;
        Card expResult = null;
        Card result = instance.removeCardFromHand(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Player.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object other = null;
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.equals(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
