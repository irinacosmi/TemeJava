package com.java.training.d02.Teme.Tablet;

public class Tablet {



    private String name;
    private String model;
    private int stock;

    public static int NumersModel = 0;

    public Tablet() {
        NumersModel ++;
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
        stock = stock;
    }

    public void display(){
        System.out.println(getName() + " " + getModel() + " " + getStock());
    }

    public static void getNumbers(){
        System.out.println("Number of models: " + NumersModel);
    }

}
