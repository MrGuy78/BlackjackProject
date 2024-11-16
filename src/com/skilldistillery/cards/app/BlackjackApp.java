package com.skilldistillery.cards.app;

import java.util.Scanner;

import com.skilldistillery.cards.blackjack.BlackjackHand;
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
		app.startGame();
	}

	public void startGame() {
		dealer.shuffleDeck();
		dealHands();
		player.showHand();
		if(player.isBlackjack()) {
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
		System.out.println("Player has " + player.getHandValue() + ". " 
				+ "Hit or stay? H or S. ");
		String hitMe = kb.next();

		while (hitMe.equalsIgnoreCase("H")) {
			player.hitMe(dealer.dealCard());
			System.out.print("Player now has: " + player.getHandValue());
			player.showHand();
			if(player.isBust()) {
				System.out.println("Busted!");
				break;
			}
			System.out.println("Hit or stay? ");
			hitMe = kb.next();
			

			if (hitMe.equalsIgnoreCase("S")) {
				break;
			}
		}

	}

	public void dealerTurn() {
		dealer.showDealerHand();
	}

	public void showWinner() {
		if (player.getHandValue() > dealer.getHandValue()) {
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
