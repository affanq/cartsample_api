package com.cartsample.model.tax;

import com.cartsample.model.Item;

public class ImportTax extends BaseTax {

    public ImportTax(double taxRate) {
        setTaxRate(taxRate);
    }

    public double getTax(Item item) {
        return item.getPrice() * (item.isImported()?getTaxRate():0);
    }
}
