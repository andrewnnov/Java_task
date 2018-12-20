package ru.bannikov.algorithm;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class QuicSortTest {

    @Test
    public void whenArrayIsUnsortedThenArrayBecomeSorted() {

        MyQuickSort myQuickSort = new MyQuickSort();
        int[] unsorted = {2, 10, 3, 5, 4, 7};
        System.out.println(Arrays.toString(unsorted));

        assertEquals(2, (myQuickSort.quickSort(unsorted, 0, 5))[0]);


        //System.out.println(Arrays.toString(myQuickSort.quickSort(unsorted, 0, 5)));
    }

    @Test
    public void defineSpeedOfAlgorithm() {

        MyQuickSort myQuickSort = new MyQuickSort();
        int[] array = new int[10_000];

        for (int i = 0; i < 10_000 ; i++) {
            array[i] = (int) (Math.random()* 500);
        }

        long startTime = System.currentTimeMillis();
        myQuickSort.quickSort(array, 0, 9999);
        long finishTime = System.currentTimeMillis();

        System.out.println("Время выполнения алгоритма: " + (finishTime - startTime));
        System.out.println("Количество итераций: " + MyQuickSort.countQuickSort);

    }
}
