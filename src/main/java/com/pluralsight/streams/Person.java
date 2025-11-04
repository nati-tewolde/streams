package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static double getAverageAge(List<Person> people) {
        double averageAge = 0;
        for (Person person : people) {
            averageAge += person.age;
        }
        return averageAge / people.size();
    }

    public static int getOldestPerson(List<Person> people) {
        int oldestAge = people.get(0).age;
        for (Person person : people) {
            if (person.age >= oldestAge) {
                oldestAge = person.age;
            }
        }
        return oldestAge;
    }

    public static int getYoungestPerson(List<Person> people) {
        int youngestAge = people.get(0).age;
        for (Person person : people) {
            if (person.age <= youngestAge) {
                youngestAge = person.age;
            }
        }
        return youngestAge;
    }
}
