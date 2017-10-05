package com.cartsample.model.tax;

import com.cartsample.model.Item;

public interface TaxType {
    double getTax(Item item);
}
