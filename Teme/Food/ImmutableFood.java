package com.java.training.d02.Teme.Food;

public class ImmutableFood {
    private final String name;
    private final String type;
    private final double calories;

    public ImmutableFood(String name, String type, double calories) {
        this.name = name;
        this.type = type;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getCalories() {
        return calories;
    }

    public void display(){
        System.out.println(getName() + "\t" + getType() + "\t" + getCalories());
    }
}
