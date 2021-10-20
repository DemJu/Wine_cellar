package ru;

import lombok.Data;
import java.util.HashMap;
import java.util.Map;

@Data
public class Cellar {

    private Map<String,Barrel> barrelHashMap = new HashMap();

    public Map<String,Barrel> conclusionBarrelsHashMap() {
        return barrelHashMap;
    }

    public void addBarrels(Barrel descriptionProduct) {
        try {
            if (!barrelHashMap.containsKey(descriptionProduct.toString())) {
                barrelHashMap.put(descriptionProduct.toString(), descriptionProduct);
            } else {
                throw new RuntimeException();
            }
        } catch (NullPointerException e) {
            System.out.println();
            System.out.println("You can't put emptiness in a barrel");
            System.out.println();
        } catch (RuntimeException r) {
            System.out.println();
            System.out.println("A barrel with such a label already exists");
            System.out.println();
        }
    }

    public void disposalBarrels(String key){
        try {
            if (barrelHashMap.containsKey(key)) {
                barrelHashMap.remove(key);
            } else {
                throw new NullPointerException();
            }
        } catch (NullPointerException n) {
            System.out.println("A barrel with such a label was not found");
        }
    }

    public void getAllBarrels() {
        barrelHashMap.clear();
        System.out.println("The cellar is cleared");
    }

    public void outCollectionBarrelsBasement(Cellar cellar) {
        for (Map.Entry<String, Barrel> item : conclusionBarrelsHashMap().entrySet())
        {
            System.out.println(item.getKey());
        }
    }
}