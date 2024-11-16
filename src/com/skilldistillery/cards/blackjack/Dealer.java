package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Dealer extends Player {
	
	private Deck deck;
	
	public Dealer() {
		deck = new Deck();
	}
	
	public Card dealCard() {
		return deck.dealCard();
	}
	
	
	
	//hitMe() or stand
	//rule of 17
	//if dealerHand > playerHand && <= 21
	//print winner
}
