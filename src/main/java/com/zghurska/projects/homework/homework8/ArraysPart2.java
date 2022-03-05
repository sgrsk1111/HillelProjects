package com.zghurska.projects.homework.homework8;

public class ArraysPart2 {

    public static void main(String[] args) {
        char [][] arr = new char [10][10];

        printArray(arr);
        System.out.println();
        fillArray(arr);
        System.out.println();
        printArray(arr);
        System.out.println();
        fillMainDiagonal(arr);
        System.out.println();
        printArray(arr);
        System.out.println();
        fillUpMainDiagonal(arr);
        System.out.println();
        printArray(arr);
        System.out.println();
        fillDownMainDiagonal(arr);
        System.out.println();
        printArray(arr);
    }
    private static void fillDownMainDiagonal(char [][]array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if( i>j){
                    array[i][j] = '1';
                }
            }
        }
    }
    private static void fillUpMainDiagonal(char[][]arrays){
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if( i<j){
                    arrays[i][j] = '0';
                }
            }
        }
    }
    private static void fillMainDiagonal(char[][]array){
        for (int i = 0; i < array.length; i++) {
            array[i][i] = '-';
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



