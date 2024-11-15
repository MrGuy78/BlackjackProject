package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> deck;
	
	public Deck() {
		deck = new ArrayList<>(52);
		
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck.add(new Card(r, s));
			}
		}
	}
	
	public int checkDeckSize() {
		return deck.size();
	}
	
	public void shuffleDeck() {
		 Collections.shuffle(deck);
	}

	public Card dealCard() {
		return deck.remove(0);
	}
}
