package com.java.training.d02.Teme.Bicycle;

public class BicycleMain {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.setType("Mountainbike Omega Thomas");
        bicycle.setAge("adults");
        bicycle.setInch(29);
        bicycle.setStock(70);

        Bicycle velors = new Bicycle();
        velors.setType("Velors mountain");
        velors.setAge("kids");
        velors.setInch(20);
        velors.setStock(40);

        ImmutableBicycle immutableBicycle = new ImmutableBicycle("Pegas", "kids", 24, 100);

        bicycle.display();
        velors.display();
        immutableBicycle.display();

        System.out.println();

        bicycle.getNotice();
        velors.getNotice();
        immutableBicycle.getNotice();

    }
}
