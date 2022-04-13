package com.zghurska.projects.homework.homework12;

import java.util.*;

public class PersonFactory {

    public static final int PERSON = 100;

    private static final Random RANDOM = new Random();

    private static final String[] NAME = {"Carl", "Tom", "Anna", "Jim", "Megan"};
    private static final String[] SURNAME = {"Marli", "Kennedy", "Smith", "Johnson", "Jones"};

    private static final int MAX_AGE = 100;
    private static final int MIN_AGE = 14;
    private static final int MAX_HEIGHT = 200;
    private static final int MIN_HEIGHT = 150;

    public static List<Person> generateUniquePerson() {

        List<Person> list = generatePerson();
        Set<Person> result = new HashSet<>(list);
        list.clear();
        list.addAll(result);
        return list;
    }

    public static List<Person> generatePerson() {

        List<Person> result = new ArrayList<>();
        for (int i = 0; i < PERSON; i++) {
            Person person = generatePersonRandom();
            result.add(person);
        }
        return result;
    }

    private static Person generatePersonRandom() {

        String name = NAME[RANDOM.nextInt(NAME.length)];
        String surname = SURNAME[RANDOM.nextInt(SURNAME.length)];

        int age = (MIN_AGE + (int) (Math.random() * (MAX_AGE - MIN_AGE)));
        int height = (MIN_HEIGHT + (int) (Math.random() * (MAX_HEIGHT - MIN_HEIGHT)));

        double weight = Math.ceil(50 + 0.75 * (height - 150) + (age - 20) / 4);

        return new Person(name, surname, age, weight, height);
    }

}
