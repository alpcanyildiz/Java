package domainClasses;
//Alpcan Yildiz 220201049 - Ismail Burak Kurhan 220201055 - HW 3
public class Cargo {
	
	private String uniqueID;
	private double weight;
	private double price;
	private String orderDate;
	private SenderCustomer senderCustomer;
	private ReceiverCustomer receiverCustomer;
	private Customer payerCustomer;
	

	public Cargo() {
		super();
		this.uniqueID = "";
		this.weight = 0;
		this.price = 0;
		this.orderDate = "";
		this.senderCustomer = null;
		this.receiverCustomer = null;
		this.payerCustomer = null;
	}


	public String getUniqueID() {
		return uniqueID;
	}
	
	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public SenderCustomer getSenderCustomer() {
		return senderCustomer;
	}
	public void setSenderCustomer(SenderCustomer senderCustomer) {
		this.senderCustomer = senderCustomer;
	}
	public ReceiverCustomer getReceiverCustomer() {
		return receiverCustomer;
	}
	public void setReceiverCustomer(ReceiverCustomer receiverCustomer) {
		this.receiverCustomer = receiverCustomer;
	}
	public Customer getCustomer() {
		return payerCustomer;
	}
	public void setCustomer(Customer customer) {
		this.payerCustomer = customer;
	}

	
}
