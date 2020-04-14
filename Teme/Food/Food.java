package com.java.training.d02.Teme.Food;

public class Food {
    private static final String NAME;
    private static final String TYPE;
    private static final String CALORIES;

    static {
        NAME = "Name";
        TYPE = "Type";
        CALORIES = "Calories";

        System.out.println(NAME + " \t" + TYPE + " \t" + CALORIES);
    }

    private String name;
    private String type;
    private double calories;

    public Food() {
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

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public void display(){
        System.out.println(getName() + "\t" + getType() + "\t" + getCalories());
    }
}
