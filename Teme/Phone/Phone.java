package com.java.training.d02.Teme.Phone;

public class Phone {

    private static final String  NAME;
    private static final String MODEL;
    private static final String STOCK;

    static {
        NAME = "Name";
        MODEL = "Model";
        STOCK = "Stock";

        System.out.println(NAME + "\t " + MODEL + "\t " + STOCK);
    }

    private String name;
    private String model;
    private int stock;

    public static int NumberModels = 0;

    public Phone() {
        Phone.NumberModels ++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void display(){
        System.out.println(getName() + "\t" + getModel() + "\t" + getStock());
    }

    public static void displayNumbers(){
        System.out.println("Number of models is: " + NumberModels);
    }
}



