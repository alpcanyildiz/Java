package presentationClasses;
import java.text.ParseException;

import domainClasses.*;
import fileAccessClass.*;
//Alpcan Yildiz 220201049 - Ismail Burak Kurhan 220201055 - HW 3
public class CargoApp {

	public static void main(String[] args) throws ParseException {
		
		Company company = new Company();
		DataAccessLayer dt = new DataAccessLayer();
		dt.readingFromFile(company);
		Swings so = new Swings();
	
		so.initialize(company);
		
		so.frame.setVisible(true);
		
			}

}
