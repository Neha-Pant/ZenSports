package net.sports.ZenSportsBackEnd.dao;

import java.util.List;

import net.sports.ZenSportsBackEnd.model.Address;

public interface IAddressDAO {
	public List<Address> getAllAddress();

	public Address getAddress(int id);

	public boolean deleteAddress(int id);

	public boolean addAddress(Address a);
	
	public boolean updateAddress(Address a);

}
