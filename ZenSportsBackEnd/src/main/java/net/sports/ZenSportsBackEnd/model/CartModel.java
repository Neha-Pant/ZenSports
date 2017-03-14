package net.sports.ZenSportsBackEnd.model;

import java.io.Serializable;
import java.util.List;

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

  
    List<CartItem> cartItem; 
    
    public List<CartItem> getCartItem() { 
            return cartItem; 
    }  

    public void setCartItem(List<CartItem> cartItem) { 
            this.cartItem = cartItem; 
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
