package cs544.mum.edu.Car_Rental.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String city;
private String state;
private int zip;
private String street;
private boolean isShipping=false;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getZip() {
	return zip;
}
public void setZip(int zip) {
	this.zip = zip;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public boolean isShipping() {
	return isShipping;
}
public void setShipping(boolean isShipping) {
	this.isShipping = isShipping;
}

}
