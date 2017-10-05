package com.cartsample.model.shipping;

public class BaseShipping implements ShippingType {
    private String shippingName;
    private double shippingCost;

    public BaseShipping(String shippingName, double shippingCost) {
        this.shippingName = shippingName;
        this.shippingCost = shippingCost;
    }


    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    @Override
    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof BaseShipping
                && ((BaseShipping)obj).getShippingName().equals(this.getShippingName());
    }
}
