package org.abol.springstarter.services;

import org.abol.springstarter.models.CartItem;

import java.util.List;

public interface CartService {
    List<CartItem> getItemsByUserId(int userId);
    CartItem getItemById(int id);
    void saveItem(CartItem item);
    void deleteItem(int id);
}
