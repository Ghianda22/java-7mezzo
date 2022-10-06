package com.setteemezzo;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		int[] deck = new int[40];
		boolean found = true;
		
		for(int i = 0; i<40; i++) {
			do {
				found = true;
				int randomNum = r.nextInt(40)+1;
				for(int j = 0; j < i; j++) {
					if(deck[j] == randomNum) {
						found = false;
					}
				}
				if(found) deck[i] = randomNum;
			}while(!found);
			
			System.out.println(deck[i]);
		}
		
		//TEST 
//		Arrays.sort(deck);
//		for(int i = 0; i < deck.length; i++) {
//			switch(i/10) {
//				case 0:
//					cardSeed = "bastoni";
//					break;
//				case 1:
//					cardSeed = "coppe";
//					break;
//				case 2:
//					cardSeed = "denari";
//					break;
//				case 3:
//					cardSeed = "spade";
//					break;
//				default:
//			}
//			int drawnCardNum = deck[i]%10 == 0 ? 10 : deck[i]%10;
//			System.out.println(deck[i] + " E' uscito il " + drawnCardNum + " di " + cardSeed);
//		}
		
		//game logic
		boolean card = true;
		int cardInDeck = deck.length;
		String cardSeed = "";
		float playerScore = 0;
		float dealerScore = 0;
				
		while(card) {
			//estraggo una carta e la mostro
			int drawnCard = deck[cardInDeck-1];
			int drawnCardNum = drawnCard%10 == 0 ? 10 : drawnCard%10;
			switch((drawnCard-1)/10) {
				case 0:
					cardSeed = "bastoni";
					break;
				case 1:
					cardSeed = "coppe";
					break;
				case 2:
					cardSeed = "denari";
					break;
				case 3:
					cardSeed = "spade";
					break;
				default:
			}
			System.out.println("E' uscito il " + drawnCardNum + " di " + cardSeed);
			
			//calcolo punteggio
			if(drawnCardNum > 10) {
				
			}
			//controllo se è oltre 7,5
			
			System.out.println("Carta? Y/N");
			char answ = in.nextLine().toUpperCase().charAt(0);
			card = answ == 'Y' ? true : false;
			
			cardInDeck--;
		}			
	}
}
