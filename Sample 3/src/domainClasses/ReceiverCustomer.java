package domainClasses;
//Alpcan Yildiz 220201049 - Ismail Burak Kurhan 220201055 - HW 3
public class ReceiverCustomer extends Customer {
	private Cargo cargo;

	public ReceiverCustomer() {
		super();
		this.cargo = null;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	
	
	
	
}
