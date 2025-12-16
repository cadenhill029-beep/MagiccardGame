import java.util.HashMap;


public class Card {

	HashMap<String, String> Cards = new HashMap<>();
	
	
	public Card(String name, String color, String type, String textBox) {
		
		Cards.put("name", name);
		Cards.put("type", type);
		Cards.put("color", color);
		Cards.put("Text", textBox);
		
		//A boolean variable that doesn't print in toString but now
		//you can have a method in Deck that can do stuff with mana
		//Say, how many islands you have in your deck
	}
	
	public HashMap<String, String> getInfo() {
		return Cards;
	}
	
	
	/*
	 * Mr. Passini, your in charge of the toString method. What
	 * I want it to look like is something like this, you can 
	 * be creative, but stay within this kind of format:
	 * 
	 * ************Card Info*************
	 * Name: Sol Ring
	 * Type: Artifact
	 * Color: None 
	 * Card Text: ....
	 */
	public String toString() {
		return "Magic Card";
	}

	public static void add(Card x) {

		
	}
	

}
