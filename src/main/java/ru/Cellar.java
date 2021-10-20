package ru;

import lombok.Data;
import ru.Exceptions.BarrelProcessing;
import ru.Exceptions.CheckingBarrels;

import java.util.HashMap;
import java.util.Map;

@Data
public class Cellar {

    private Map<String, Barrel> barrelHashMap = new HashMap();

    public Map<String, Barrel> conclusionBarrelsHashMap() {
        return barrelHashMap;
    }

    public String addBarrels(Cellar cellar, Barrel descriptionProduct, String key) {
        try {
            return BarrelProcessing.putBarrels(cellar, descriptionProduct, key);
        } catch (CheckingBarrels checkingBarrels) {
            return checkingBarrels.getMessage();
        }
    }

    public String disposalBarrels(Cellar cellar, String key) {
        try {
            return BarrelProcessing.removeBarrels(cellar, key);
        } catch (CheckingBarrels checkingBarrels) {
            return checkingBarrels.getMessage();
        }
    }

    public String getAllBarrels() {
        barrelHashMap.clear();
        return "The cellar is cleared";
    }
    /*
    public void outCollectionBarrelsBasement(Cellar cellar) {
        for (Map.Entry<String, Barrel> item : conclusionBarrelsHashMap().entrySet()) {
            System.out.println(item.getKey());
        }
    }
    */
}