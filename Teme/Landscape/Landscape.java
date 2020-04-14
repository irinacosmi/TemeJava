package com.java.training.d02.Teme.Landscape;

public class Landscape {

    private static final String TYPE;
    private static final String NAME;
    private static final String LOCATION;

    static {
        TYPE = "Type";
        NAME = "Name";
        LOCATION = "Location";

        System.out.println(TYPE + "\t " + NAME + "\t " + LOCATION);
    }

    private String type;
    private String name;
    private String location;

    public Landscape() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
         this.location = location;
    }

    public void displayLandscape(){
        System.out.println(getType() + " " +getName() + " " + getLocation());
    }
}
