package net.sports.ZenSportsBackEnd.dao;

import net.sports.ZenSportsBackEnd.model.*;
import java.util.*;

public interface IProductDAO {
	public List<Product> getProducts();
	public Product getProduct(int id);
	public void addProducts(Product p);

}
