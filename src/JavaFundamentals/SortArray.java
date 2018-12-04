package JavaFundamentals;

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

public class SortArray {
    private int[] userArray;
    private int userInput;

    void showMenu() {
        System.out.println("\f");
        System.out.println(" ******************************************");
        System.out.println(" * 1 - Configure array.                   *");
        System.out.println(" * 2 - Output array.                      *");
        System.out.println(" * 3 - Sorting the array.                 *");
        System.out.println(" * 4 - Exit.                              *");
        System.out.println(" ******************************************" + "\n");
    }

    void showSecondaryMenu() {
        System.out.println(" *****************************************");
        System.out.println(" * What's kind of sort you want to use?  *");
        System.out.println(" *****************************************");
        System.out.println(" * 1 - Bubble sort.                      *");
        System.out.println(" * 2 - Insertion sort.                   *");
        System.out.println(" *****************************************" + "\n");
    }

    public static void main(String[] args) throws Exception {

        SortArray sortArray = new SortArray();
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;

        while (condition) {
            try {
                sortArray.showMenu();

                sortArray.setUserInput(scanner);

                switch (sortArray.getUserInput()) {

                    case 1:

                        System.out.print("Enter the size of array : ");
                        sortArray.setArrayLength(scanner);
                        System.out.println("Enter the " + sortArray.getUserArray().length + " elements of array : ");
                        sortArray.setArgumentsArray(scanner);
                        System.out.println("Array is upload :");
                        break;

                    case 2:

                        System.out.println("User Array elements: ");
                        sortArray.getArgumentsArray();
                        System.out.println("\n" + "Press 'ENTER' for continue...");
                        System.in.read();
                        break;

                    case 3:

                        sortArray.showSecondaryMenu();


                        sortArray.setUserInput(scanner);

                        switch (sortArray.getUserInput()) {

                            case 1:

                                sortArray.sortBubbleSort(sortArray.getUserArray());
                                System.out.println("\n" + "Completed..." + "\n");
                                System.out.println("Press 'ENTER' for continue...");
                                System.in.read();
                                break;

                            case 2:

                                sortArray.sortInsertionSort(sortArray.getUserArray());
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
                System.out.println("Incorrect input...Exiting...");
                condition = false;
                System.gc();
            }
        }
    }

    private int getUserInput() {
        return this.userInput;
    }

    private void setUserInput(Scanner scanner) {
        this.userInput = scanner.nextInt();
    }

    protected int[] sortBubbleSort(int[] ints) {
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

    protected int[] sortInsertionSort(int[] ints) {
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

    protected int[] getUserArray() {
        return this.userArray;
    }

    protected void setArrayLength(Scanner scanner) {
        this.userArray = new int[scanner.nextInt()];
    }

    protected void getArgumentsArray() {
        System.out.println();
        for (int i : this.userArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    protected void setArgumentsArray(Scanner scanner) {
        for (int i = 0; i < this.userArray.length; i++) {
            this.userArray[i] = scanner.nextInt();
        }
    }

    private void setArgumentOfArray(int index, int value) {
        this.userArray[index] = value;
    }

    private int getArgumentOfArray(int index) {
        return this.userArray[index];
    }
}
