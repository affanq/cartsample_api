package com.cartsample.model;

public class Order {

    private int orderId;
    private Cart orderItems;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Cart getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Cart orderItems) {
        this.orderItems = orderItems;
    }
}
