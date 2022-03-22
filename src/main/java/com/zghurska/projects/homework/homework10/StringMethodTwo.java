package com.zghurska.projects.homework.homework10;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMethodTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input text");
        String text = scanner.next();

        //Task 3
//        boolean result1 = getInfoPalindrome(text);
//        System.out.println(result1);

        //Task 4
        boolean result2 = getInfoConsistString(text);
        System.out.println(result2);

    }

    public static boolean getInfoPalindrome(String text) {
        if (text.length() == 0)
            return false;
        StringBuilder newStr = new StringBuilder(text);
        newStr.reverse();
        String reversStr = newStr.toString();
        return text.equalsIgnoreCase(reversStr);
    }

    public static boolean getInfoConsistString(String text) {
        Pattern p = Pattern.compile("[a-zA-Z]");
        Matcher m = p.matcher(text);
        if (text.length() == 0)
            return false;
        if (m.find())
            return false;
        return true;
        // \p{Punct}
    }
}
