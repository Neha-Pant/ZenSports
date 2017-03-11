package net.sports.ZenSportsBackEnd.model;

import java.io.Serializable;

public class CartModel implements Serializable
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1851244734416108440L;
	Address billingAddress;
    Address shippingAddress;
    Payment payment;
    
    public Payment getPayment() {
          return payment;
    }

    public void setPayment(Payment payment) {
          this.payment = payment;
    }

  
    

    public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Address getBillingAddress() {
          return billingAddress;
    }
    public void setBillingAddress(Address billingAddress) {
          this.billingAddress = billingAddress;
    }
    public Address getShippingAddress() {
          return shippingAddress;
    }
    public void setShippingAddress(Address shippingAddress) {
          this.shippingAddress = shippingAddress;
    }
    public CartModel() {
          
          billingAddress=new Address();
          shippingAddress=new Address();
          payment=new Payment();
    }

}
