//Alpcan Yildiz 220201049 - Ismail Burak Kurhan 220201055 - HW 4


public class GameApplication {

	public static void main(String[] args) {

		Desk desk = new Desk();
		desk.init();
		Simulation simulation = new Simulation();
		Menu menu = new Menu();
		simulation.giveCards(desk,simulation.getHp(),simulation.getCp());
				
		menu.start(simulation);
		DataAccessLayer dataAccessLayer = new DataAccessLayer();
		dataAccessLayer.saveInFile(simulation.getCp(), simulation.getHp());
	
	}

}
