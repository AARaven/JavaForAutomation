package LambdaExpressions;

import Collections.PersonList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Persons {

    public static void main(String[] args) {

        List<PersonList> persons = new ArrayList<>();

        for (int i = 0; i < 20; i++) persons.add(new PersonList());
        System.out.println("Person list : " + "\n");
        for (PersonList p : persons) System.out.println(p);

        System.out.println("\n" + "The stream :" + "\n");
        Collection<String> pers = persons.stream()
                .filter(p -> (20 < p.getAge()) && (p.getAge() < 30))
                .map(PersonList::getName)
                .map(String::toUpperCase)
                .distinct()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toCollection(ArrayList::new));

        pers.forEach(System.out::println);
    }
}
