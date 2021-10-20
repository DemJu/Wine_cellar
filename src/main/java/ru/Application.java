package ru;

import ru.typeAlcohol.Champagne;
import ru.typeAlcohol.Wine;
import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        Cellar cellar = new Cellar();
        LocalDate date = LocalDate.of(2000, 6, 7);
        Wine wine = new Wine(19,40,"Cahors", date,"Izhevsk");
        cellar.addBarrels(wine);
        date = LocalDate.of(1997,7,7);
        Champagne champagne = new Champagne(15,10,"Champagne", date);
        cellar.addBarrels(champagne);
        cellar.addBarrels(champagne);

        System.out.println("before: ");
        cellar.outCollectionBarrelsBasement(cellar);

        cellar.disposalBarrels("Champagne, year of creation 7.7.1997");
        System.out.println();

        System.out.println("after: ");
        cellar.outCollectionBarrelsBasement(cellar);

        System.out.println();
        cellar.getAllBarrels();
        System.out.println("after cleaning the cellar: ");
        cellar.outCollectionBarrelsBasement(cellar);
    }
}
