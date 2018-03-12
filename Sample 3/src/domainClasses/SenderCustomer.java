package domainClasses;
//Alpcan Yildiz 220201049 - Ismail Burak Kurhan 220201055 - HW 3
import java.util.ArrayList;

public class SenderCustomer extends Customer {
	
	private ArrayList<Cargo> senderCargoList;

	
	public SenderCustomer() {
		super();
		senderCargoList = new ArrayList<Cargo>();
	}

	public ArrayList<Cargo> getSenderCargoList() {
		return senderCargoList;
	}
	

	public void addSenderCargoList(Cargo cargo) {
		senderCargoList.add(cargo);
	}
	
	
	

}
