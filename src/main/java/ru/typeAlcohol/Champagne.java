package ru.typeAlcohol;

import ru.Barrel;

import java.time.LocalDate;

public class Champagne extends Barrel {

    private String city;
    private String nameOfAlcohol;
    private final LocalDate yearCreation;

    public Champagne(int barrelSize, int fortress, String nameOfAlcohol, LocalDate yearCreation) {
        super(barrelSize, fortress, nameOfAlcohol, yearCreation);
        this.city = "Champagne";
        this.nameOfAlcohol = nameOfAlcohol;
        this.yearCreation = yearCreation;
    }

    @Override
    public String toString() {
        String dateYearCreation = yearCreation.getDayOfMonth() + "." + yearCreation.getMonthValue() + "." + yearCreation.getYear();
        return nameOfAlcohol + ": year of creation " + dateYearCreation;
    }
}
