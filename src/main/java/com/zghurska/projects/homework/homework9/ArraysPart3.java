package com.zghurska.projects.homework.homework9;

public class ArraysPart3 {

    public static void main(String[] args) throws InterruptedException{

        char[][]arr = new char[10][10];

        fillArray(arr);
        printArray(arr);
        System.out.println();
        fillDiagonals(arr);
        printArray(arr);
        System.out.println();

        while ( true) {
            fillArray(arr);
            fillDiagonals(arr);
            fillLeftTriangle(arr);
            printArray(arr);
            System.out.println();

            Thread.sleep(500);

            fillArray(arr);
            fillDiagonals(arr);
            fillUpTriangle(arr);
            printArray(arr);
            System.out.println();

            Thread.sleep(500);

            fillArray(arr);
            fillDiagonals(arr);
            fillRightTriangle(arr);
            printArray(arr);
            System.out.println();

            Thread.sleep(500);

            fillArray(arr);
            fillDiagonals(arr);
            fillDownTriangle(arr);
            printArray(arr);
            System.out.println();

            Thread.sleep(500);

            fillArray(arr);
            fillDiagonals(arr);
            printArray(arr);

            Thread.sleep(500);
        }
    }
    private static void fillRightTriangle(char[][]arr) {
        int size= arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i<j & i+j>size) {
                    arr[i][j] = '+';
                }
            }
        }
    }
    private static void fillUpTriangle(char[][]array) {
        int size= array.length-1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i<j & i+j<size) {
                    array[i][j] = '+';
                }
            }
        }
    }
    private static void fillDownTriangle(char[][]array) {
        int size= array.length-1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i>j & i+j>size) {
                    array[i][j] = '+';
                }
            }
        }
    }
    private static void fillLeftTriangle(char[][]arrays) {
        int size = arrays.length - 1;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (i > j & i + j < size) {
                    arrays[i][j] = '+';
                }
            }
        }
    }
    private static void fillDiagonals(char[][]array){
            int size = array.length - 1;
            for (int i = 0; i < array.length; i++) {
                array[i][i] = '+';
                array[i][size - i] = '+';
            }
        }
    private static void fillArray(char[][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = '.';
            }
        }
    }
    private static void printArray(char [][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
