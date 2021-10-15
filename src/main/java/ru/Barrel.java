package ru;

import lombok.Data;
import java.util.Calendar;

@Data
public abstract class Barrel {

    private final int barrelMaxSize = 20;
    private int barrelSize;
    private int fortress;
    private String nameOfAlcohol;
    private Calendar yearCreation;

    public Barrel(int barrelSize, int fortress, String nameOfAlcohol, Calendar yearCreation) {
        this.barrelSize = barrelSize;
        this.fortress = fortress;
        this.nameOfAlcohol = nameOfAlcohol;
        this.yearCreation = yearCreation;
    }
}
