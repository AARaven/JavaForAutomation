package ObjectBasics.Dogs;

import java.text.Collator;
import java.util.Arrays;
import java.util.Scanner;

public class Dog {

    private int age;
    private String name;
    private String size;

    private int randomIndexName = (int) ((Math.random() * 10) - 1);
    private int randomIndexSize = (int) (Math.random() * 3);
    private int randomAge = (int) (((Math.random() * 10) * 2) + 1);

    private String nameGenerator[] = {"Puppy", "Scooby-doo", "Rex", "Rambo", "Scotty",
            "Goofy", "Snuppy", "Dr. Sheldon", "Penny"};

    private String sizeGenerator[] = {"Big", "Medium", "Small"};

    private String randomName = nameGenerator[randomIndexName];
    private String randomOfSize = sizeGenerator[randomIndexSize];

    static Scanner scan = new Scanner(System.in);



    public String getRandomName() {
        return randomName;
    }

    public String getRandomOfSize() {
        return randomOfSize;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    Dog(String[] args) {

        for (String s : args) {

            if (s == null) {
                new Dog();
            }
            name = args[0];
            size = args[1];
            age = Integer.parseInt(args[2]);
        }
    }

    Dog() {
        this.name = randomName;
        this.size = randomOfSize;
        this.age = randomAge;
    }

    void getDogDetails() {
        System.out.print("\n" + "\n" + "{" + "The name is : "
                + name + "}" + "\t" + "{" + "The size is :" +
                " " + size + "}" + "\t" + "{" + "The age is :" +
                " " + age + "}" + "\n");
    }


    static void sortDogsByName(Dog[] dogs) {
        Arrays.sort(dogs, (o1, o2) -> Collator.getInstance().compare(o1.name, o2.name));
    }

    static void sortDogsBySize(Dog[] dogs) {
        Arrays.sort(dogs, (o1, o2) -> Collator.getInstance().compare(o1.size, o2.size));
    }

    private static void createDogArray(Dog[] dogs, int numberOfDogs) {
        for (int i = 0; i < numberOfDogs; i++) {
            dogs[i] = new Dog();
        }
    }

    static void getDogDetailsArray(Dog[] dogs, int numberOfDogs) {
        for (int i = 0; i < numberOfDogs; i++) {
            dogs[i].getDogDetails();
        }
    }

    public static void incorrectInput() {

        System.out.print("\n" + "Incorrect input..." + "\n");
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("What's number a dogs ");

        int numberOfDogs = userInput.nextInt();

        Dog myDogs[] = new Dog[numberOfDogs];

        createDogArray(myDogs, numberOfDogs);

        getDogDetailsArray(myDogs, numberOfDogs);

        sortDogsByName(myDogs);
        getDogDetailsArray(myDogs, numberOfDogs);

        sortDogsBySize(myDogs);
        getDogDetailsArray(myDogs, numberOfDogs);
    }
}




