//Alpcan Yildiz 220201049 - Ismail Burak Kurhan 220201055 - HW 4
import java.util.ArrayList;

public class Player {

	protected String name;
	private int score;
	protected ArrayList<Card> cardList;

	public Player() {
		this.name = null;
		this.score = 0;

	}
	

	public Player(String name, int score) {
		this.name = name;
		this.score = score;
	
	}


	public Card getNextCard(Card card) {
		// TODO Auto-generated method stub
		return null;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void addScore(int score) {
		this.score += score;
	}

	public ArrayList<Card> getPlayer_cardList() {
		return cardList;
	}

	public void add_cardList(Card card) {
		this.cardList.add(card);

	}


	

}
