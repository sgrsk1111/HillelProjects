package com.zghurska.projects.homework.homework10;

public class VarargsOperator {

    public static void main(String[] args) {
        //      Task 2
        int result = getMaxValues(15, 23, 14, 70, 100, 101, 99);
        System.out.println(result);
    }

    private static int getMaxValues(int... values) {
        int maxValue = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
            }
        }
        return maxValue;
    }
}
