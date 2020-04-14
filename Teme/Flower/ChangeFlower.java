package com.java.training.d02.Teme.Flower;

public class ChangeFlower {

    private  String name;
    private  String familia;
    private  int nrSubspecies;
    private  String origin;

    public ChangeFlower() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public int getNrSubspecies() {
        return nrSubspecies;
    }

    public void setNrSubspecies(int nrSubspecies) {
        this.nrSubspecies = nrSubspecies;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void displayTable(){
        System.out.println(getName() + " " + getFamilia() + " " + getNrSubspecies() + " " + getOrigin());
    }

    public void displayAbout(){
        System.out.println(getName() + " face parte din familia " + getFamilia() + " si are " + getNrSubspecies() + " specii. Isi are originea in " + getOrigin() + ".");
    }
}
