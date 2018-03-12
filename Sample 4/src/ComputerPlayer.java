//Alpcan Yildiz 220201049 - Ismail Burak Kurhan 220201055 - HW 4
import java.util.ArrayList;

import java.util.concurrent.ThreadLocalRandom;

public class ComputerPlayer extends Player {

	public ComputerPlayer() {
		super();
		cardList = new ArrayList<Card>();
		setName();

	}
	public void setName() {

		this.name = "ComputerBotJohny";
		
	}
	
	

public Card getNextCard(Card card){
	if (card==null)
		return cardList.remove(cardList.indexOf(cardList.get(ThreadLocalRandom.current().nextInt(0, cardList.size())))) ;
		
	boolean flag = true;
	for (int i=0; i<cardList.size();i++){ 
		if(cardList.get(i).getNumber()>card.getNumber()){
		flag = false;	
		return cardList.remove(i);
		
		}
	
		
}
	if (flag){
		for (int i=0; i<cardList.size();i++){ 
			if(cardList.get(i).getNumber()==card.getNumber()){
			flag = false;	
			return cardList.remove(i);
			
			}
		}
	}
	if (flag){
		return cardList.remove(0);	
	}
	
	else{
		return null;
	}
	

}
}