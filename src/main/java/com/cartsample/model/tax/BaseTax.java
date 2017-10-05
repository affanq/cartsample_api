package com.cartsample.model.tax;

public abstract class BaseTax implements TaxType {
    private double taxRate;

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
}
