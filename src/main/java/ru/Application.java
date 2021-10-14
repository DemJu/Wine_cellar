package ru;

import ru.typeAlcohol.Champagne;
import ru.typeAlcohol.Wine;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Application {

    public static void main(String[] args) {
        Cellar cellar = new Cellar();
        Calendar date = new GregorianCalendar(2000, 6, 7);
        Wine cask1 = new Wine(19,40,"Cahors", date,"Izhevsk");
        cellar.addBarrels(cask1);
        date.set(1997,7,7);
        Champagne cask2 = new Champagne(15,10,"Champagne", date);
        cellar.addBarrels(cask2);
        System.out.println("before: ");
        for (int i = 0; i < cellar.getBarrelCount(); i++) {
            try{
                System.out.println(cellar.conclusionBarrels().get(i));
            }
            catch (IndexOutOfBoundsException e){
                cellar.addBarrels(null);
                System.out.println("null");
            }
        }
        System.out.println();
        System.out.println("after taking a bottle of champagne: ");
        cellar.getBarrels(cellar.getIndexBarrels(cask2));
        for (Barrel str : cellar.conclusionBarrels()){
            System.out.println(str);
        }
    }
}
