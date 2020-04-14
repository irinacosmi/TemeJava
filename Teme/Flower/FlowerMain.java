package com.java.training.d02.Teme.Flower;

public class FlowerMain {
    public static void main(String[] args) {
        Flower tulip = new Flower("Tulip", "Liliacee", 150, "sudul Europei, Africa, Asia, Anatolia si Iran");
        Flower rose = new Flower("Rose", "Rosaceae", 200, "Asia, Europa");

        ChangeFlower magnolia = new ChangeFlower();
        magnolia.setName("Magnolia");
        magnolia.setFamilia("Magnoliaceae");
        magnolia.setNrSubspecies(77);
        magnolia.setOrigin("Asia, America, Indiile de Vest");

        tulip.displayTable();
        rose.displayTable();
        magnolia.displayTable();

        tulip.displayAbout();
        rose.displayAbout();
        magnolia.displayAbout();
    }

}
