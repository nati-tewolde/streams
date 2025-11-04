package com.pluralsight;

import com.pluralsight.streams.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Person> people = getPeopleList();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a name: ");
        String nameSearch = scanner.nextLine();

        List<Person> matchingPeople = new ArrayList<>();
        for (Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(nameSearch) ||
                    person.getLastName().equalsIgnoreCase(nameSearch)) {
                matchingPeople.add(person);
            }
        }

        System.out.println("Matching people: " + matchingPeople);
        System.out.println("\nAverage age: " + getAverageAge(getPeopleList()));
        System.out.println("Oldest age: " + getOldestPerson(getPeopleList()));
        System.out.println("Youngest age: " + getYoungestPerson(getPeopleList()));
    }

    private static List<Person> getPeopleList() {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Beth", "Hawkins", 29));
        people.add(new Person("Marcus", "Reeves", 41));
        people.add(new Person("Lena", "Carver", 22));
        people.add(new Person("Derek", "Montoya", 35));
        people.add(new Person("Alicia", "Patterson", 19));
        people.add(new Person("Sam", "Whitfield", 50));
        people.add(new Person("Jordan", "Keller", 27));
        people.add(new Person("Priya", "Sundar", 33));
        people.add(new Person("Caleb", "Owens", 46));
        people.add(new Person("Nina", "Barlow", 24));

        return people;
    }

    private static double getAverageAge(List<Person> people) {
        double totalAge = 0;
        for (Person person : people) {
            totalAge += person.getAge();
        }
        return totalAge / people.size();
    }

    private static int getOldestPerson(List<Person> people) {
        int oldestAge = Integer.MIN_VALUE;
        for (Person person : people) {
            if (person.getAge() > oldestAge) {
                oldestAge = person.getAge();
            }
        }
        return oldestAge;
    }

    private static int getYoungestPerson(List<Person> people) {
        int youngestAge = Integer.MAX_VALUE;
        for (Person person : people) {
            if (person.getAge() < youngestAge) {
                youngestAge = person.getAge();
            }
        }
        return youngestAge;
    }
}

