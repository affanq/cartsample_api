package com.cartsample.model.offers;

import com.cartsample.model.Cart;
import com.cartsample.model.CartLineItem;

/**
 * Offers discount based on item quantity
 * */
public class BulkOrderOffer implements PercentageOffer {

    private int qualifyingQuantity;
    private double discountRate;

    public BulkOrderOffer(int qualifyingQuantity, double discountRate) {
        this.qualifyingQuantity = qualifyingQuantity;
        this.discountRate = discountRate;
    }


    public int getQualifyingQuantity() {
        return qualifyingQuantity;
    }

    public void setQualifyingQuantity(int qualifyingQuantity) {
        this.qualifyingQuantity = qualifyingQuantity;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscount(Cart cart) {

        double discount = 0;
        for(CartLineItem lineItem: cart.getItems()) {
            if(lineItem.getQuantity() >= qualifyingQuantity) {
                discount += lineItem.getItem().getPrice() * discountRate;
            }
        }

        return discount;
    }
}
