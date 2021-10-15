package ru.typeAlcohol;

import ru.Barrel;
import java.util.Calendar;

public class Champagne extends Barrel {

    private String city;
    private String nameOfAlcohol;
    private Calendar yearCreation;

    public Champagne(int barrelSize, int fortress, String nameOfAlcohol, Calendar yearCreation) {
        super(barrelSize, fortress, nameOfAlcohol, yearCreation);
        this.city = "Champagne";
        this.nameOfAlcohol = nameOfAlcohol;
        this.yearCreation = yearCreation;
    }

    @Override
    public String toString() {
        String dateYearCreation = yearCreation.get(Calendar.DAY_OF_MONTH) + "." + yearCreation.get(Calendar.MONTH) + "." + yearCreation.get(Calendar.YEAR);
        return nameOfAlcohol + ", year of creation " + dateYearCreation;
    }
}
