package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class Player {
	
	private BlackjackHand hand;
	
	public Player() {
		hand = new BlackjackHand();
	}
	
	public void hitMe(Card card) {
		hand.addCard(card);
	}
	
	public void newHand() {
		hand.clearHand();
	}
	
	private int getHandValue() {
		hand.getHandValue();
	}
	return int;
	
	//NO getHand()
	//hitMe() or Stand
	//if playerHand > dealerHand && <= 21
	//print winner
	
}
