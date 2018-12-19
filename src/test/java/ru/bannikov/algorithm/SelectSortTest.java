package ru.bannikov.algorithm;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SelectSortTest {

    @Test
    public void whenArrayIsUnsortedThenArrayBecomeSorted() {

        SelectSort selectSort = new SelectSort();
        int[] unsorted = {2, 10, 1, 5, 4, 7};
        System.out.println(Arrays.toString(unsorted));
        int[]  sortArray = {1, 2, 4, 5, 7, 10};
        assertEquals(1, (selectSort.selectionSorting(unsorted))[0]);
        assertEquals(2, (selectSort.selectionSorting(unsorted))[1]);
        assertEquals(4, (selectSort.selectionSorting(unsorted))[2]);
        assertEquals(5, (selectSort.selectionSorting(unsorted))[3]);
        assertEquals(7, (selectSort.selectionSorting(unsorted))[4]);
        assertEquals(10, (selectSort.selectionSorting(unsorted))[5]);

        System.out.println(Arrays.toString(sortArray));
    }


    @Test
    public void whenArrayIsUnsortedAndHasSimilarElementThenArrayBecomeSorted() {

        SelectSort selectSort = new SelectSort();
        int[] unsorted = {2, 10, 1, 5, 5, 2};
        System.out.println(Arrays.toString(unsorted));
        int[]  sortArray = {1, 2, 2, 5, 5, 10};
        assertEquals(1, (selectSort.selectionSorting(unsorted))[0]);
        assertEquals(2, (selectSort.selectionSorting(unsorted))[1]);
        assertEquals(2, (selectSort.selectionSorting(unsorted))[2]);
        assertEquals(5, (selectSort.selectionSorting(unsorted))[3]);
        assertEquals(5, (selectSort.selectionSorting(unsorted))[4]);
        assertEquals(10, (selectSort.selectionSorting(unsorted))[5]);
        System.out.println(Arrays.toString(sortArray));
    }

    @Test
    public void defineSpeedOfAlgorithm() {

        SelectSort selectSort = new SelectSort();
        int[] array = new int[1_000];

        for (int i = 0; i < 1_000 ; i++) {
            array[i] = (int) (Math.random()* 300);
        }

        long startTime = System.currentTimeMillis();
        selectSort.selectionSorting(array);
        long finishTime = System.currentTimeMillis();

        System.out.println("Время выполнения алгоритма: " + (finishTime - startTime));
        System.out.println("Количество итераций: " + SelectSort.count);

    }





}
