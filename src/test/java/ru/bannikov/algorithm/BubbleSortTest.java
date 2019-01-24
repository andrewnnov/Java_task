package ru.bannikov.algorithm;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BubbleSortTest {

    @Test
    public void whenArrayIsUnsortedThenArrayBecomeSorted() {
       BubbleSort bubbleSort = new BubbleSort();
        int[] unsorted = {2, 10, 1, 5, 4, 7};
        System.out.println(Arrays.toString(unsorted));
        int[]  sortArray = {1, 2, 4, 5, 7, 10};
        assertEquals(1, (bubbleSort.sort(unsorted))[0]);
        assertEquals(2, (bubbleSort.sort(unsorted))[1]);
        assertEquals(4, (bubbleSort.sort(unsorted))[2]);
        assertEquals(5, (bubbleSort.sort(unsorted))[3]);
        assertEquals(7, (bubbleSort.sort(unsorted))[4]);
        assertEquals(10, (bubbleSort.sort(unsorted))[5]);
        System.out.println(Arrays.toString(bubbleSort.sort(unsorted)));
    }

    @Test
    public void defineSpeedOfAlgorithm() {

        BubbleSort bubbleSort = new BubbleSort();
        int[] array = new int[20000];
        for (int i = 0; i < 20000 ; i++) {
            array[i] = (int) (Math.random()* 500);
        }
        long startTime = System.currentTimeMillis();
        bubbleSort.sort(array);
        long finishTime = System.currentTimeMillis();
        System.out.println("Время выполнения алгоритма: " + (finishTime - startTime));
        System.out.println("Количество итераций: " + BubbleSort.bubbleSortCount);
    }
}





