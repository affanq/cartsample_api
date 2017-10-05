package com.cartsample.business;

import com.cartsample.model.Cart;
import com.cartsample.model.tax.TaxType;

import java.util.List;

public class TaxCalculator implements CalculatorType {

    private List<TaxType> taxes;

    public TaxCalculator(List<TaxType> taxes) {
        this.taxes = taxes;
    }

    public void calculateCost(Cart cart) {

        double totalTax = cart.getItems().stream().mapToDouble(
                lineItem -> taxes.stream().mapToDouble(
                        tax -> tax.getTax(lineItem.getItem()) * lineItem.getQuantity()).sum()).sum();

        cart.setCartTotal(cart.getCartTotal() + totalTax);

        System.out.printf("Tax Calculator - Total taxes: %s, Cart Total: %s%n", totalTax, cart.getCartTotal());

    }
}
