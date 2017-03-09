package net.sports.ZenSportsBackEnd.model;

import java.io.Serializable;

public class RegisterModel implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 973495312236760104L;
	public User user;
    public Address address;
    Address shippingAddress;
    public User getUser() {
                   return user;
    }

    public void setUser(User user) {
                   System.out.println("initialize user");
                   this.user = user;
    }

    public Address getAddress() {
                   return address;
    }

    public void setAddress(Address address) {
                   System.out.println("initialize billing address");
                   this.address = address;
    }

    public Address getShippingAddress() {
                   return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
                   this.shippingAddress = shippingAddress;
    }
 
    public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public RegisterModel(){
                   System.out.println("initialise register model");
                   user=new User();
                   address=new Address();
                   shippingAddress=new Address();
    }


}
