package net.sports.ZenSportsFrontEnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.sports.ZenSportsBackEnd.dao.IUserDAO;
import net.sports.ZenSportsBackEnd.model.Address;
import net.sports.ZenSportsBackEnd.model.RegisterModel;
import net.sports.ZenSportsBackEnd.model.User;

@Component
public class RegisterHandler {
	@Autowired
	private IUserDAO userDAO;

	private RegisterModel registerModel;

	public RegisterModel initializeModel() {
		return new RegisterModel();
	}

//	public User initializeUser()
//	{
//		return new User();
//	}
	
	public String validateUserDetails(User user) {
		String status = "success";
		if (user.getUserName().isEmpty()) {

			status = "failure";
		}
		if (user.getUserFullName().isEmpty()) {

			status = "failure";
		}
		if (user.getUserEmail().isEmpty()) {
			status = "failure";
		}
		if (user.getUserMobile().isEmpty()) {

			status = "failure";
		}
		if (user.getUserSecurityA().isEmpty()) {

			status = "failure";
		}
		return status;
	}

	public String validateAddressDetails(Address address) {
		String status = "success";
		if(address.getAddAddress1().isEmpty())
		{
			status="failure";
		}
		if(address.getAddAddress2().isEmpty())
		{
			status="failure";
		}
		if(address.getAddCity().isEmpty())
		{
			status="failure";
		}
		if(address.getAddCountry().isEmpty())
		{
			status="failure";
		}
		if(address.getAddState().isEmpty())
		{
			status="failure";
		}
		if(address.getAddZipCode().isEmpty())
		{
			status="failure";
		}
		return status;
	}
}
