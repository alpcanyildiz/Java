package domainClasses;
//Alpcan Yildiz 220201049 - Ismail Burak Kurhan 220201055 - HW 3
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Company {

	private ArrayList<Cargo> cargoList;
	private ArrayList<SenderCustomer> senderList;
	private ArrayList<Vehicle> vehicleList;

	public Company() {
		super();
		cargoList = new ArrayList<Cargo>();
		senderList= new ArrayList<SenderCustomer>();
		vehicleList = new ArrayList<Vehicle>();
	}

	public ArrayList<Cargo> getCargoList() {
		return cargoList;
	}

	public void addCargoList(Cargo cargo) {
		cargoList.add(cargo);
	}

	public ArrayList<SenderCustomer> getSenderList() {
		return senderList;
	}

	public void addSenderList(SenderCustomer senderCustomer) {
		senderList.add(senderCustomer);
	}

	public ArrayList<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public void addVehicleList(Vehicle vehicle) {
		vehicleList.add(vehicle);
	}
	
	public boolean checkAvailability(String date1,String date2) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
			Date Date1 = sdf.parse(date1);
			Date Date2 = sdf.parse(date2);
		

	        System.out.println("date1 : " + sdf.format(Date1));
	        System.out.println("date2 : " + sdf.format(Date2));

	        if (Date1.compareTo(Date2) > 0) {
	            return false;
	        } else if (Date1.compareTo(Date2) < 0) {
	            return true;
	        } else if (Date1.compareTo(Date2) == 0) {	    
	            return true;
	        } 
	        return false;
	}
	

public String priceCalculate(Cargo cargo,TransportationType type){
	double sum = 0;

	if (type==TransportationType.AIR){
		 sum=cargo.getWeight()*5.0;
		return String.valueOf(sum);}
	else if (type==TransportationType.ROAD){
		 sum=cargo.getWeight()*3.5;
		return String.valueOf(sum);}
	else if (type==TransportationType.RAIL){
		

		 sum=cargo.getWeight()*2.0;
			return String.valueOf(sum);
	}
	else
		return null;
	
}	
	
	
}
