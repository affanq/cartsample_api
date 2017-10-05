package com.cartsample.model;

import com.cartsample.model.shipping.ShippingType;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<CartLineItem> items;
    private ShippingType shippingType;
    private double cartTotal;

    public List<CartLineItem> getItems() {
        return items;
    }

    public void setItems(List<CartLineItem> items) {
        this.items = items;
    }

    public ShippingType getShippingType() {
        return shippingType;
    }

    public void setShippingType(ShippingType shippingType) {
        this.shippingType = shippingType;
    }

    public void addItem(Item item, int quantity) {

        CartLineItem lineItem = new CartLineItem(item, quantity);

        if(items == null) {
            items = new ArrayList<>();
        }
        items.add(lineItem);
    }

    public double getCartTotal() {
        return cartTotal;
    }

    public void setCartTotal(double cartTotal) {
        this.cartTotal = cartTotal;
    }
}
