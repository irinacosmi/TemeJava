package com.java.training.d02.Teme.Holiday;

public class HolidayMain {
    public static void main(String[] args) {

        ImmutableHoliday immutableHoliday= new ImmutableHoliday("Oktoberfest", "17/10/2020", "Germany", "without");

        Holiday holiday = new Holiday();
        holiday.setName("Bastille Day");
        holiday.setDate("14/07/2020");
        holiday.setCountry("France");
        holiday.setDaysOff("with");

        Holiday greek = new Holiday();
        greek.setName("Greek Independence Day");
        greek.setDate("25/03/2020");
        greek.setCountry("Greece");
        greek.setDaysOff("without");

        immutableHoliday.display();
        holiday.display();
        greek.display();

    }

}
