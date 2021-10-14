package ru;

import java.util.Calendar;

public abstract class Barrel {

    private final int barrelMaxSize = 20;
    private int barrelSize;
    private int fortress;
    private String nameOfAlcohol;
    private Calendar yearCreation;

    public Calendar getYearCreation() {
        return yearCreation;
    }

    public void setYearCreation(Calendar yearCreation) {
        this.yearCreation = yearCreation;
    }

    public Barrel(int barrelSize, int fortress, String nameOfAlcohol, Calendar yearCreation) {
        this.barrelSize = barrelSize;
        this.fortress = fortress;
        this.nameOfAlcohol = nameOfAlcohol;
        this.yearCreation = yearCreation;
    }

    public int getBarrelMaxSize() {
        return barrelMaxSize;
    }

    public int getBarrelSize() {
        return barrelSize;
    }

    public int getFortress() {
        return fortress;
    }

    public void setFortress(int fortress) {
        this.fortress = fortress;
    }

    public String getNameOfAlcohol() {
        return nameOfAlcohol;
    }

    public void setNameOfAlcohol(String nameOfAlcohol) {
        this.nameOfAlcohol = nameOfAlcohol;
    }

    @Override
    public String toString() {
        return "ru.Barrel { " +
                "barrelMaxSize: " + barrelMaxSize +
                ", barrelSize: " + barrelSize +
                ", fortress: " + fortress +
                ", nameOfAlcohol: '" + nameOfAlcohol + " }";
    }
}
