package com.java.training.d02.Teme.Water;

public class Water {
    private static final String NAME;
    private static final String TYPE;
    private static final String SUBTYPE;
    private static final String TASTE;

    static {
        NAME = "Name";
        TYPE = "Type";
        SUBTYPE = "Subtype";
        TASTE = "Taste";

        System.out.println(NAME + "\t\t" + TYPE + "\t" + SUBTYPE + "\t" + TASTE);
    }

    private  String name;
    private  String type;
    private  String subtype;
    private  String taste;

    public Water() {
    }


    public Water(String name, String type, String subtype, String taste ) {
        this.subtype = subtype;
        this.name = name;
        this.type = type;
        this.taste = taste;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void display(){
        System.out.println(getName() + " " + getType() + " " + getSubtype() + " " + getTaste());
    }
}
