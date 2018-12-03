package Collections;

import java.util.*;

public class PersonList implements Comparable<PersonList> {

    private int age;
    private String name;
    private String[] names = {"Sid", "Joey", "Paul", "Chris", "Jim", "Craig", "Shawn", "Mick", "Corey"};
    private int randomIndex = ((int) (Math.random() * 9));
    private Random rand = new Random();

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public PersonList() {
        this.age = (rand.nextInt(20) * 2);
        this.name = this.names[this.randomIndex];
    }

    private PersonList(int age, int name) {
        this.age = age * randomIndex;
        this.name = names[name * randomIndex];
    }

    public String toString() {
        return (this.name + " " + this.age);
    }

    private static List<PersonList> fromListToUniqueNameList(List<PersonList> list) {
        Set<PersonList> set = new TreeSet<PersonList>(list);
        list.clear();
        list.addAll(set);
        return new ArrayList<PersonList>(list);
    }

    private static boolean equaliserOfTwoListPerson(List<PersonList> list1, List<PersonList> list2) {
        if (list1.size() == list2.size()) {
            return list1.equals(list2);
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PersonList) {
            PersonList personList = (PersonList) obj;
            if (this.getName().equals(personList.getName())) {
                return true;
            }
            return this.getAge() == personList.getAge();
        }
        return false;
    }

    @Override
    public int compareTo(PersonList p1) {
        return this.age - p1.age;
    }

    public static void main(String[] args) {

        List<PersonList> persons = new ArrayList<>();
        List<PersonList> uniquePer;

        for (int i = 0; i < 9; i++) persons.add(new PersonList());

        System.out.println("ArrayList : " + "\n");
        for (PersonList p : persons) System.out.println(p);


        System.out.println("\n" + "Sort without comparator : " + "\n");
        Collections.sort(persons);
        for (PersonList p : persons) System.out.println(p);

        System.out.println("\n" + "With comparator : " + "\n");
        persons.sort((p1, p2) -> {
            if (p1.name.compareTo(p2.name) == 0) return p1.age - p2.age;
            return p1.name.compareTo(p2.name);
        });
        for (PersonList p : persons) System.out.println(p);

        System.out.println("\n" + "Unique method :" + "\n");
        uniquePer = fromListToUniqueNameList(persons);
        for (PersonList p : uniquePer) System.out.println(p);

        System.out.print("\n" + "Equals of Two : " + " ");
        System.out.println(equaliserOfTwoListPerson(persons, uniquePer));
        System.out.println("List size is : " + persons.size() + " and " + uniquePer.size());

        System.out.println("\n" + "Sort array list now : " + "\n");
        persons.sort((Comparator.comparing(o -> o.getName())));
        for (PersonList p : persons) System.out.println(p);
    }
}
