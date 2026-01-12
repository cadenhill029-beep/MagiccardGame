package MagiccardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

	
	
	public ArrayList<Card> cards = new ArrayList<>();

//Sterling/Jonas: complete add and delete method which will be able to both add magic cards
//and delete them aswell.
	public void addCard(Card x) {
		cards.add(x);
	}
	public void deleteCard(Card x) {
		cards.remove(x);

	}
//Mr.Passini
	public void ShuffleDeck() {
		Collections.shuffle(cards);
	}
	
	public void cardList() {

		for (Card x : cards) {
			System.out.println(x);
		}
		
	}

	//Wyatt: add a method to search for specific cards by name, type, mana cost,  or color
	
	public static void search(String P) {
		System.out.println("searching...");
		
	}
	//carlos: complete method to update any card info I think this is called a getter/setter 
	public static void cardUpdate() {
		
		System.out.println("updating...");
	}
	
	//For now, this is Passini, make a card statistic method which will be able to show # of cards, # card types
	//# of card colors etc.
	
	public static void Stats() {
		System.out.println("Showing...");
	}
		
	/*Sterling and Jonas, I want you to make a method that tell the player how many cards
	 *total they have in their deck. 
	 */
	
	public static void DeckCount() {
		
	}

	public void drawCard() {
		
		System.out.println("Drawing...");
	
	
	
	}
	
	
	public void startGame() {
	Collections.shuffle(cards);	
	
		
	}
}


