package net.sports.ZenSportsFrontEnd.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.sports.ZenSportsBackEnd.dao.IUserDAO;
import net.sports.ZenSportsBackEnd.model.Address;
import net.sports.ZenSportsBackEnd.model.Cart;
import net.sports.ZenSportsBackEnd.model.RegisterModel;
import net.sports.ZenSportsBackEnd.model.User;

@Component
public class RegisterHandler {

	@Autowired
	IUserDAO userDAO;

	public RegisterModel initializeFlow() {
		return new RegisterModel();
	}

	public void saveUser(RegisterModel registerModel, User user) {
		registerModel.setUser(user);
	}

	public void saveBillingAddress(RegisterModel registerModel, Address billing) {
		registerModel.setAddress(billing);
	}

	public void storeDetail(RegisterModel registerModel) {
		User user = registerModel.getUser();
		// save the user
		userDAO.addUser(user);
		Address billing = registerModel.getAddress();
		// set the user
		billing.setUser(user);
		// save the billing address
		userDAO.addUserAddress(billing);

		// if shipping is not same as billing
		// if(!billing.isShipping()) {
		// Address shipping = registerModel.getShipping();
		// set the user for shipping
		// shipping.setUser(user);
		// save the shipping address
		// userDAO.addUserAddress(shipping);
		// }
		// if user is not supplier
		if (user.getRole().equals("User")) {
			Cart cart = new Cart();
			// set the user
			cart.setUser(user);
			// save the cart
			userDAO.addUserCart(cart);
		}
	}
}