package net.sports.ZenSportsBackEnd.dao;

import java.util.List;

import net.sports.ZenSportsBackEnd.model.Cart;
import net.sports.ZenSportsBackEnd.model.CartItem;

public interface ICartItemDAO 
{
    public List<CartItem> getAllCartItem(Cart item);
    public CartItem getCartItem(int id);
    
    public boolean addCartItem(CartItem ci);
    public boolean updateCartItem(CartItem ci);
    public boolean deleteCartItem(int cartItemId);      

}
