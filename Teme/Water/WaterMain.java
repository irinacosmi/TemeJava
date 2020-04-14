package com.java.training.d02.Teme.Water;

public class WaterMain {
    public static void main(String[] args) {
        Water river = new Water("Danube", "flowing water", "river", "sweet");
        Water sea = new Water("Black Sea", "standing water", "sea", "salted");

        Water lake = new Water();
        lake.setName("Red Lake");
        lake.setType("standing water");
        lake.setSubtype("lake");
        lake.setTaste("salted");

        river.display();
        sea.display();
        lake.display();
    }

}
