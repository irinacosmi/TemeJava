package com.java.training.d02.Teme.Landscape;

public class ImmutableLandscape {


    private final String type;
    private final String name;
    private final String location;

    public ImmutableLandscape(String type, String name, String location) {
        this.type = type;
        this.name = name;
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void displayLandscape(){
        System.out.println(getType() + " " +getName() + " " + getLocation());
    }
}
