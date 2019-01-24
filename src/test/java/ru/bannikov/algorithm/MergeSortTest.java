package ru.bannikov.algorithm;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MergeSortTest {
    @Test
    public void whenArrayIsUnsortedThenArrayBecomeSorted() {

        MergeSort mergeSort = new MergeSort();
        int[] unsorted = {2, 10, 3, 5, 4, 7};
        System.out.println(Arrays.toString(unsorted));
        assertEquals(2, (mergeSort.mergeSort(unsorted, 0, 5))[0]);
        System.out.println(Arrays.toString(mergeSort.mergeSort(unsorted, 0, 5)));
    }

    @Test
    public void defineSpeedOfAlgorithm() {
        MergeSort mergeSort = new MergeSort();
        int[] array = new int[10_000];
        for (int i = 0; i < 10_000 ; i++) {
            array[i] = (int) (Math.random()* 500);
        }
        long startTime = System.currentTimeMillis();
        mergeSort.mergeSort(array, 0, 9999);
        long finishTime = System.currentTimeMillis();
        System.out.println("Время выполнения алгоритма: " + (finishTime - startTime));
        System.out.println("Количество итераций: " + MergeSort.mergeSortCount);
    }
}
