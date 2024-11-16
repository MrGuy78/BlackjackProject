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
	
	public int getHandValue() {
		return hand.getHandValue();
	}
	
	public void showHand() {
		System.out.println(hand);
	}
	
}
