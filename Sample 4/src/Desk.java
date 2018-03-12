//Alpcan Yildiz 220201049 - Ismail Burak Kurhan 220201055 - HW 4
import java.util.ArrayList;
import java.util.Collections;

public class Desk {

	private ArrayList<Card> card_list;

	public Desk() {

		card_list = new ArrayList<Card>();
	}

	public ArrayList<Card> getCard_list() {
		return card_list;
	}

	public void addCard_list(Card card) {
		card_list.add(card);
	}

	public void init() {

		for (int i = 1; i < 14; i++) {
			CardType type = CardType.SPADES;
			Card c = new Card(i, type);
			card_list.add(c);
		}
		for (int i = 1; i < 14; i++) {
			CardType type = CardType.CLUBS;
			Card c = new Card(i, type);
			card_list.add(c);

		}
		for (int i = 1; i < 14; i++) {
			CardType type = CardType.HEARTS;
			Card c = new Card(i, type);
			card_list.add(c);

		}
		for (int i = 1; i < 14; i++) {
			CardType type = CardType.DIAMONDS;
			Card c = new Card(i, type);
			card_list.add(c);
		}

		Collections.shuffle(card_list);

	}
	

}
