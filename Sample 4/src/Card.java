//Alpcan Yildiz 220201049 - Ismail Burak Kurhan 220201055 - HW 4
public class Card implements Comparable {

	private int number;
	private CardType type;
	private int score;
	public Card(){
		
	}
	public Card(int number, CardType type) {
		this.number = number;
		this.type = type;
		setScore();

	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public CardType getType() {
		return type;
	}

	public void setType(CardType type) {
		this.type = type;
	}

	public int getScore() {
		return score;
	}

	public void setScore() {

		if (this.type == CardType.SPADES)
			this.score = this.number * 5;

		else if (this.type == CardType.HEARTS)
			this.score = this.number * 7;

		else if (this.type == CardType.DIAMONDS)
			this.score = this.number * 9;

		else if (this.type == CardType.CLUBS)
			this.score = this.number * 11;

	}
	
	@Override
	public int compareTo(Object o) {
		int i = ((Card)o).getNumber();
		 return this.number-i;
	}
	public String toString(){
		return "number = " + number + " Type = " + type.toString();
		
	}

}
