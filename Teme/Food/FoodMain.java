package com.java.training.d02.Teme.Food;

public class FoodMain {
    public static void main(String[] args) {
        Food pizza = new Food();
        pizza.setName("Pizza");
        pizza.setType("Fast-Food");
        pizza.setCalories(266);

        Food soup = new Food();
        soup.setName("Mushroom cream soup");
        soup.setType("Slow Food");
        soup.setCalories(38.7);

        ImmutableFood hamburger = new ImmutableFood("Hamburger", "Fast-Food", 249.9);

        pizza.display();
        soup.display();
        hamburger.display();


    }

}
