package com.cartsample.main;

import com.cartsample.business.*;
import com.cartsample.model.Cart;
import com.cartsample.model.Item;
import com.cartsample.model.offers.DiscountOffer;
import com.cartsample.model.offers.Offer;
import com.cartsample.model.shipping.BaseShipping;
import com.cartsample.model.shipping.ShippingType;
import com.cartsample.model.tax.ImportTax;
import com.cartsample.model.tax.LuxuryTax;
import com.cartsample.model.tax.TaxType;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class MainTest {


    public static List<Item> generateItems() {

        Item item =  new Item(1,"iPad", "Apple iPad 4", 200, false, true);
        Item item2 =  new Item(2,"iPhone", "Apple iPhone X", 1000, false, true);

        List<Item> itemList = new ArrayList<>();
        itemList.add(item);
        itemList.add(item2);

        return itemList;
    }

    public static List<Offer> generateOffers() {

        Offer winterSaleOffer = new DiscountOffer(LocalDate.of(2017, Month.OCTOBER, 1),
                LocalDate.of(2017, Month.OCTOBER, 10), 0.5);

        List<Offer> offersList = new ArrayList<>();

        offersList.add(winterSaleOffer);


        return offersList;
    }

    public static List<ShippingType> generateShippingConfig() {
        ShippingType regularShipping = new BaseShipping("Regular Shipping", 5);
        ShippingType expressShipping = new BaseShipping("Express Shipping", 10);

        List<ShippingType> shippingTypes = new ArrayList<>();
        shippingTypes.add(regularShipping);
        shippingTypes.add(expressShipping);

        return shippingTypes;
    }

    public static List<TaxType> generateTaxConfig() {

        ImportTax importTax = new ImportTax(0.25);

        LuxuryTax luxuryTax = new LuxuryTax(0.25);

        List<TaxType> taxList = new ArrayList<>();
        taxList.add(importTax);
        taxList.add(luxuryTax);

        return taxList;
    }

    public static OffersCalculator getOffersCalculator() {

        return new OffersCalculator(generateOffers());
    }

    public static ShippingCalculator getShippingCalculator() {
        return new ShippingCalculator();
    }


    public static TaxCalculator getTaxCalculator() {
        return new TaxCalculator(generateTaxConfig());
    }

    public static void testPlaceOrderOneItem() {

        Cart cart = new Cart();

        List<Item> items = generateItems();
        items.forEach(item -> cart.addItem(item, 1));

        cart.setShippingType(new BaseShipping("Regular Shipping", 5));

        //apply calculators
        List<CalculatorType> calculatorsList = new ArrayList<>();
        calculatorsList.add(new CartTotalCalculator());
        calculatorsList.add(getOffersCalculator());
        calculatorsList.add(getShippingCalculator());
        calculatorsList.add(getTaxCalculator());

        for(CalculatorType calculator: calculatorsList) {
            calculator.calculateCost(cart);
        }


        System.out.println("Cart Total: " + cart.getCartTotal());



    }

    public static void main(String[] args) {
        //MainTest test = new MainTest();
        MainTest.testPlaceOrderOneItem();
    }

}
