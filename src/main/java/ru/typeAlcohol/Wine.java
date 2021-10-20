package ru.typeAlcohol;

import ru.Extract;

import java.time.LocalDate;

public class Wine extends ru.Barrel {

    private String excerpt;
    private String nameOfAlcohol;
    private final LocalDate yearCreation;
    private String city;

    public Wine(int barrelSize, int fortress, String nameOfAlcohol, LocalDate yearCreation, String city) {
        super(barrelSize, fortress, nameOfAlcohol, yearCreation);
        LocalDate localDate = LocalDate.now();
        this.excerpt = Extract.findingDateDifference(yearCreation, localDate);
        this.nameOfAlcohol = nameOfAlcohol;
        this.yearCreation = yearCreation;
        this.city = city;
    }

    @Override
    public String toString() {
        String dateYearCreation = yearCreation.getDayOfMonth() + "." + yearCreation.getMonthValue() + "." + yearCreation.getYear();
        return nameOfAlcohol + ": harvest " + dateYearCreation + " excerpt " + excerpt;
    }
}
