package net.sports.ZenSportsBackEnd.dao;

import net.sports.ZenSportsBackEnd.model.Payment;
import net.sports.ZenSportsBackEnd.model.User;

public interface IPaymentDAO {
	 public Payment getPaymentDetails(User u);
	 public boolean addPayment(Payment p);
	}
