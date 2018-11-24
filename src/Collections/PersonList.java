package Collections;

import java.util.*;

public class PersonList implements Comparable<PersonList>{

    private int age;
    private String name;
    private String[] names = {"SID","JOEY","PAUL","CHRIS","JIM","CRAIG","SHAWN","MICK","COREY"};
    private int randomIndex = ((int) (Math.random() * 9));

    PersonList() {
        this.age = randomIndex * 5;
        this.name = this.names[this.randomIndex];
    }

    private PersonList(int age,int name) {
        this.age = age*randomIndex;
        this.name = names[name*randomIndex];
    }

    public String toString() {
        return (this.name +" "+this.age);
    }

    public static List<PersonList> fromListToUniqueNameList(List<PersonList> list) {
        Set<PersonList> set = new TreeSet<PersonList>();
        set.addAll(list);
        list.removeAll(list);
        list.addAll(set);
        return new ArrayList<PersonList>(list);
    }

    private static boolean equaliserOfTwoListPerson(List<PersonList> list1, List<PersonList> list2) {

//// TODO: refactor this method with overrides equals()
     return false;
    }

    private boolean equals(PersonList p) {
        return super.equals(p.name);
    }

    @Override
    public int compareTo(PersonList p1) {
        return this.age - p1.age;
    }

    public static void main(String[] args) {

        List<PersonList> persons = new ArrayList<>();
        List<PersonList> sortPer;

        for (int i = 0; i < 9; i++) {
            persons.add(new PersonList());
        }

        System.out.println("Arraylist : "+"\n");
        for (PersonList p : persons) {
            System.out.println(p);
        }

        //without comparator:
        System.out.println("\n"+"Sort without comparator : "+"\n");
        Collections.sort(persons);
        for (PersonList p : persons) {
            System.out.println(p);
        }

        System.out.println("\n"+"With comparator: "+"\n");
        Collections.sort(persons, new Comparator<PersonList>() {
            @Override
            public int compare(PersonList p1, PersonList p2) {
                if (p1.name.compareTo(p2.name)== 0) return p1.age-p2.age;
                return p1.name.compareTo(p2.name);
            }
        });

        for (PersonList p : persons) {
            System.out.println(p);
        }

        System.out.println("\n\n\n");
        System.out.println("Unique method :");
        sortPer = fromListToUniqueNameList(persons);
        for (PersonList p : sortPer) {
            System.out.println(p);
        }

        System.out.println("\n"+"Equals of Two : ");
        System.out.println(equaliserOfTwoListPerson(persons,sortPer));

        System.out.println("Equalized array list now : "+"\n");
        Collections.sort(persons);
        for (PersonList p : persons) {
            System.out.println(p);
        }
    }
}
