package Collections;

import sun.awt.util.IdentityLinkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;

public class CollectionsTest {

    private int age;
    private String name;
    private String[] names = {"SID", "JOEY", "PAUL", "CHRIS", "JIM", "CRAIG", "SHAWN", "MICK", "COREY"};
    private int randIndex = (int) (Math.random() * 10 - 1);
    private String randomName = names[randIndex];

    private CollectionsTest() {
        this.age = 1;
        this.name = randomName;
    }

    private CollectionsTest(String s) {
        this.name = s;
        this.age = 1;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static void main(String[] args) {

        ArrayList<CollectionsTest> arrayList = new ArrayList<>();
        HashSet<CollectionsTest> hashSet = new HashSet<>();
        HashMap<Integer, String> hashMap = new HashMap<>();
        Queue<CollectionsTest> queue = new IdentityLinkedList<CollectionsTest>();

        for (int i = 0; i < 9; i++) arrayList.add(new CollectionsTest());

        System.out.println("Array list contains objects of class CollectionTest :" + "\n");

        for (CollectionsTest c : arrayList) System.out.println(c);

        System.out.println();
        CollectionsTest mick = new CollectionsTest("mick");
        CollectionsTest sid = new CollectionsTest("sid");
        CollectionsTest joey = new CollectionsTest("joey");
        CollectionsTest corey = new CollectionsTest("corey");
        CollectionsTest shawn = new CollectionsTest("shawn");
        CollectionsTest paul = new CollectionsTest("paul");
        CollectionsTest craig = new CollectionsTest("craig");

        //queue:
        queue.add(mick);
        queue.add(paul);
        queue.add(shawn);
        queue.add(corey);
        queue.add(joey);

        //hashmap
        hashMap.put(9, "New York");
        hashMap.put(7, "London");
        hashMap.put(8, "Paris");


        System.out.println("Queue :" + "\n");

        for (CollectionsTest c : queue) System.out.println(c);

        System.out.println("\n" + hashMap.containsKey(7));
        System.out.println(hashMap.size());
        System.out.println("\n" + "Clone this hashmap : " + hashMap.clone());
        System.out.println("HashMap values : " + "\n");
        System.out.println(hashMap.values());

        hashSet.add(mick);
        hashSet.add(sid);
        hashSet.add(joey);
        hashSet.add(corey);
        hashSet.add(shawn);

        System.out.println(hashSet.contains(joey));
        System.out.println("\n" + "HashSet :" + "\n");

        for (CollectionsTest c : hashSet) System.out.println(c);
    }
}
