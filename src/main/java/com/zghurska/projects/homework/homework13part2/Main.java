package com.zghurska.projects.homework.homework13part2;

public class Main {

    public static void main(String[] args) {

        String test = "Was it a car or a cat I saw";
        String testStr = testString(test);
        System.out.println(testStr);
    }

    public static String testString(String test) {
        String newStr = " ";
        String[] arr = test.split("\\s+");

        for (int i = arr.length - 1; i >= 0; i--) {
            newStr += (arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1)) + " ";
        }

        return newStr;
    }

}
