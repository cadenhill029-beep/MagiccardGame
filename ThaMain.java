import java.util.Scanner;

public class ThaMain {

	public static void main(String[] args) {

		//Scanner console = new Scanner(System.in);
		
		Card island = new Card("Island","mana","blue","used for blue spells");
		Deck CadenDeck = new Deck();
		CadenDeck.addCard(island);
		CadenDeck.cardList();
	}
	
	
	public static void startGame() {
		
	}

}
