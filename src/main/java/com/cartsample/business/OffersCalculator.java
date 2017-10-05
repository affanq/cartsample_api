package com.cartsample.business;

import com.cartsample.model.Cart;
import com.cartsample.model.offers.Offer;

import java.util.List;

public class OffersCalculator implements CalculatorType {

    private List<Offer> offers;

    public OffersCalculator(List<Offer> offers) {
        this.offers = offers;
    }

    public void calculateCost(Cart cart) {

        double discount = 0;

        for(Offer offer: offers) {
            discount += offer.getDiscount(cart);
        }

        cart.setCartTotal(cart.getCartTotal() - discount);

        System.out.println("Offers Calculator - Discount: " + discount + ", Cart Total: " + cart.getCartTotal());
    }
}
