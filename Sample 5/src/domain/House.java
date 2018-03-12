package domain;
//Alpcan Yildiz 220201049 - Ýsmail Burak Kurhan 220201055
public class House {
private String id;
private double price;
private double size;
private int rooms;
private int bathrooms;
private String airconditioner;




public House(String id, double price, double size, int rooms, int bathrooms, String airconditioner) {
	this.id = id;
	this.price = price;
	this.size = size;
	this.rooms = rooms;
	this.bathrooms = bathrooms;
	this.airconditioner = airconditioner;
}

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public double getSize() {
	return size;
}
public void setSize(double size) {
	this.size = size;
}
public int getRooms() {
	return rooms;
}
public void setRooms(int rooms) {
	this.rooms = rooms;
}
public int getBathrooms() {
	return bathrooms;
}
public void setBathrooms(int bathrooms) {
	this.bathrooms = bathrooms;
}
public String getAirconditioner() {
	return airconditioner;
}
public void setAirconditioner(String airconditioner) {
	this.airconditioner = airconditioner;
}
}
