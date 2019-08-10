/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author kd
 */
public class Round {

    private Player p1;
    private Player p2;
    private PlayedCardPile pcp;
    private Deck deck;
    private Turn turn;

    public Round(Player p1, Player p2, PlayedCardPile pcp, Deck deck) {
        this.p1 = p1;
        this.p2 = p2;
        this.pcp = pcp;
        this.deck = deck;
        this.turn = turn;
    }

    public Player play() {

        Player currentPlayer = p1;
        Scanner input = new Scanner(System.in);
        while (p1.getHand().getSize() > 0 && p2.getHand().getSize() > 0) {
            int selection = getCardSelection(input);
            while (!playTurn(currentPlayer, selection, pcp)) {
                System.out.println("Pick one of the following:\n"
                        + "1. Pick a Different Card\n"
                        + "2. Draw Card");
                int response = input.nextInt();
                if (response == 1) {
                    getCardSelection(input);
                } else if (response == 2) {
                    currentPlayer.addCardToHand(deck.draw());
                }
            }
            currentPlayer = currentPlayer.equals(p1) ? p2 : p1; //switches players
        }
        
        Player winner = null;
        if (p1.getHand().getSize() == 0) {
            winner = p1;
        } else {
            winner = p2;
        }
        return winner;
    }
    
    public int getCardSelection(Scanner input) {
        System.out.print("Which card would you like to play?");
        int selection = input.nextInt() - 1;
        return selection;
    }

    public boolean playTurn(Player cp, int selection, PlayedCardPile pcp) {
        System.out.print(cp.getHand());
        boolean playable = Turn.playable(cp.getCard(selection), pcp.getTop());
        if (playable) {
            cp.removeCardFromHand(cp.getCard(selection));
            pcp.add(cp.getCard(selection));
            return true;
        } else {
            return false;
        }
    }
}
