package com.ab.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyDemo {
    public static void main(String[] args) {
        Person  arpit = new Person(28,"Arpit", "235325325");
        Person  mark = new Person(32,"Mark", "2352222222");
        Person  chris = new Person(26,"Chris", "235311111");

        List<Person> personList = new ArrayList<>();

        personList.add(arpit);
        personList.add(mark);
        personList.add(chris);

        System.out.println("Not Sorted");

        printContents(personList);

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getAge()>o2.getAge()){
                    return 1;
                }
                if(o1.getAge()<o2.getAge()){
                    return -1;
                }
                return 0;
            }
        });
        System.out.println("Sorted By Age");
        printContents(personList);

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Sorted By Name");
        printContents(personList);
    }

    private static void printContents(List<Person> personList) {
        for (Person person:personList
             ) {
            System.out.println(person.getName());
        }
    }
}
