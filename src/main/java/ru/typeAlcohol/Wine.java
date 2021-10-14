package ru.typeAlcohol;

import ru.Barrel;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Wine extends ru.Barrel {

    private String excerpt;
    private String nameOfAlcohol;
    private Calendar yearCreation;
    private String city;

    public Wine(int barrelSize, int fortress, String nameOfAlcohol, Calendar yearCreation, String city) {
        super(barrelSize, fortress, nameOfAlcohol, yearCreation);
        Calendar localDate = new GregorianCalendar(LocalDate.now().getYear(), LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth());
        this.excerpt = Extract.findingDateDifference(yearCreation,localDate);
        this.nameOfAlcohol = nameOfAlcohol;
        this.yearCreation = yearCreation;
        this.city = city;
    }

    @Override
    public String toString() {
        String dateYearCreation = yearCreation.get(Calendar.DAY_OF_MONTH) + "." + yearCreation.get(Calendar.MONTH) + "." + yearCreation.get(Calendar.YEAR);
        return nameOfAlcohol + ", harvest " + dateYearCreation + " excerpt " + excerpt;
    }
}
