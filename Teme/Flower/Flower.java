package com.java.training.d02.Teme.Flower;

public class Flower {
    private static final String NAME;
    private static final String FAMILIA;
    private static final String SUBSPECIES;
    private static final String ORIGIN;

    static {
        NAME = "Name";
        FAMILIA = "Familia";
        SUBSPECIES = "NrSubspecies";
        ORIGIN = "Origin";

        System.out.println(NAME + " \t" + FAMILIA + "\t\t " + SUBSPECIES + " \t" + ORIGIN);
    }

    private final String name;
    private final String familia;
    private final int nrSubspecies;
    private final String origin;



    public Flower(String name, String familia, int nrSubspecies, String origin) {
        this.name = name;
        this.familia = familia;
        this.nrSubspecies = nrSubspecies;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public String getFamilia() {
        return familia;
    }

    public int getNrSubspecies() {
        return nrSubspecies;
    }

    public String getOrigin() {
        return origin;
    }

    public void displayTable(){
        System.out.println(getName() + " " + getFamilia() + " " + getNrSubspecies() + " " + getOrigin());
    }

    public void displayAbout(){
        System.out.println(getName() + " face parte din familia " + getFamilia() + " si are " + getNrSubspecies() + " specii. Isi are originea in " + getOrigin() + ".");
    }


}
