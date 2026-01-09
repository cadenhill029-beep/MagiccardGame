

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

	/*Sterling/Jonas, this is your job.
	 * 
	 * The purpose of these methods is to get and individual's card's
	 * info. For instance if I have fully complete card, this method
	 * just tells the user the name part of the card. 
	 * 
	 */
	public String getCardName() { //Sterling

		return "";
	}
	public String getCardType() {//Jonas

		return "";
	}public String getCardDescription() { //Sterling

		return "";
	}
	public String getCardColor() { //Jonas

		return "";
	}
	public String getCardPower() { //Sterling

		return "";
	}public String getCardToughness() { //Jonas

		return "";
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
	    return "************ Card Info ************\n"
	         + "Name: " + Cards.get("name") + "\n"
	         + "Type: " + Cards.get("type") + "\n"
	         + "Color: " + Cards.get("color") + "\n"
	         + "Card Text: " + Cards.get("Text") + "\n"
	         + "***********************************";
	}
}
