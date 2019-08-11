/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 *
 * Patrick Ryan and Karam Fasih
 * June 9, 2019
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The class that models your game. You should create a more specific child of
 * this class and instantiate the methods given.
 *
 * @author dancye, 2018
 */
public class Game {
    
    private Player p1;
    private Player p2;
    private Round r1;
    private Round r2;
    private final String gameName;

    public Game(String gameName, Player p1, Player p2) {
        this.gameName = gameName;
        this.p1 = p1;
        this.p2 = p2;
       
    }

    /**
     * @return the gameName
     */
    public String getGameName() {
        return gameName;
    }

    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public void declareWinner() {
        r1 = new Round(p1, p2);
        playRound(r1);
        r2 = new Round(p1, p2);
        playRound(r2);
        if (playRound(r1).equals(playRound(r2))){
            System.out.print("Winner of the game is " + playRound(r1));
        } else {
            Round r3 = new Round(p1, p2);
            if (playRound(r3).equals(playRound(r1)) || 
                    playRound(r3).equals(playRound(r2))) {
                System.out.print("Winner of the game is " + playRound(r3));
            }
        }
        
    }
    
    public Player playRound(Round round) {
        Player winner = round.play();
        return winner;
    }
    
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What would you like to call this uno match?\n");
        String gameName = input.nextLine();
        System.out.print("Enter player one's name:\n");
        String p1Name = input.nextLine();
        System.out.print("Enter player two's name:\n");
        String p2Name = input.nextLine();
        
        Player p1 = new Player(p1Name, new Hand(new ArrayList<Card>()));
        Player p2 = new Player(p2Name, new Hand(new ArrayList<Card>()));
        
        Game game = new Game(gameName, p1, p2);
        game.declareWinner();
    }

}//end class
