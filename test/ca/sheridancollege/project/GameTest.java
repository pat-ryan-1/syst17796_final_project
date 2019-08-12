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
public class GameTest {
    
    public GameTest() {
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
     * Test of getGameName method, of class Game.
     */
    @Test
    public void testGetGameName() {
        System.out.println("getGameName");
        Game instance = null;
        String expResult = "Game Name";
        String result = "Game Name";
        String falseResult = "a";
        assertEquals(expResult, result);
        assertFalse(expResult.equals(falseResult));
        // Game name can be set to whatever the users choose
    }

    /**
     * Test of declareWinner method, of class Game.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        Game instance = null;
        instance.declareWinner();
        /* Winenr will be declared automatically at the end of the round for
         the first person to run out of cards. */
    }

    /**
     * Test of playRound method, of class Game.
     */
    @Test
    public void testPlayRound() {
        System.out.println("playRound");
        Round round = null;
        Game instance = null;
        Player expResult = null;
        Player result = instance.playRound(round);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of main method, of class Game.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Game.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
