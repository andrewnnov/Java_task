package ru.bannikov.week10_16des;

import java.util.List;

public class AverageValue {

    public Double averDefine(List<Double> list) {

        double sum = 0;

        if(list.isEmpty()) {

            throw new IllegalArgumentException();

        } else {

            for (int i = 0; i < list.size() ; i++) {

                sum += list.get(i);
            }

            return sum/list.size();
        }

    }


}
