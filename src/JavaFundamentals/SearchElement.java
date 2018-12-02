package JavaFundamentals;

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
public class SearchElement {
    private int[] userArray;
    private int userInput;

    protected void setUserInput(Scanner scanner) {
        this.userInput = scanner.nextInt();
    }

    protected int getUserInput() {
        return this.userInput;
    }

    protected int oneByOneSearch(int temp) {
        for (int i = 0; i < this.userArray.length; i++) {
            if (this.userArray[i] == temp) {
                return i + 1;
            }
        }
        return 0;
    }

    protected int binarySearch(int temp) {
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

    protected int[] getUserArray() {
        return this.userArray;
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

    protected void showElementSearchMenu() {
        System.out.println("\n" + " *****************************************");
        System.out.println(" * What's element need to find ?         *");
        System.out.println(" *****************************************" + "\n");
    }

    protected void showTypeSearchMenu() {
        System.out.println("\n" + " *****************************************");
        System.out.println(" * What's method you need to use ?       *");
        System.out.println(" *****************************************");
        System.out.println(" * 1 - One by one.                       *");
        System.out.println(" * 2 - Binary.                           *");
        System.out.println(" *****************************************" + "\n");
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        SearchElement search = new SearchElement();
        boolean condition = true;

        while (condition) {

            try {
                search.showMenu();
                search.setUserInput(scanner);

                switch (search.getUserInput()) {

                    case 1:

                        System.out.print("Enter the size of array : ");
                        search.setArrayLength(scanner);
                        System.out.println("Enter the " + search.getUserArray().length + " elements of array : ");
                        search.setArgumentsArray(scanner);
                        break;

                    case 2:

                        System.out.println("User Array elements: ");
                        search.getArgumentsArray();
                        System.out.println("\n" + "Press 'ENTER' for continue...");
                        System.in.read();
                        break;

                    case 3:

                        search.showTypeSearchMenu();
                        search.setUserInput(scanner);

                        switch (search.getUserInput()) {

                            case 1:

                                search.showElementSearchMenu();
                                search.setUserInput(scanner);
                                int elementOne = search.oneByOneSearch(search.getUserInput());
                                System.out.println("\n" + "Your number is " + elementOne + " element of array.");
                                break;

                            case 2:

                                search.showElementSearchMenu();
                                search.setUserInput(scanner);
                                search.sortBubbleSort(search.getUserArray());
                                int elementTwo = search.binarySearch(search.getUserInput());
                                System.out.println("\n" + "Your number is " + elementTwo + " element of array.");
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

    private void showMenu() {
        System.out.println("\f");
        System.out.println("******************************************");
        System.out.println("* 1 - Configure array.                   *");
        System.out.println("* 2 - Output array.                      *");
        System.out.println("* 3 - Change type for search.            *");
        System.out.println("* 4 - Exit.                              *");
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

    private void setArgumentOfArray(int index, int value) {
        this.userArray[index] = value;
    }

    private int getArgumentOfArray(int index) {
        return this.userArray[index];
    }
}
