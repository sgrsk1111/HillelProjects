package com.zghurska.projects.homework.homework10;


import java.util.Scanner;

public class StringMethodTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input text");
        String text = scanner.next();

        //Task 3
        boolean result = getInfoPalindrome(text);
        System.out.println(result);
    }

    public static boolean getInfoPalindrome(String text) {
        if (text.length() == 0)
            return false;
        StringBuilder newStr = new StringBuilder(text);
        newStr.reverse();
        String reversStr = newStr.toString();
        return text.equalsIgnoreCase(reversStr);
    }
}
