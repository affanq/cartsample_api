package com.cartsample.business;

import com.cartsample.model.Cart;

public class CartTotalCalculator implements CalculatorType {

    public void calculateCost(Cart cart) {

        double cartTotal = cart.getCartTotal();

        cartTotal += cart.getItems().stream().mapToDouble(lineItem -> lineItem.getItem().getPrice() * lineItem.getQuantity()).sum();

        cart.setCartTotal(cartTotal);
    }
}
