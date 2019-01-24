package ru.bannikov.week10_16des;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class AverageValueTest {

    public static final double PRECISION = 0.001;

    @Test
    public void whenAddEvenThen() {
        AverageValue averageValue = new AverageValue();
        List<Double> integersExampl = new ArrayList<>();
        integersExampl.add(1.0);
        integersExampl.add(1.0);
        integersExampl.add(1.0);
        integersExampl.add(1.0);
        double exceptedValue = 1.0;
        assertThat(averageValue.averDefine(integersExampl), is(exceptedValue));
    }

    @Test
    public void whenOddEvenThen() {
        AverageValue averageValue = new AverageValue();
        List<Double> integersExampl = new ArrayList<>();
        integersExampl.add(2.0);
        integersExampl.add(3.0);
        double exceptedValue = 2.5;
        assertThat(averageValue.averDefine(integersExampl), is(exceptedValue));
    }

    @Test
    public void whenDevisionResultNotIntegerThenUseAbs() {
        AverageValue averageValue = new AverageValue();
        List<Double> integersExampl = new ArrayList<>();
        integersExampl.add(3.0);
        integersExampl.add(3.0);
        integersExampl.add(4.0);
        double exceptedValue = 3.333;
        double result = averageValue.averDefine(integersExampl);
        assertTrue(Math.abs(averageValue.averDefine(integersExampl)) - exceptedValue < PRECISION);
    }
}
