package com.zghurska.projects.homework.homework12;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Person> people = PersonFactory.generateUniquePerson();
        for (Person person : people) {
            System.out.println(person);
        }
        PersonFactory.generatePerson();
    }
}
