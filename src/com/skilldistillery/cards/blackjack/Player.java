package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class Player {
	
	//FIELDS
	private BlackjackHand hand;
	//NO List<Card>
	
	public Player() {
		hand = new BlackjackHand();
	}
	
	public void hitMe(Card card) {
		hand.addCard(card);
	}
	//NO getHand()
	//hitMe() or Stand
	//if playerHand > dealerHand && <= 21
	//print winner
	
}
