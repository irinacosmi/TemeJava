package com.java.training.d02.Teme.Fridge;

public class Fridge {
    private static final String MODEL;
    private static final String TYPE;
    private static final String PRICE;
    private static final String STORE;

    static {
        MODEL = "Model";
        TYPE = "Type";
        PRICE = "Price";
        STORE = "Store";

        System.out.println(TYPE + "\t" + MODEL + "\t" + PRICE + "\t" + STORE);
    }

    private String name;
    private String type;
    private double price;
    private String store;

    public Fridge() {
    }

    public Fridge(String name, String type, double price, String store) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.store = store;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public void display(){
        System.out.println(getName() + "\t" + getType() + "\t\t" + getPrice() + "\t" + getStore());
    }
}
