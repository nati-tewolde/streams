package com.pluralsight;

import com.pluralsight.streams.Person;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
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

        System.out.println(Person.getAverageAge(people));
        System.out.println(Person.getOldestPerson(people));
        System.out.println(Person.getYoungestPerson(people));

    }

}
