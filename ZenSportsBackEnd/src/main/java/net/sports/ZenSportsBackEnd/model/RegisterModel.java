package net.sports.ZenSportsBackEnd.model;


public class RegisterModel {
User user;
Address shipping;
Address billing;
public RegisterModel(User user, Address shipping, Address billing) {
	super();
	this.user = user;
	this.shipping = shipping;
	this.billing = billing;
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
public RegisterModel() {
	super();
	// TODO Auto-generated constructor stub
}
}
