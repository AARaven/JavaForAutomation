package ObjectBasics.Dogs;

import java.util.Scanner;

public class DogsDemo  {

    public static void createMainMenu() {

        System.out.println("\f");
        System.out.println("********************************************");
        System.out.println("* 1 - Dogs creator.                        *");
        System.out.println("* 2 - Dogs randomaizer.                    *");
        System.out.println("* 3 - Exit.                                *");
        System.out.println("********************************************"+"\n");

    }

    public static void createDogCreaterMenu() {

        System.out.println("\f");
        System.out.println("***********************************************");
        System.out.println("*                Dogs creator                 *");
        System.out.println("***********************************************");
        System.out.println("*     Enter the numbers                       *");
        System.out.println("*                           of dogs :         *");
        System.out.println("***********************************************"+"\n");

    }

    public static void createDogSortMenu() {

        System.out.println("\f");
        System.out.println("***********************************************");
        System.out.println("*                Dogs sorting                 *");
        System.out.println("***********************************************");
        System.out.println("*     1 - By name.                            *");
        System.out.println("*     2 - By size.                            *");
        System.out.println("*     3 - Exit.                               *");
        System.out.println("***********************************************"+"\n");
    }

    public static void createDogCreaterMenuNext() {

        System.out.println("\f");
        System.out.println("***********************************************");
        System.out.println("*                Dogs creator                 *");
        System.out.println("***********************************************");
        System.out.println("*     Enter the parameters of dogs :          *");
        System.out.println("*{Name :}{Size :(Big,Medium,Small)}{Age : <20}*");
        System.out.println("***********************************************"+"\n");

    }

    public static void createDogRandomizerMenu() {

        System.out.println("\f");
        System.out.println("\n"+"********************************************");
        System.out.println("*            *Dogs randomizer*             *");
        System.out.println("********************************************"+"\n");
        System.out.println("*            What's number a dogs?         *");
        System.out.println("*                                          *");
        System.out.println("*             Enter the value :            *");
        System.out.println("********************************************"+"\n");
    }

    public static void pleasePressEnter() throws Exception {

        System.out.print("\n"+"Please press 'ENTER' to continue..."+ "\n");
        System.in.read();
    }

    public static void complitedString() {

        System.out.print("\n"+"Completed..."+ "\n");
    }

    public static void createDogArray(Dog[] dogs,int numberOfDogs) {

        for (int i = 0; i < numberOfDogs; i++) {
           dogs[i] = new Dog();
        }
    }

    public static void getDogDetailsArray(Dog[] dogs, int numberOfDogs) {

        for (int i = 0; i < numberOfDogs; i++) {
            System.out.print("\n"+"The " + (i + 1) + " dog in array : ");
            dogs[i].getDogDetails();
        }
    }

    public static void incorrectInput() {

        System.out.print("\n" +"Incorrect input..." +"\n");
    }

    public static void exit() {

        System.out.print("\n"+"Exiting..."+"\n");
        System.exit(0);
    }

    public static void main(String[] args) throws Exception{


        Scanner userInput = new Scanner(System.in);

        System.out.print("What's number a dogs ");

        MainMenuLabel:
        while (true) {


            createMainMenu();

            String checkUserInput = userInput.nextLine();

            switch (checkUserInput) {

                case ("1"):

                    while (true) {

                    createDogCreaterMenu();

                    int numberOfDogs = userInput.nextInt();

                    createDogCreaterMenuNext();

                    Dog createDogs[] = new Dog[numberOfDogs];
                    String[] myInput = new String[3];


                        for (int i = 0; i < numberOfDogs; i++) {

                            myInput[0] = userInput.nextLine();
                            myInput[1] = userInput.nextLine();
                            myInput[2] = userInput.nextLine();

                            createDogs[i] = new Dog(myInput);
                        }

                        for (int i = 0; i < numberOfDogs; i++) {
                            createDogs[i].getDogDetails();
                        }

                        pleasePressEnter();

                        continue MainMenuLabel;
            }
                case ("2"):

                    createDogRandomizerMenu();

                    int numberOfDogs = userInput.nextInt();

                    Dog myDogs[] = new Dog[numberOfDogs];

                    createDogArray(myDogs,numberOfDogs);

                    complitedString();
                    pleasePressEnter();

                    Dog.sortDogsByName(myDogs);
                    getDogDetailsArray(myDogs,numberOfDogs);

                    Dog.sortDogsBySize(myDogs);
                    getDogDetailsArray(myDogs,numberOfDogs);

                    while (true) {

                        createDogSortMenu();

                        String checkUserInputSort = userInput.nextLine();

                        switch (checkUserInputSort) {

                            case ("1"):

                                Dog.sortDogsByName(myDogs);
                                complitedString();
                                pleasePressEnter();
                                Dog.getDogDetailsArray(myDogs,numberOfDogs);

                                break;

                            case ("2"):

                                Dog.sortDogsBySize(myDogs);
                                complitedString();
                                pleasePressEnter();
                                Dog.getDogDetailsArray(myDogs,numberOfDogs);


                                break;

                            case ("3"):

                                exit();

                                default:

                                    incorrectInput();
                        }
                    }

                case ("3"):

                    exit();

                    break;

                default:

                    incorrectInput();
            }
        }
    }
}
