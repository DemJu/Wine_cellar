package ru;

import java.time.LocalDate;

public interface Extract {
    //находит разнецу между датами (год и день), другого способа пока что не нашёл =(
    static String findingDateDifference(LocalDate t1, LocalDate t2) {
        StringBuffer result = new StringBuffer();
        result.append(t1.getYear() > t2.getYear() ? t1.getYear() - t2.getYear()
                : t2.getYear() - t1.getYear());
        result.append("y. ");
        result.append(t1.getMonthValue() > t2.getMonthValue() ? t1.getMonthValue() - t2.getMonthValue()
                : t2.getMonthValue() - t1.getMonthValue());
        return result.append("m.").toString();
    }
}
