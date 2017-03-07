package net.sports.ZenSportsFrontEnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.sports.ZenSportsBackEnd.dao.IUserDAO;
import net.sports.ZenSportsBackEnd.model.RegisterModel;

@Component
public class RegisterHandler {
	@Autowired
	private IUserDAO userDAO;
	
	private RegisterModel registerModel;
	
	public RegisterModel initializeModel()
	{
		return new RegisterModel();
	}
}
