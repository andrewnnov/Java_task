package ru.bannikov.algorithm;

public class MyBinarySearch {

    public static int count = 0;

    public int binarySearch(int[] array, int number) {

        int low = 0;
        int hight = array.length - 1;
        //int mid = low + (hight - low)/2;

        int result = -1;
        while (low <= hight) {
            count++;
            int mid = low + (hight - low)/2;
            if(array[mid] == number) {
                result = mid;
                break;
            }
            if(number < array[mid]) {
                hight = mid -1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }
}
