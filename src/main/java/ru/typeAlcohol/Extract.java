package ru.typeAlcohol;

import java.util.Calendar;

public interface Extract {

    static String findingDateDifference(Calendar t1, Calendar t2) {
        StringBuffer result = new StringBuffer();
        result.append(t1.get(Calendar.YEAR) > t2.get(Calendar.YEAR) ? t1.get(Calendar.YEAR) - t2.get(Calendar.YEAR)
                : t2.get(Calendar.YEAR) - t1.get(Calendar.YEAR));
        result.append("y. ");
        result.append(t1.get(Calendar.MONTH) > t2.get(Calendar.MONTH) ? t1.get(Calendar.MONTH) - t2.get(Calendar.MONTH)
                : t2.get(Calendar.MONTH) - t1.get(Calendar.MONTH));
        return result.append("m.").toString();
    }
}
