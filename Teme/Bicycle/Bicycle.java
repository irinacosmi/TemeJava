package com.java.training.d02.Teme.Bicycle;

public class Bicycle {

    private static final String TYPE;
    private static final String AGE;
    private static final String INCH;
    private static final String STOCK;

    static {
        TYPE = "Type";
        AGE = "Age";
        INCH = "Inch";
        STOCK = "Stock";

        System.out.println(TYPE + "\t" + AGE + "\t " + INCH + "\t" + STOCK);
    }

    private String type;
    private String age;
    private int inch;
    private int stock;

    public Bicycle() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void display(){
        System.out.println(type + "\t" + age + "\t" + inch + "\t" + stock);
    }

    public void getNotice(){
        System.out.println(type + " for " + age + " " + inch + " inch. We have " + stock + " in the store.");
    }
}
