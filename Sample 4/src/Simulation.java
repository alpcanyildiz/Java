//Alpcan Yildiz 220201049 - Ismail Burak Kurhan 220201055 - HW 4
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Simulation {
	private Player humanPlayer; 
	private Player computerPlayer; 
	
	public Simulation(){
		
		humanPlayer = new HumanPlayer();
		computerPlayer = new ComputerPlayer();		
		
	}
	
	
	public void giveCards(Desk desk,Player computerPlayer,Player humanPlayer) {
		for(int i=0;i<52;i++){
		if(i>25)
		computerPlayer.getPlayer_cardList().add(desk.getCard_list().get(i));
		else
		humanPlayer.getPlayer_cardList().add(desk.getCard_list().get(i));
		
	}
		Collections.sort(humanPlayer.cardList);
		Collections.sort(computerPlayer.cardList);
	}
	

		public int chooseFirstPlayer(){
			return ThreadLocalRandom.current().nextInt(0, 2);
			
		}
		
		
		
		public Player getHp() {
			return humanPlayer;
		}
		public void setHp(Player humanPlayer) {
			this.humanPlayer = humanPlayer;
		}
		public Player getCp() {
			return computerPlayer;
		}
		public void setCp(Player computerPlayer) {
			this.computerPlayer = computerPlayer;
		}
		
		public int determineWinner(Card c1,Card c2){
			if(c1.getNumber()>c2.getNumber()){
			System.out.println("Computer wins");
				return 0;
			}
			else if ( c1.getNumber()<c2.getNumber()){
				System.out.println("You win");
				return 1;
			}
			else{
				System.out.println("DRAW");
				System.out.println("Player of next turn will be determine randomly");
				return ThreadLocalRandom.current().nextInt(0, 2);
			}
		
		}
	
}
