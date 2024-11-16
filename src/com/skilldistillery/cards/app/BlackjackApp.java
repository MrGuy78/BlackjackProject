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
		app.startGame();
	}
	
	public void startGame() {
		
	}
	
	public void showWinner() {
		if(player.getHandValue() > dealer.getHandValue()) {
			System.out.println("Winner!");
		}
		else if(player.getHandValue() < dealer.getHandValue()) {
			System.out.println("Loser!");
		}
		else {
			System.out.println("Push!");
		}
	}

}
