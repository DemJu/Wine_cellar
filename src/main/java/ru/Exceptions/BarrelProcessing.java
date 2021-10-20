package ru.Exceptions;

import ru.Barrel;
import ru.Cellar;

public class BarrelProcessing {

    public static String removeBarrels(Cellar cellar, String key) throws CheckingBarrels {
        if (cellar.conclusionBarrelsHashMap().containsKey(key)) {
            cellar.conclusionBarrelsHashMap().remove(key);
            return "A barrel with a label '" + key + "' withdrawn";
        } else {
            throw new CheckingBarrels("There is no such barrel in the cellar");
        }
    }

    public static String putBarrels(Cellar cellar, Barrel descriptionProduct, String key) throws CheckingBarrels {
        if (!cellar.conclusionBarrelsHashMap().containsKey(key)) {
            cellar.conclusionBarrelsHashMap().put(descriptionProduct.toString(), descriptionProduct);
            return "A barrel with a label '" + descriptionProduct.toString() + "' added";
        } else {
            throw new CheckingBarrels("A barrel with such a label already exists");
        }
    }
}
