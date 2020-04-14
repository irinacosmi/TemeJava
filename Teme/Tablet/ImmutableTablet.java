package com.java.training.d02.Teme.Tablet;

public class ImmutableTablet {
    public static String store;

    static{
        store = "MediaTrust";
        System.out.println("Welcome to " + store);
    }

    private String name;
    private String model;
    private int stock;

    public static int NumersModel = 0;

    public ImmutableTablet(String name, String model, int stock) {
        this.name = name;
        this.model = model;
        this.stock = stock;
        NumersModel ++;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getStock() {
        return stock;
    }

    public void display(){
        System.out.println(getName() + " " + getModel() + " " + getStock());
    }

    public static void getNumbers(){
        System.out.println("Number of models: " + NumersModel);
    }
}
