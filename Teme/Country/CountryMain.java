package com.java.training.d02.Teme.Country;

public class CountryMain {
    public static void main(String[] args) {
        Country rom = new Country();
        rom.setName("Romania");
        rom.setNumberCounties(41);
        rom.setFormGovernment("republic");
        rom.setCitizens(19500000);
        rom.setGdp(12285);

        Country uk = new Country();
        uk.setName("UK");
        uk.setNumberCounties(48);
        uk.setFormGovernment("constitutional monarchy");
        uk.setCitizens(66440000);
        uk.setGdp(41030);

        ImmutableCountry germ = new ImmutableCountry("Germany", 16, 82176000, "republic", 46564);

        rom.display();
        uk.display();
        germ.display();




    }
}
