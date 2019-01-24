package ru.bannikov.week10_16des;

import java.util.List;

public class AverageValue {

    public Double averDefine(List<Double> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }

        double sum = 0.0;
        for (Double aList : list) {
            sum += aList;
        }
        return sum / list.size();
    }
}
