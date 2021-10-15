package ru;

import lombok.Data;
import java.util.HashMap;
import java.util.Map;

@Data
public class Cellar {

    private final int barrelCount = 3;
    private Map<Integer,Barrel> barrelHashMap = new HashMap();
    public Map<Integer,Barrel> conclusionBarrelsHashMap() {
        return barrelHashMap;
    }

    public void addBarrels(Barrel descriptionProduct) {
        boolean pr = true;
        for (int i = 1; i <= barrelCount ; i++) {
            if (!barrelHashMap.containsKey(i)) {
                barrelHashMap.put(i, descriptionProduct);
                pr = false;
                break;
            }
        }
        if (pr) {
            System.out.println("There wasn't enough space, oops ...");
        }
    }

    public void disposalBarrels(int key){
        barrelHashMap.remove(key);
    }

    public void outCollectionBarrelsBasement(Cellar cellar) {
        for (Map.Entry<Integer, Barrel> item : conclusionBarrelsHashMap().entrySet())
        {
            System.out.printf("Barrel: %d  Label: %s \n", item.getKey(), item.getValue());
        }
        if (barrelHashMap.size() == barrelCount) {
            System.out.println("We'll have to wait, there's no place");
        } else {
            System.out.println("Free: " + (barrelCount - barrelHashMap.size()));
        }
    }
}