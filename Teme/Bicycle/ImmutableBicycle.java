package com.java.training.d02.Teme.Bicycle;

public class ImmutableBicycle {

    private final String type;
    private final String age;
    private final int inch;
    private final int stock;

    public ImmutableBicycle(String type, String age, int inch, int stock) {
        this.type = type;
        this.age = age;
        this.inch = inch;
        this.stock = stock;
    }

    public String getType() {

        return type;
    }

    public String getAge() {
        return age;
    }

    public int getInch() {
        return inch;
    }

    public int getStock() {
        return stock;
    }

    public void display(){
        System.out.println(type + "\t" + age + "\t" + inch + "\t" + stock);
    }

    public String toString(){
        return type + "\t" + age + "\t" + inch + "\t" + stock;
    }

    public void getNotice(){
        System.out.println(type + " for " + age + " " + inch + " inch. We have " + stock + " in the store.");
    }
}
