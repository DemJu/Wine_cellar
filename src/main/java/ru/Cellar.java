package ru;

import lombok.Data;
import java.util.HashMap;
import java.util.Map;

@Data
public class Cellar {

    private final int barrelCount = 3;
    private Map<String,Barrel> barrelHashMap = new HashMap();

    public Map<String,Barrel> conclusionBarrelsHashMap() {
        return barrelHashMap;
    }

    public void addBarrels(Barrel descriptionProduct) {
        try {
            if (barrelHashMap.size() < barrelCount) {
                barrelHashMap.put(descriptionProduct.toString(), descriptionProduct);
            } else {
                System.out.println("There wasn't enough room in the cellar, oops...");
            }
        } catch (NullPointerException e) {
            System.out.println("You can't put emptiness in a barrel");
        }
    }

    public void disposalBarrels(String key){
        barrelHashMap.remove(key);
    }

    public void outCollectionBarrelsBasement(Cellar cellar) {
        for (Map.Entry<String, Barrel> item : conclusionBarrelsHashMap().entrySet())
        {
            System.out.println(item.getKey());
        }
        System.out.println("Free: " + (barrelCount - barrelHashMap.size()));
    }
}