package net.sports.ZenSportsBackEnd.dao;

import java.util.List;

import net.sports.ZenSportsBackEnd.model.User;

public interface IUserDAO 
{
public List<User> getAllUsers();
public User getUser(int id);
public boolean updateUser(User u);
public boolean deleteUser(int id);
public boolean addUser(User u);

}
