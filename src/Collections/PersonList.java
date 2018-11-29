package Collections;

import java.util.*;

public class PersonList implements Comparable<PersonList>{

    private int age;
    private String name;
    private String[] names = {"Sid","Joey","Paul","Chris","Jim","Craig","Shawn","Mick","Corey"};
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

    public static boolean equaliserOfTwoListPerson(List<PersonList> list1, List<PersonList> list2) {
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
            if (this.getAge() == personList.getAge()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public int compareTo(PersonList p1) {
        return this.age - p1.age;
    }

    public static void main(String[] args) {

        List<PersonList> persons = new ArrayList<>();
        List<PersonList> sortPer;
        PersonList persona = new PersonList();
        PersonList per = new PersonList();

        for (int i = 0; i < 9; i++) persons.add(new PersonList());

        System.out.println("Arraylist : "+"\n");

        for (PersonList p : persons) System.out.println(p);

        //without comparator:
        System.out.println("\n"+"Sort without comparator : "+"\n");
        Collections.sort(persons);

        for (PersonList p : persons) System.out.println(p);

        System.out.println("\n"+"With comparator: "+"\n");

        Collections.sort(persons, new Comparator<PersonList>() {
            @Override
            public int compare(PersonList p1, PersonList p2) {
                if (p1.name.compareTo(p2.name)== 0) return p1.age-p2.age;
                return p1.name.compareTo(p2.name);
            }
        });

        for (PersonList p : persons) System.out.println(p);

        System.out.println("\n\n\n");
        System.out.println("Unique method :");
        sortPer = fromListToUniqueNameList(persons);

        for (PersonList p : sortPer) System.out.println(p);

//        sortPer.add(persona);
//        persons.add(per);

        System.out.println("\n"+"Equals of Two : ");
        System.out.println(equaliserOfTwoListPerson(persons,sortPer));

        System.out.println("Equalized array list now : "+"\n");
        Collections.sort(persons);
        for (PersonList p : persons) System.out.println(p);
    }
}
