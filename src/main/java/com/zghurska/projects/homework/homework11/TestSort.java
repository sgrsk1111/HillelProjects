package com.zghurska.projects.homework.homework11;


import java.util.Random;

public class TestSort {
    public static void quickSort(int[] arr, int low, int high) {

        if (arr.length == 0) {
            return;
        }

        if (high <= low) {
            return;
        }

        int middle = low + (high - low) / 2;
        int supp = arr[middle];

        int i = low;
        int j = high;

        while (i <= j) {
            while (arr[i] < supp) {
                i++;
            }
            while (arr[j] > supp) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) quickSort(arr, low, j);
        if (high > i) quickSort(arr, high, i);
    }

    public static int[] createRandomArray(int count) {
        Random random = new Random();
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}