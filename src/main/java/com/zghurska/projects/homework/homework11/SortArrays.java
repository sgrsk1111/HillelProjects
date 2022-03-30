package com.zghurska.projects.homework.homework11;

import java.util.Arrays;

public class SortArrays {

    public static final int COUNT = 10;

    public static void main(String[] args) {
        int[] arr = TestSort.createRandomArray(COUNT);

        System.out.println("Исходный массив чисел : " + Arrays.toString(arr));

        int low = 0;
        int high = arr.length - 1;
        TestSort.quickSort(arr, low, high);

        System.out.println("Отсортированный массив чисел : " + Arrays.toString(arr));

    }
}
