package JavaFundamentals;

import java.io.IOException;
import java.util.Scanner;

/**
 * <p>Java Fundamentals Practice #2 : SearchElement for an element in the array.</p>
 * <p>Implement a program that takes 2 integer numbers from the console:</p>
 * <p>------------------------------------------------------------------</p>
 * <p>--> Array size;</p>
 * <p>--> A number to search in the array.</p>
 * <p>------------------------------------------------------------------</p>
 * <p>Generate a random array of integers of provided size and print it.</p>
 * <p>Verify if the provided  element is present in the array.</p>
 * <p>If it does print true otherwise print false.</p>
 * <p>Use several algorithms. For example:</p>
 * <p>--> Regular search one by one;</p>
 * <p>--> Binary search.</p>
 * <p>Compare execution time for each algorithm.</p>
 * <p>-------------------------------------------------------------------</p>
 */
class SearchElement {
    private int[] userArray;
    private int userInput;

    boolean start() {
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;

        while (condition) {

            try {
                showMenu();
                setUserInput(scanner);

                switch (getUserInput()) {

                    case 1:

                        System.out.print("Enter the size of array : ");
                        setArrayLength(scanner);
                        System.out.println("Enter the " + getUserArray().length + " elements of array : ");
                        setArgumentsArray(scanner);
                        break;

                    case 2:

                        System.out.println("User Array elements: ");
                        getArgumentsArray();
                        System.out.println("\n" + "Press 'ENTER' for continue...");
                        System.in.read();
                        break;

                    case 3:

                        showTypeSearchMenu();
                        setUserInput(scanner);

                        switch (getUserInput()) {

                            case 1:

                                showElementSearchMenu();
                                setUserInput(scanner);
                                int elementOne = oneByOneSearch(getUserInput());
                                System.out.println("\n" + "Your number is " + elementOne + " element of array.");
                                break;

                            case 2:

                                showElementSearchMenu();
                                setUserInput(scanner);
                                sortBubbleSort(getUserArray());
                                int elementTwo = binarySearch(getUserInput());
                                System.out.println("\n" + "Your number is " + elementTwo + " element of array.");
                                break;

                        }
                        break;

                    case 4:

                        return false;

                    case 5:

                        System.out.println("Exiting ...");
                        System.exit(0);
                        break;

                    default:

                        System.out.println("Incorrect input..." + "\n");
                        System.out.println("Press 'ENTER' for continue...");
                        System.in.read();
                        break;
                }
            } catch (Exception e) {
                System.out.println("Incorrect input...");
                System.out.println("Press 'ENTER' for continue...");
                try {
                    System.in.read();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                condition = false;
                System.gc();
            }
        }
        return true;
    }

    private void setUserInput(Scanner scanner) {
        this.userInput = scanner.nextInt();
    }

    private int getUserInput() {
        return this.userInput;
    }

    private int oneByOneSearch(int temp) {
        for (int i = 0; i < this.userArray.length; i++) {
            if (this.userArray[i] == temp) {
                return i + 1;
            }
        }
        return 0;
    }

    private int binarySearch(int temp) {
        int beginArray = 0;
        int endArray = this.userArray.length - 1;
        int middleArray = (endArray + beginArray) / 2;

        while (this.userArray[middleArray] != temp && beginArray <= endArray) {

            if (this.userArray[middleArray] > temp) {
                endArray = middleArray - 1;
            } else {
                beginArray = middleArray + 1;
            }
            middleArray = (endArray + beginArray) / 2;
        }
        return middleArray + 1;
    }

    private int[] getUserArray() {
        return this.userArray;
    }

    private int[] sortBubbleSort(int[] ints) {
        int temp;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 1; j <= (ints.length - 1); j++) {
                if (ints[j - 1] > ints[j]) {
                    temp = ints[j - 1];
                    ints[j - 1] = ints[j];
                    ints[j] = temp;
                }
            }
        }
        return ints;
    }

    private void showElementSearchMenu() {
        System.out.println("\n" + " *****************************************");
        System.out.println(" * What's element need to find ?         *");
        System.out.println(" *****************************************" + "\n");
    }

    private void showTypeSearchMenu() {
        System.out.println("\n" + " *****************************************");
        System.out.println(" * What's method you need to use ?       *");
        System.out.println(" *****************************************");
        System.out.println(" * 1 - One by one.                       *");
        System.out.println(" * 2 - Binary.                           *");
        System.out.println(" *****************************************" + "\n");
    }

    private void showMenu() {
        System.out.println("\f");
        System.out.println("******************************************");
        System.out.println("* 1 - Configure array.                   *");
        System.out.println("* 2 - Output array.                      *");
        System.out.println("* 3 - Change type for search.            *");
        System.out.println("* 4 - Main menu.                         *");
        System.out.println("* 5 - Exit.                              *");
        System.out.println("******************************************" + "\n");
    }

    private void setArrayLength(Scanner scanner) {
        this.userArray = new int[scanner.nextInt()];
    }

    private void getArgumentsArray() {
        System.out.println();
        for (int i : this.userArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private void setArgumentsArray(Scanner scanner) {
        for (int i = 0; i < this.userArray.length; i++) {
            this.userArray[i] = scanner.nextInt();
        }
    }
}
