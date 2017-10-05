package com.cartsample.model.offers;

import com.cartsample.model.Cart;

import java.time.LocalDate;

/**
 * Offers a fixed amount discount based on dates on the whole order
 * */
public class DiscountOffer implements FixedAmountOffer {

    private LocalDate startDate;
    private LocalDate endDate;
    private double discountRate;

    public DiscountOffer(LocalDate startDate, LocalDate endDate, double discountRate) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.discountRate = discountRate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscount(Cart cart) {

        LocalDate today = LocalDate.now();

        return (today.isAfter(startDate) && today.isBefore(endDate))?discountRate:0;
    }

}
