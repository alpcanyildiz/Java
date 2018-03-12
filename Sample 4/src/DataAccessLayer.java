//Alpcan Yildiz 220201049 - Ismail Burak Kurhan 220201055 - HW 4
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class DataAccessLayer {
	

	public void saveInFile(Player hp,Player cp){
		try {
		    FileWriter filewriter = new FileWriter("C:\\Users\\Ulpcan\\Desktop\\"+ hp.getName()+"_"+cp.getName()+".dat" );
			BufferedWriter fileoutput = new BufferedWriter(filewriter);
	
			fileoutput.write(hp.getName()+" : " + hp.getScore() +"\n");
			fileoutput.write(cp.getName()+" : " + cp.getScore());
			fileoutput.close();
			filewriter.close();
		} catch (IOException e1) {

			e1.printStackTrace();
		}

	}

}



