package ObjectBasics.Dogs;

import java.text.Collator;
import java.util.*;

public class Dog {

     public int age;
     public String name;
     public String size;

    static Scanner scan = new Scanner(System.in);

     int randomIndexName = (int) ((Math.random() * 10) - 1);
     int randomIndexSize = (int) (Math.random() * 3);
     int randomAge = (int) (((Math.random() * 10) * 2) + 1);

     String nameGenerator[] = {"Puppy","Scooby-doo","Rex","Rambo","Scotty",
                               "Goofy","Snuppy","Dr. Sheldon","Penny"};

     String sizeGenerator[] = {"Big", "Medium", "Small"};

     String randomName = nameGenerator[randomIndexName];
     String randomOfSize = sizeGenerator[randomIndexSize];

    public  String getRandomName() {
        return randomName;
    }

    public  String getRandomOfSize() {
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

    public Dog(String[] args) {

        for (String s : args) {

            if (s == null) {
                new Dog();
            }
            name = args[0];
            size = args[1];
            age = Integer.parseInt(args[2]);
        }
    }

    public Dog() {

        this.name = randomName;
        this.size = randomOfSize;
        this.age = randomAge;
    }

    public void getDogDetails() {

        System.out.print("\n"+"\n"+"{"+"The name is : "
                    +name +"}"+"\t"+"{"+"The size is :" +
                " " +size +"}"+"\t"+"{"+"The age is :" +
                " " +age +"}"+"\n");

    }


    public static void sortDogsByName(Dog[] dogs) {

        Arrays.sort(dogs, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return Collator.getInstance().compare(o1.name,o2.name);
            }
        });
    }

    public static void sortDogsBySize(Dog[] dogs) {

        Arrays.sort(dogs, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return Collator.getInstance().compare(o1.size,o2.size);
            }
        });
    }

    public static void createDogArray(Dog[] dogs,int numberOfDogs) {

        for (int i = 0; i < numberOfDogs; i++) {
            dogs[i] = new Dog();
        }
    }

    public static void getDogDetailsArray(Dog[] dogs, int numberOfDogs) {

        for (int i = 0; i < numberOfDogs; i++) {
            dogs[i].getDogDetails();
        }
    }

    public static void incorrectInput() {

        System.out.print("\n" +"Incorrect input..." +"\n");
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("What's number a dogs ");

        int numberOfDogs = userInput.nextInt();

        Dog myDogs[] = new Dog[numberOfDogs];

        createDogArray(myDogs,numberOfDogs);

        getDogDetailsArray(myDogs,numberOfDogs);

        sortDogsByName(myDogs);
        getDogDetailsArray(myDogs,numberOfDogs);

        sortDogsBySize(myDogs);
        getDogDetailsArray(myDogs,numberOfDogs);

    }
}




