package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class Player {
	
	protected BlackjackHand hand;
	
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
	
	public boolean isBlackjack() {
		return hand.isBlackjack();
	}
	
	public boolean isBust() {
		return hand.isBust();
	}
}
