package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Dealer extends Player {
	
	private Deck deck;
	
	private BlackjackHand hand;
	
	public Dealer() {
		deck = new Deck();
		hand = new BlackjackHand();
	}
	
	public Card dealCard() {
		return deck.dealCard();
	}
	
	public void hitMe(Card card) {
		hand.addCard(card);
	}
	
	public void showDealerHand() {
		hand.dealerHand();
	}
	
	public void shuffleDeck() {
		deck.shuffleDeck();
	}
	
}
