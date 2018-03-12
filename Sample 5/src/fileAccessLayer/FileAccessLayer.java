package fileAccessLayer;
//Alpcan Yildiz 220201049 - Ýsmail Burak Kurhan 220201055
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import domain.Agent;
import domain.House;

public class FileAccessLayer {
	Agent agent;

	public FileAccessLayer(Agent agent) {
		this.agent = agent;
	}

	public void readingFromFile() {

		House house;
		Scanner scanner;
		StringTokenizer tokenizer,titleTokenizer;
		String line = null;
		int order = 1;
		int numberOfWords = 0;
		
		try {
			scanner = new Scanner(new File("housing.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File doesn not exist!");
			return;
		}
		
		
		titleTokenizer = new StringTokenizer(line, "Title:");
		tokenizer = new StringTokenizer(line, ", :--!?");
		
		line=scanner.nextLine();
		
				
		while (scanner.hasNextLine()) {
			
			
			while (scanner.nextLine()!="")
				
			String title=titleTokenizer.nextToken();
			line = scanner.nextLine();

			if(titleTokenizer.hasMoreTokens()){
							
			}
			
			if (tokenizer.hasMoreTokens()) {
				id = tokenizer.nextToken();
			}

			
			house = new House(id, price, size, rooms, bathrooms, airconditioner);
			
			agent.addHouse(house);
		}
		scanner.close();
	}

	public void savingFile() {
		PrintWriter outputStream = null;
		try{
			outputStream = new PrintWriter(new FileOutputStream("housing.txt"));
			outputStream.println("id,price($),size(m^2),rooms,bathrooms,airconditioner");
			for(House house : agent.getHouseList()){
				outputStream.println(house.getId()+","+house.getPrice()+","+house.getSize()+","+house.getRooms()+","+house.getBathrooms()+","+house.getAirconditioner());
	
			}
	
			outputStream.close();
		}catch(FileNotFoundException e){
			e.getMessage();
		}

	}

}


