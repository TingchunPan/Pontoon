package com.bham.pij.assignments.pontoon;
//Tingchun Pan 2147761
import java.util.ArrayList;
import java.util.Set;
public abstract class CardGame {
	private Deck deck;
	private ArrayList<Player> players;
	public CardGame (int nplayers) {
	 Deck deck= new Deck();
	
	}
	public abstract void dealInitialCards();
	public abstract int compareHands(Player hand1, Player hand2);

	public Deck getDeck() {
		return deck;
	}
	public Player getPlayer(int i) {
		return players.get(i);
	} 
	public int getNumPlayers() {
		return players.size();
	}
}
