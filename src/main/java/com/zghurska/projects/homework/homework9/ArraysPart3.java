package com.zghurska.projects.homework.homework9;

public class ArraysPart3 {

    public static void main(String[] args) {
        char[][]arr = new char[10][10];

        fillArray(arr);
        printArray(arr);
        System.out.println();
        fillDiagonals(arr);
        printArray(arr);
        System.out.println();

        fillLeftTriangle(arr);
        printArray(arr);
        System.out.println();
        fillUpTriangle(arr);
        printArray(arr);
        System.out.println();
        fillRightTriangle(arr);
        printArray(arr);
        System.out.println();
        fillDownTriangle(arr);
        printArray(arr);



    }
    private static void fillRightTriangle(char[][]arr) {
        int size= arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i<j & i+j>size) {
                    arr[i][j] = '1';
                }
            }
        }
    }
    private static void fillUpTriangle(char[][]array) {
        int size= array.length-1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i<j & i+j<size) {
                    array[i][j] = '2';
                }
            }
        }
    }
    private static void fillDownTriangle(char[][]array) {
        int size= array.length-1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i>j & i+j>size) {
                    array[i][j] = '3';
                }
            }
        }
    }
    private static void fillLeftTriangle(char[][]arrays) {
        int size= arrays.length-1;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (i>j & i+j<size) {
                    arrays[i][j] = '4';
                }
            }
        }
    }
    private static void fillDiagonals(char[][]array){
        int size = array.length-1;
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
