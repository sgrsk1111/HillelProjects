package com.zghurska.projects.homework.homework12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PersonFactory {

    public static final int PERSON = 100;

    private static final Random RANDOM = new Random();

    private static String NAME[] = {"Carl", "Tom", "Anna", "Jim", "Megan"};
    private static String SURNAME[] = {"Marli", "Kennedy", "Smith", "Johnson", "Jones"};

    private static int HEIGHT = 200;

    private static int AGE = 100;

    private static Person generationPerson() {
        double weight;
        String name = NAME[Random.nextInt(NAME.length)];
        String surname = SURNAME[Random.nextInt(SURNAME.length)];
        int age = RANDOM.nextInt(AGE);
        int height = RANDOM.nextInt(HEIGHT);

        //Calculating weight

        if (age <= 30 || height < 175) {
            weight = (height - 100) - (height - 100) * 0.11;
        } else {
            weight = (height - 110) + (height - 100) * 0.06;
        }

    }
}
