package fileAccessClass;
import domainClasses.Vehicle;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import domainClasses.Company;
import domainClasses.TransportationType;
// Alpcan Yildiz 220201049 - Ismail Burak Kurhan 220201055 - HW 3
public class DataAccessLayer {

	public void readingFromFile(Company company ) {

		try {
			Scanner vehicleFile = new Scanner(new File("C:\\Users\\Ulpcan\\Desktop\\vehicles.dat"));
	
			while (vehicleFile.hasNextLine()) {
				Vehicle vehicle = new Vehicle();	
				String line = vehicleFile.nextLine();
				StringTokenizer st = new StringTokenizer(line, ", ");
				String uniqueID = st.nextToken();
				String departureDate = st.nextToken();
				TransportationType type = TransportationType.valueOf(st.nextToken().toUpperCase());
				double upperLimit = Double.parseDouble(st.nextToken());
				vehicle.setUniqueID(uniqueID);
				vehicle.setDepartureDate(departureDate);
				vehicle.setType(type);
				vehicle.setUpperLimit(upperLimit);
				company.addVehicleList(vehicle);
				
			}
			vehicleFile.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}
	


	
}
