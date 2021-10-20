package ru;

import ru.typeAlcohol.Champagne;
import ru.typeAlcohol.Wine;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        Cellar cellar = new Cellar();
        LocalDate date = LocalDate.of(2000, 6, 7);
        Wine wine = new Wine(19, 40, "Cahors", date, "Izhevsk");
        cellar.addBarrels(cellar, wine, wine.toString());

        date = LocalDate.of(1997, 7, 7);
        Champagne champagne = new Champagne(15, 10, "Champagne", date);
        cellar.addBarrels(cellar, champagne, champagne.toString());

        System.out.println("before: ");
        System.out.println(cellar.conclusionBarrelsHashMap().keySet());
        System.out.println();

        System.out.println(cellar.disposalBarrels(cellar, "Champagne: year of creation 7.7.1997"));
        System.out.println();

        System.out.println("after: ");
        System.out.println(cellar.conclusionBarrelsHashMap().keySet());

        System.out.println();
        System.out.println(cellar.getAllBarrels());
        System.out.println();

        System.out.println("after cleaning the cellar: ");
        System.out.println(cellar.conclusionBarrelsHashMap().keySet());
    }
}
