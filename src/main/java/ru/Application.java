package ru;

import ru.typeAlcohol.Champagne;
import ru.typeAlcohol.Wine;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Application {

    public static void main(String[] args) {
        Cellar cellar = new Cellar();

        Calendar date = new GregorianCalendar(2000, Calendar.JULY, 7);
        Wine wine = new Wine(19,40,"Cahors", date,"Izhevsk");
        cellar.addBarrels(wine);

        date.set(1997, Calendar.AUGUST,7);
        Champagne champagne = new Champagne(15,10,"Champagne", date);
        cellar.addBarrels(champagne);

        System.out.println("before: ");
        cellar.outCollectionBarrelsBasement(cellar);

        cellar.disposalBarrels(2);

        System.out.println();

        System.out.println("after taking a bottle of champagne: ");
        cellar.outCollectionBarrelsBasement(cellar);
    }
}
