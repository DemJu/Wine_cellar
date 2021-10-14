package ru;

import java.util.ArrayList;

public class Cellar {

    private final int barrelCount = 3;
    private ArrayList<Barrel> barrels = new ArrayList<>();

    public ArrayList<Barrel> conclusionBarrels() {
        return barrels;
    }

    public int getBarrelCount() {
        return barrelCount;
    }

    public void addBarrels(Barrel descriptionProduct){
        barrels.add(descriptionProduct);
    }

    public void getBarrels(int index){
        barrels.set(index, null);
    }

    public int getIndexBarrels(Barrel obj){
        return (barrels.indexOf(obj));
    }

    public boolean checkCellar(Barrel obj){
        return (barrels.contains(obj));
    }

    @Override
    public String toString() {
        return "ru.Cellar{ " + barrels.toString() + "}";
    }
}