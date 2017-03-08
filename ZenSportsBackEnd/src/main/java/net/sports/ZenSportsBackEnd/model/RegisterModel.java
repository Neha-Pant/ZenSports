package net.sports.ZenSportsBackEnd.model;

import java.io.Serializable;

public class RegisterModel implements Serializable{
public static long getSerialversionuid() {
		return serialVersionUID;
	}
/**
	 * 
	 */
	private static final long serialVersionUID = 1119460130208908635L;
User user;
Address shipping;
Address billing;
public RegisterModel() {
	super();
	this.user =new User();
	this.shipping = new Address();
	this.billing = new Address();
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Address getShipping() {
	return shipping;
}
public void setShipping(Address shipping) {
	this.shipping = shipping;
}
public Address getBilling() {
	return billing;
}
public void setBilling(Address billing) {
	this.billing = billing;
}
}