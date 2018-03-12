package domain;
//Alpcan Yildiz 220201049 - Ýsmail Burak Kurhan 220201055
import java.util.ArrayList;
import fileAccessLayer.FileAccessLayer;
//import presentation.Presentation;
import presentation.Presentation;

public class Agent {
	
	
	private ArrayList<House> houseList;
	FileAccessLayer FAL;
	Presentation presentation;
	
public Agent(){
	
	houseList = new ArrayList<House>();
	FAL = new FileAccessLayer(this);
	FAL.readingFromFile();
	presentation = new Presentation(this);
}

public void addHouse(House house){
	houseList.add(house);
	
}

public void saveHouse(House house) {
	houseList.add(house);

	
}

public void remove(House house){
			houseList.remove(house);
		
		}
	
public boolean check(String ID){
	for ( House house : houseList){
		if(house.getId().equals(ID)){
			return true;
		}
	}
	return false;
	
}

public void saveToFile() {
	FAL.savingFile();

}

public ArrayList<House> getHouseList() {
	return houseList;
}

}