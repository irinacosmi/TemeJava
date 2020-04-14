package com.java.training.d02.Teme.Phone;

public class ImmutablePhone {
    private String name;
    private String model;
    private int stock;

    public static int NumberModels = 0;

    public ImmutablePhone(String name, String model, int stock) {
        this.name = name;
        this.model = model;
        this.stock = stock;
        NumberModels ++;
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
        System.out.println(getName() + "\t" + getModel() + "\t" + getStock());
    }

    public static void displayNumbers(){
        System.out.println("Number of models is: " + NumberModels);
    }
}
