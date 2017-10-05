package com.cartsample.model.tax;

import com.cartsample.model.Item;

public class LuxuryTax extends BaseTax {

    public LuxuryTax(double taxRate) {
        setTaxRate(taxRate);
    }

    public double getTax(Item item) {
        return item.getPrice() * (item.isLuxuryItem()?getTaxRate():0);
    }
}
