package com.cartsample.model;

public class Item {
    private int id;
    private String name;
    private String description;
    private double price;
    private boolean imported;
    private boolean luxuryItem;

//    public Item(int id) {
//        this.id = id;
//    }

    public Item(int id, String name, String description, double price, boolean imported, boolean luxuryItem) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imported = imported;
        this.luxuryItem = luxuryItem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isImported() {
        return imported;
    }

    public void setImported(boolean imported) {
        this.imported = imported;
    }

    public boolean isLuxuryItem() {
        return luxuryItem;
    }

    public void setLuxuryItem(boolean luxuryItem) {
        this.luxuryItem = luxuryItem;
    }



}
