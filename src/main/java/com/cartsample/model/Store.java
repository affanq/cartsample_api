package com.cartsample.model;

import com.cartsample.model.offers.Offer;
import com.cartsample.model.shipping.ShippingType;

import java.util.List;

/**
 * Represents the store/shop
 */
public class Store {

    private String shopName;
    private List<Item> itemsForSale;
    private List<Offer> offersAvailable;
    private List<ShippingType> shippingTypes;

    public Store(String shopName) {
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Item> getItemsForSale() {
        return itemsForSale;
    }

    public void setItemsForSale(List<Item> itemsForSale) {
        this.itemsForSale = itemsForSale;
    }

    public List<Offer> getOffersAvailable() {
        return offersAvailable;
    }

    public void setOffersAvailable(List<Offer> offersAvailable) {
        this.offersAvailable = offersAvailable;
    }

    public List<ShippingType> getShippingTypes() {
        return shippingTypes;
    }

    public void setShippingTypes(List<ShippingType> shippingTypes) {
        this.shippingTypes = shippingTypes;
    }

    public Order placeOrder(Cart cart) {
        Order order = new Order();
        order.setOrderId(1);
        order.setOrderItems(cart);

        return order;
    }
}
