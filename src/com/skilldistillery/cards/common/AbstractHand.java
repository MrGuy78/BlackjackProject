package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractHand {
	
	protected List<Card> cardsInHand;
	
	public AbstractHand() {
		cardsInHand = new ArrayList<>();
	}
	
	public abstract int getHandValue();
	
	public void addCard(Card card) {
		cardsInHand.add(card);
	}
	
	public void clearHand() {
		cardsInHand = new ArrayList<>();
	}

	@Override
	public String toString() {
		return cardsInHand + "";
	}

}
