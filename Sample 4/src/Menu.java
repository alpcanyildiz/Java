//Alpcan Yildiz 220201049 - Ismail Burak Kurhan 220201055 - HW 4
import java.util.Scanner;

public class Menu {

	
	
	public void start(Simulation simulation){
		System.out.println("Welcome Card Game please enter your nickname");
		  Scanner input = new Scanner(System.in);
		  simulation.getHp().setName(input.next()); 
		Card copy1 = new Card();
		Card copy2 = new Card();
		
			int forWinner = -2;
			int random = simulation.chooseFirstPlayer();
		
			if ( random==0){
			
				System.out.println( " Computer starts ! ");			
			copy1=simulation.getCp().getNextCard(null);
			System.out.println("Computer's card is : "+ copy1.toString());
		 
		    int k =0;
		    for(Card card : simulation.getHp().getPlayer_cardList()){
				System.out.println("("+ (k+1)+ ") "+ card.getNumber()+ "--"+card.getType().toString()); 
				k++;}
		    System.out.println("Which Card do you choose");
		    boolean flag2=true;
		    int attempt=0;
		    while(flag2){
		     attempt = input.nextInt();
		    if(attempt > simulation.getHp().getPlayer_cardList().size()){
		    	System.out.println("Please enter valid input");
		    }
		    else
		    	flag2=false;
			
		    }
			copy2= simulation.getHp().getNextCard(simulation.getHp().getPlayer_cardList().get(attempt-1));
			System.out.println("your Card is : " + copy2.toString());
			
			forWinner= simulation.determineWinner(copy1, copy2);
			if (forWinner == 0){
				simulation.getCp().addScore(copy1.getScore());
				
				
			}
			else if (forWinner == 1){
				simulation.getHp().addScore(copy2.getScore());
				
			}
			
			}
			
		    if (random==1){
		    	System.out.println("You are starting ! ");
			    int k =0;
			    for(Card card : simulation.getHp().getPlayer_cardList()){
					System.out.println("("+ (k+1)+ ") "+ card.getNumber()+ "--"+card.getType().toString()); 
					k++;}
			    System.out.println("Which Card do you choose");
			   int attempt=0;
			    boolean flag2=true;
			    while(flag2){
			     attempt = input.nextInt();
			    if(attempt > simulation.getHp().getPlayer_cardList().size()){
			    	System.out.println("Please enter valid input");
			    }
			    else
			    	flag2=false;
				
			    }
				copy2= simulation.getHp().getNextCard(simulation.getHp().getPlayer_cardList().get(attempt-1));
				System.out.println("Your card is : " +copy2.toString());
			
				copy1=simulation.getCp().getNextCard(copy2);
				System.out.println("Computer's card is : "+ copy1.toString());	
			
				forWinner= simulation.determineWinner(copy1, copy2);	
				if (forWinner == 0){
					simulation.getCp().addScore(copy1.getScore());
					
				}
				else if (forWinner == 1){
					simulation.getHp().addScore(copy2.getScore());
					
				}
		}
		    boolean flag = true;
		    
		    while (flag){

		    	if (forWinner==1){
		    		System.out.println("Computer's turn !!");
		    		
					copy1=simulation.getCp().getNextCard(null);
					System.out.println("Computer's card is : "+ copy1.toString());
					
					int k =0;
				    for(Card card : simulation.getHp().getPlayer_cardList()){
						System.out.println("("+ (k+1)+ ") "+ card.getNumber()+ "--"+card.getType().toString()); 
						k++;}
				    System.out.println("Which Card do you choose");
				    boolean flag2=true;
				    int attempt=0;
				    while(flag2){
				     attempt = input.nextInt();
				    if(attempt > simulation.getHp().getPlayer_cardList().size()){
				    	System.out.println("Please enter valid input");
				    }
				    else
				    	flag2=false;
					
				    }
					copy2= simulation.getHp().getNextCard(simulation.getHp().getPlayer_cardList().get(attempt-1));
					System.out.println("Your card is : " +copy2.toString());
					
					forWinner= simulation.determineWinner(copy1, copy2);
					if (forWinner == 0){
						simulation.getCp().addScore(copy1.getScore());
						
					}
					else if (forWinner == 1){
						simulation.getHp().addScore(copy2.getScore());
						
					}
		    		
		    	}
		    	else if (forWinner ==0 ){
		    		System.out.println("Your turn !!");
		    		int k =0;
				    for(Card card : simulation.getHp().getPlayer_cardList()){
						System.out.println("("+ (k+1)+ ") "+ card.getNumber()+ "--"+card.getType().toString()); 
						k++;}
				    System.out.println("Which Card do you choose");
				    boolean flag2=true;
				    int attempt=0;
				    while(flag2){
				     attempt = input.nextInt();
				    if(attempt > simulation.getHp().getPlayer_cardList().size()){
				    	System.out.println("Please enter valid input");
				    }
				    else
				    	flag2=false;
					
				    }
					copy2= simulation.getHp().getNextCard(simulation.getHp().getPlayer_cardList().get(attempt-1));
					
					System.out.println("Your card is : " +copy2.toString());
					
					copy1=simulation.getCp().getNextCard(copy2);
					System.out.println("Computer's card is : "+ copy1.toString());		
				
					forWinner= simulation.determineWinner(copy1, copy2);
					if (forWinner == 0){
						simulation.getCp().addScore(copy1.getScore());
						
					}
					else if (forWinner == 1){
						simulation.getHp().addScore(copy2.getScore());
						
					}
					
		    		
		    	}
		    	
		    	
		    	if(simulation.getCp().getPlayer_cardList().isEmpty()&& simulation.getHp().getPlayer_cardList().isEmpty()){
		    		System.out.println("Finish");
		    		flag=false;
		    	}
		    	
		    }
		    
		    
		    
		
	}
	
	
	
	
	
	
	
	
	
}

