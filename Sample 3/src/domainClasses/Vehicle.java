package domainClasses;
//Alpcan Yildiz 220201049 - Ismail Burak Kurhan 220201055 - HW 3
import java.util.ArrayList;

public class Vehicle {
	private String uniqueID;
	private String departureDate;
	private ArrayList<Cargo> listOfCargoes;
	private double upperLimit;
	private TransportationType type;

	
	public Vehicle() {
		this.uniqueID ="";
		this.departureDate = "";
		listOfCargoes = new ArrayList<Cargo>();
		this.upperLimit = 0;
		this.type = null;
	}
	
public boolean checkUpperLimit(double weight){
		double limit = 0;
		
		for (Cargo cargo : listOfCargoes){
			limit+=cargo.getWeight();
		}
		limit=limit+weight;
		if (this.upperLimit>=limit)
			return true;
		
		return false;
		
	}

	
	
	public String getUniqueID() {
		return uniqueID;
	}
	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public ArrayList<Cargo> getListOfCargoes() {
		return listOfCargoes;
	}
	public void addListOfCargoes(Cargo cargo) {
		listOfCargoes.add(cargo);
	}
	public double getUpperLimit() {
		return upperLimit;
	}
	public void setUpperLimit(double upperLimit) {
		this.upperLimit = upperLimit;
	}
	public TransportationType getType() {
		return type;
	}
	public void setType(TransportationType type) {
		this.type = type;
	}
	
	
	
	
	
	
	
}
