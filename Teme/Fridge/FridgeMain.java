package com.java.training.d02.Teme.Fridge;

public class FridgeMain {

    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        fridge.setName("Samsung");
        fridge.setType("A+");
        fridge.setPrice(1799.99);
        fridge.setStore("eMag");

        Fridge fridge1 = new Fridge("Beko", "A++", 1349.99, "Altex" );
        Fridge fridge2 = new Fridge("Indesit", "A+", 1899.99, "MediaGalaxy");

       fridge.display();
       fridge1.display();
       fridge2.display();
    }
}
