import java.util.ArrayList;

public class Deck {

	public ArrayList<Card> cards = new ArrayList<>();


	public void addCard(Card x) {
		cards.add(x);
	}

	public void cardList() {

		for (Card x : cards) {
			System.out.println(x);
		}
	}

}


