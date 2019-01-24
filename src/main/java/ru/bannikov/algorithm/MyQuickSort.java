package ru.bannikov.algorithm;

public class MyQuickSort {

    public static int countQuickSort = 0;
    public int[] quickSort(int[] array, int low, int high) {

        countQuickSort++;
        if(array.length == 0) {
            return array;
        }

        if(low >= high) {
            return array;
        }

        //choose pivot element
        int middle = low + (high - low)/2;
        int pivot = array[middle];

        //делим на подмассивы, который больше и меньше опорного элемента
        int i = low;
        int j = high;

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while ((array[j])> pivot) {
                j--;
            }

            if(i <= j) {
                int tmp = array[i];
                array[i] = array [j];
                array[j] = tmp;
                i++;
                j--;
            }
        }

        //вызов рекурсии для левой и правой части
        if(low < j) {
            quickSort(array, low, j);
        }

        if (high > i) {
            quickSort(array, i, high);
        }

        return array;
    }
}
