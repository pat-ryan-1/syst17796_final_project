/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Scanner;
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
public class RoundTest {
    
    public RoundTest() {
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
     * Test of play method, of class Round.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        Round instance = null;
        Player expResult = null;
        Player result = instance.play();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardSelection method, of class Round.
     */
    @Test
    public void testGetCardSelection() {
        System.out.println("getCardSelection");
        Scanner input = null;
        int max = 0;
        Round instance = null;
        int expResult = 0;
        int result = instance.getCardSelection(input, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playTurn method, of class Round.
     */
    @Test
    public void testPlayTurn() {
        System.out.println("playTurn");
        Player cp = null;
        int selection = 0;
        Round instance = null;
        boolean expResult = false;
        boolean result = instance.playTurn(cp, selection);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayTurnInfo method, of class Round.
     */
    @Test
    public void testDisplayTurnInfo() {
        System.out.println("displayTurnInfo");
        Player player = null;
        Round instance = null;
        instance.displayTurnInfo(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class Round.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        Round instance = null;
        Card expResult = null;
        Card result = instance.draw();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
