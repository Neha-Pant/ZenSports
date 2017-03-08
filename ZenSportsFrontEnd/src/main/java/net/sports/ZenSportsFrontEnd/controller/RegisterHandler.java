package net.sports.ZenSportsFrontEnd.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

import net.sports.ZenSportsBackEnd.dao.IUserDAO;
import net.sports.ZenSportsBackEnd.model.Address;
import net.sports.ZenSportsBackEnd.model.User;

@Component
public class RegisterHandler {

	private User user;
	private Address billingAddress;
	private Address shippingAddress;

	public RegisterHandler() {
		super();
		user = new User();
		billingAddress = new Address();
		shippingAddress = new Address();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	@Autowired
	private IUserDAO userDAO;

	public String validateUser(@Valid User user, BindingResult result) {
		String status="success";
		if (result.hasErrors()) {
			status="failure";
		}
		// else
		// {
		// return "success";
		// }
		return status;
	}

	public String storeDetail(User user, Address address) {
		String status="failure";
		if(user.isEnabled())
		{
			List<Address> list=new ArrayList<Address>();
			address.setUser(user);
			list.add(address);
			user.setAddress(list);
			boolean result=userDAO.addUser(user);
			if(result)
			{
				status="success";
			}
			else
			{
				status="failure";
			}
		}
		return status;
	}
}