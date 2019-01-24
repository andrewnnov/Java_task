package ru.bannikov.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyBinarySearchTest {

    @Test
    public void whenArrayIsEvenAndWeHaveElementThenReturnIndexOfElementArray() {

        MyBinarySearch myBinarySearch = new MyBinarySearch();
        int[] array = {1, 3, 4, 7, 12, 16, 23, 74, 125, 234};
        int number = 234;
        int expectedIndexArray = 9;
        assertEquals(expectedIndexArray, myBinarySearch.binarySearch(array, number));
    }

    @Test
    public void whenArrayIsOddAndWeHaveElementThenReturnIndexOfElementArray() {
        MyBinarySearch myBinarySearch = new MyBinarySearch();
        int[] array = {1, 3, 4, 7, 12, 16, 23, 74, 125, 234, 347};
        int number = 234;
        int expectedIndexArray = 9;
        assertEquals(expectedIndexArray, myBinarySearch.binarySearch(array, number));
    }

    @Test
    public void whenArrayIsOddAndWeDontHaveElementThenReturnIndexMinusOne() {
        MyBinarySearch myBinarySearch = new MyBinarySearch();
        int[] array = {1, 3, 4, 7, 12, 16, 23, 74, 125, 234, 347};
        int number = 567;
        int expectedIndexArray = -1;
        assertEquals(expectedIndexArray, myBinarySearch.binarySearch(array, number));
    }

    @Test
    public void defineSpeedOfAlgorithm() {
        MyBinarySearch myBinarySearch = new MyBinarySearch();
        int[] array = new int[100_000_000];
        for (int i = 0; i < 100_000_000 ; i++) {
            array[i] = i;
        }
        int number = 50_000_000;
        long startTime = System.currentTimeMillis();
        myBinarySearch.binarySearch(array, number);
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime);
        System.out.println(MyBinarySearch.count);
    }
}
