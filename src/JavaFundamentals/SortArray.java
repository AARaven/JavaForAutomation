package JavaFundamentals;

import java.io.IOException;
import java.util.Scanner;

/**
 * -------------------------------------------------------------------------------------
 * <p>Java Fundamentals Practice #3 : Sort array </p>
 * <p>Sort random array ( number of arguments should be taken from in the console)
 * of integer numbers using at least 2 of the following sort algorithms:</p>
 * <p>
 * --------------------------------------------------------------------------------------
 * <p>--> Bubble sort;</p>
 * <p>--> Optimized bubble sort;</p>
 * <p>--> insertion sort;</p>
 * <p>--> Selection sort.</p>
 * <p>
 * --------------------------------------------------------------------------------------
 */

class SortArray {
    private int[] userArray;
    private int userInput;

    private void showMenu() {
        System.out.println("\f");
        System.out.println(" ******************************************");
        System.out.println(" * 1 - Configure array.                   *");
        System.out.println(" * 2 - Output array.                      *");
        System.out.println(" * 3 - Sorting the array.                 *");
        System.out.println(" * 4 - Main menu.                         *");
        System.out.println(" * 5 - Exit.                              *");
        System.out.println(" ******************************************" + "\n");
    }

    private void showSecondaryMenu() {
        System.out.println(" *****************************************");
        System.out.println(" * What's kind of sort you want to use?  *");
        System.out.println(" *****************************************");
        System.out.println(" * 1 - Bubble sort.                      *");
        System.out.println(" * 2 - Insertion sort.                   *");
        System.out.println(" *****************************************" + "\n");
    }

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
                        System.out.println("Array is upload :");
                        break;

                    case 2:

                        System.out.println("User Array elements: ");
                        getArgumentsArray();
                        System.out.println("\n" + "Press 'ENTER' for continue...");
                        System.in.read();
                        break;

                    case 3:

                        showSecondaryMenu();


                        setUserInput(scanner);

                        switch (getUserInput()) {

                            case 1:

                                sortBubbleSort(getUserArray());
                                System.out.println("\n" + "Completed..." + "\n");
                                System.out.println("Press 'ENTER' for continue...");
                                System.in.read();
                                break;

                            case 2:

                                sortInsertionSort(getUserArray());
                                System.out.println("\n" + "Completed..." + "\n");
                                System.out.println("Press 'ENTER' for continue...");
                                System.in.read();
                                break;

                            default:

                                System.out.println("Incorrect input..." + "\n");
                                System.out.println("Press 'ENTER' for continue...");
                                System.in.read();
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

    private int getUserInput() {
        return this.userInput;
    }

    private void setUserInput(Scanner scanner) {
        this.userInput = scanner.nextInt();
    }

    int[] sortBubbleSort(int[] ints) {
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

    private int[] sortInsertionSort(int[] ints) {
        for (int i = 1; i < ints.length; i++) {
            int temp = ints[i];
            int j = i - 1;
            while ((j >= 0) && ints[j] > temp) {
                ints[j + 1] = ints[j];
                j--;
            }
            ints[j + 1] = temp;
        }
        return ints;
    }

    private int[] getUserArray() {
        return this.userArray;
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
