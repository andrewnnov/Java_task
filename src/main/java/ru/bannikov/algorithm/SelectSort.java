package ru.bannikov.algorithm;

public class SelectSort {

    public static int countSelectSort;

    public int[] selectionSorting(int [] unSortArray) {
        
        int min;
        int tmp;

        for (int border = 0; border < unSortArray.length - 1; border++) {

            min = border;
            for (int index = border + 1; index < unSortArray.length ; index++) {

                if(unSortArray[index] < unSortArray[border]) {
                    countSelectSort++;
                    tmp = unSortArray[index];
                    unSortArray[index] = unSortArray[border];
                    unSortArray[border]=tmp;
                }
                
            }
            
        }
        return unSortArray;

    }


}
