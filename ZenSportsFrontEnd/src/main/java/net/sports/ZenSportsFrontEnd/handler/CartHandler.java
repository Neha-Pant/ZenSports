package net.sports.ZenSportsFrontEnd.handler;

import org.springframework.stereotype.Component;

import net.sports.ZenSportsBackEnd.model.Address;
import net.sports.ZenSportsBackEnd.model.CartModel;
import net.sports.ZenSportsBackEnd.model.Payment;

@Component
public class CartHandler {
    public CartModel initializeModel(){
        return new CartModel();
  }

  
  
  public void saveBillingAddress(CartModel cartModel,Address billing){
        cartModel.setBillingAddress(billing);
  }
  
  public void saveShippingAddress(CartModel cartModel,Address shipping){
        cartModel.setShippingAddress(shipping);
  }
  

  public void savePayment(CartModel cartModel,Payment payment){
        cartModel.setPayment(payment);
  }
  
  public void storeDetail(CartModel cartModel){ 
        
  }

}
