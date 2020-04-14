package com.java.training.d02.Teme.Landscape;

public class LandscapeMain {
    public static void main(String[] args) {
        Landscape desert = new Landscape();
        desert.setType("desert");
        desert.setName("Sahara");
        desert.setLocation("Africa");

        Landscape mountain = new Landscape();
        mountain.setType("mountain");
        mountain.setName("Pyrenees");
        mountain.setLocation("Spain and France");

        ImmutableLandscape rainforest = new ImmutableLandscape("rainforest", "Tropical rainforest", "Fatu Hiva Island, Marquesas Islands, French Polynesia");

        desert.displayLandscape();
        mountain.displayLandscape();
        rainforest.displayLandscape();

    }
}
