//Alpcan Yildiz 220201049 - Ismail Burak Kurhan 220201055 - HW 4
import java.util.ArrayList;

public class HumanPlayer extends Player {

	public HumanPlayer() {
		super();
		cardList = new ArrayList<Card>();

	}
	@Override
	public Card getNextCard(Card card){
		
		return cardList.remove(cardList.indexOf(card));
		
		
	}


}
