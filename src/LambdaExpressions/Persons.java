package LambdaExpressions;

import Collections.PersonList;

import java.util.*;
import java.util.stream.Collectors;

public class Persons {


    public static void main(String[] args) {
        List<PersonList> persons = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            persons.add(new PersonList());
        }

        for (PersonList p : persons) {
            System.out.println(p);
        }


        System.out.println("\n"+"The stream :"+"\n");
        Set<String> pers = persons.stream()
                .filter(p -> (20 < p.getAge())&&(p.getAge() < 30))
                .map(PersonList::getName)
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toCollection(LinkedHashSet::new));

        pers.forEach(System.out::println);


    }
}
