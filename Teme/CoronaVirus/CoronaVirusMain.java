package com.java.training.d02.Teme.CoronaVirus;

public class CoronaVirusMain {
    public static void main(String[] args) {
        CoronaVirus city1 = new CoronaVirus();
        city1.setCountry("Italy");
        city1.setCity("Rome");
        city1.setNumberOfIllnesses(32000);
        city1.setNumberOfHeals(20000);

        CoronaVirus city2 = new CoronaVirus();
        city2.setCountry("Germany");
        city2.setCity("Berlin");
        city2.setNumberOfIllnesses(1200);
        city2.setNumberOfHeals(850);

        CoronaVirus city3 = new CoronaVirus();
        city3.setCountry("Germany");
        city3.setCity("Munchen");
        city3.setNumberOfIllnesses(100);
        city3.setNumberOfHeals(85);


        city1.displayCoronaVirus();
        city2.displayCoronaVirus();
        city3.displayCoronaVirus();

        CoronaVirus.getNumbers();


        ImmutableCoronaVirus immutableCoronaVirus = new ImmutableCoronaVirus("Spain", "Madrid", 16000, 5000);
        immutableCoronaVirus.display();

        ImmutableCoronaVirus.getNumbers();
    }
}
