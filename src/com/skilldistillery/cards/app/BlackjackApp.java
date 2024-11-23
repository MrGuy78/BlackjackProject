package com.skilldistillery.cards.app;

import java.util.Scanner;

import com.skilldistillery.cards.blackjack.Dealer;
import com.skilldistillery.cards.blackjack.Player;

public class BlackjackApp {

	private Dealer dealer;
	private Player player;
	private Scanner kb;

	private BlackjackApp() {
		dealer = new Dealer();
		player = new Player();
		kb = new Scanner(System.in);
	}

	public static void main(String[] args) {
		BlackjackApp app = new BlackjackApp();
		boolean kennyRogersInTheHouse = true;
		do {
			System.out.println("Welcome to the SD Blackjack App. "
					+ "Enter any key to start a game or Q to quit: ");
			String anyKey = new String();
			anyKey = kb.next();
			if(anyKey == "Q") {
				System.out.println("Why did you even come to a casino? ");
				break;
			}
			else {
				app.startGame();
			}
		}
		while(kennyRogersInTheHouse);
		
		}
//	public void dealStackedDeck() {
//		player.hitMe(new Card(Rank.ACE, Suit.CLUBS));
//		player.hitMe(new Card(Rank.TWO, Suit.CLUBS));
//		
//		
//		dealer.hitMe(new Card(Rank.ACE, Suit.CLUBS));
//		dealer.hitMe(new Card(Rank.JACK, Suit.CLUBS));
//	}
	
	public void startGame() {
		dealer.shuffleDeck();
		dealHands();
//		dealStackedDeck();
		player.showHand();
		if (player.isBlackjack()) {
			System.out.println("Blackjack! You win! ");
			return;
		}
		dealer.showDealerHand();
		playerTurn();
		dealerTurn();
		showWinner();
	}

	public void playerTurn() {

		player.showHand();
		System.out.println("Player has " + player.getHandValue() + ". " + "Hit or stay? H or S. ");
		String hitMe = kb.next();
		boolean gameOn = true;
		while (gameOn) {
			if (hitMe.equalsIgnoreCase("H")) {
				player.hitMe(dealer.dealCard());
				System.out.print("Player now has: " + player.getHandValue());
				player.showHand();
				if (player.isBust()) {
					System.out.println("Busted!");
					break;
				}
				System.out.println("Hit or stay? ");
				hitMe = kb.next();

			}
			else if (hitMe.equalsIgnoreCase("S")) {
				gameOn = false;
			}
		}
	}

	public void dealerTurn() {
		System.out.print("Dealer now has: " + dealer.getHandValue());
		dealer.showHand();
		if (dealer.getHandValue() < 17) {
			dealer.hitMe(dealer.dealCard());
			System.out.print("Dealer now has: " + dealer.getHandValue());
			dealer.showHand();
		} else if (dealer.getHandValue() > 17) {
			return;
		}
	}

	public void showWinner() {
		
		if(player.isBust() && !dealer.isBust()) {
			System.out.println("Player busted, Dealer wins!");
		} else if(!player.isBust() && dealer.isBust()) {
			System.out.println("Dealer busted, Player wins!");
		} else if (player.getHandValue() > dealer.getHandValue()) {
			System.out.println("Winner!");
		} else if (player.getHandValue() < dealer.getHandValue()) {
			System.out.println("Loser!");
		} else {
			System.out.println("Push!");
		}
	}

	public void dealHands() {
		player.hitMe(dealer.dealCard());
		dealer.hitMe(dealer.dealCard());
		player.hitMe(dealer.dealCard());
		dealer.hitMe(dealer.dealCard());
	}

}
