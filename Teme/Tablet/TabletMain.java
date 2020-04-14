package com.java.training.d02.Teme.Tablet;

public class TabletMain {
    public static void main(String[] args) {


        Tablet tablet = new Tablet();
        tablet.setName("Samsung");
        tablet.setModel("Galaxy Tab A");
        tablet.setStock(30);

        Tablet tablet1 = new Tablet();
        tablet1.setName("iPad");
        tablet1.setModel("Pro 2020");
        tablet1.setStock(30);
        ImmutableTablet tablet3 = new ImmutableTablet("Huawei", "MediaPad", 50);

        tablet.display();
        tablet1.display();
        Tablet.getNumbers();

        tablet3.display();
        ImmutableTablet.getNumbers();

    }
}
