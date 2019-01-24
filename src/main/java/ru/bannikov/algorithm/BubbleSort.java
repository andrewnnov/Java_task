package ru.bannikov.algorithm;


public class BubbleSort {

    public static int bubbleSortCount = 0;

    public int[] sort(int[] array){
        for(int i = array.length -1; i > 0; i--){
            for(int j = 0; j < i; j++){
                bubbleSortCount++;
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
