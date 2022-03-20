package com.zghurska.projects.homework.homework10;

import java.util.Arrays;
import java.util.Locale;

public class StringMethod {

    public static void main(String[] args) {

//         Task 1
        String test = "Was it a car or a cat I saw?";
        String[] arr = test.split(" ");
        String testTwo = "Java";
        String testThree = "was it a car or a cat I saw?";
        String testFive = " Java";

        System.out.println(test.charAt(5));
        System.out.println(test.contains("car"));
        System.out.println(test.endsWith("or"));
        System.out.println(test.startsWith("Was"));
        System.out.println(test.equals(testTwo));
        System.out.println(test.equalsIgnoreCase(testThree));
        System.out.println(test.indexOf('a'));

        if (test.isEmpty()) {
            System.out.println("Empty line");
        } else {
            System.out.println(test);
        }

        System.out.println(testTwo.length());
        System.out.println(test.replace("car", "bus"));
        System.out.println(testTwo.substring(0, 2));
        System.out.println(testTwo.toLowerCase(Locale.ROOT));
        System.out.println(testTwo.toUpperCase(Locale.ROOT));
        System.out.println(testFive.trim());
        System.out.println(Arrays.toString(arr));

        String name = "cat";
        String testFour = "Was it a car or a %s I saw?";
        testFour = String.format(testFour, name);
        System.out.println(testFour);

    }
}
