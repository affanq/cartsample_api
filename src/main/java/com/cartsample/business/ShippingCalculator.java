package com.cartsample.business;

import com.cartsample.model.Cart;

public class ShippingCalculator implements CalculatorType {

    public void calculateCost(Cart cart) {
        cart.setCartTotal(cart.getCartTotal() + cart.getShippingType().getShippingCost());

        System.out.println("Shipping Calculator - Shipping cost: " + cart.getShippingType().getShippingCost()+ ", Cart Total: " + cart.getCartTotal());
    }
}
