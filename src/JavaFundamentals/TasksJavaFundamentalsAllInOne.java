package JavaFundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class TasksJavaFundamentalsAllInOne {

    void showMainMenu() {
        System.out.println("\f");
        System.out.println("*********************************************");
        System.out.println("* 1 - FindTheMinimum.                       *");
        System.out.println("* 2 - SearchElement.                        *");
        System.out.println("* 3 - SortArray.                            *");
        System.out.println("* 4 - CountElementsOccurrencesInAString.    *");
        System.out.println("* 5 - Hanoi's Towers.                       *");
        System.out.println("* 6 - Exit.                                 *");
        System.out.println("*********************************************" + "\n");
    }

    public static void main(String[] args) throws Exception {

        FindTheMinimum taskFirst = new FindTheMinimum();
        SearchElement taskSecond = new SearchElement();
        SortArray taskThird = new SortArray();
        CountElementsString taskFour = new CountElementsString();
        TowersOfHanoi towers = new TowersOfHanoi();
        TasksJavaFundamentalsAllInOne allInOne = new TasksJavaFundamentalsAllInOne();

        Scanner scanner = new Scanner(System.in);

        MainMenu:
        // to return into mainloop

        while (true) {

            allInOne.showMainMenu();


            int checkscannerMainPage = scanner.nextInt();

            switch (checkscannerMainPage) {

                case 1:

                    while (true) {

                        System.out.println("\f");

                        System.out.println();
                        System.out.println("*******************************************");
                        System.out.println("* 1 - To find the lower of two values.    *");
                        System.out.println("* 2 - To find the lower of three values.  *");
                        System.out.println("* 3 - To find the lower of four values.   *");
                        System.out.println("* 4 - Back to main.                       *");
                        System.out.println("* 5 - Exit.                               *");
                        System.out.println("*******************************************");
                        System.out.println();

                        int a, b, c, d;

                        int checkscannerFirstPage = scanner.nextInt();

                        switch (checkscannerFirstPage) {

                            case 1:

                                System.out.println();
                                System.out.println("Enter the 2 values : ");
                                a = scanner.nextInt();
                                b = scanner.nextInt();
                                System.out.println();
                                System.out.print("The lower is : ");
                                System.out.println(taskFirst.minimumReturner(a, b));
                                System.out.println();
                                System.out.println("Press 'ENTER' for continue...");
                                System.in.read();
                                break;

                            case 2:

                                System.out.println();
                                System.out.println("Enter the 3 values : ");
                                a = scanner.nextInt();
                                b = scanner.nextInt();
                                c = scanner.nextInt();
                                System.out.println();
                                System.out.print("The lower is : ");
                                System.out.println(taskFirst.minimumReturner(a, b, c));
                                System.out.println();
                                System.out.println("Press 'ENTER' for continue...");
                                System.in.read();
                                break;

                            case 3:

                                System.out.println();
                                System.out.println("Enter the 4 values : ");
                                a = scanner.nextInt();
                                b = scanner.nextInt();
                                c = scanner.nextInt();
                                d = scanner.nextInt();
                                System.out.println();
                                System.out.print("The lower is : ");
                                System.out.println(taskFirst.minimumReturner(a, b, c, d));
                                System.out.println();
                                System.out.println("Press 'ENTER' for continue...");
                                System.in.read();
                                break;

                            case 4:

                                continue MainMenu;

                            case 5:

                                System.out.println();
                                System.out.println("Exiting...");
                                System.exit(0);

                            default:

                                System.out.println("Incorrect values...");
                                System.out.println();
                                System.out.println("Press 'ENTER' for continue...");
                                System.in.read();
                                break;
                        }
                    }

                case 2:

                    while (true) {

                        System.out.println("\f");

                        System.out.println();
                        System.out.println("******************************************");
                        System.out.println("* 1 - Configure array.                   *");
                        System.out.println("* 2 - Output array.                      *");
                        System.out.println("* 3 - Change element for search.         *");
                        System.out.println("* 4 - Back to main.                      *");
                        System.out.println("* 5 - Exit.                              *");
                        System.out.println("******************************************");
                        System.out.println();

                        int checkscannerSecondPage = scanner.nextInt();
                        int arraySize;
                        int consoleArraySize;

                        long startTimeOne;
                        long endTimeOne;
                        long startTimeTwo;
                        long endTimeTwo;

                        switch (checkscannerSecondPage) {

                            case 1:

                                System.out.print("Enter the size of array : ");
                                taskThird.setArrayLength(scanner);
                                System.out.println("Enter the " + taskThird.getUserArray().length + " elements of array : ");
                                taskThird.setArgumentsArray(scanner);
                                break;

                            case 2:

                                System.out.println("User Array elements: ");
                                taskThird.getArgumentsArray();
                                System.out.println("\n" + "Press 'ENTER' for continue...");
                                System.in.read();
                                break;

                            case 3:

                                taskSecond.showTypeSearchMenu();

                                int choiceUserInputTypeOfSearch = scanner.nextInt();

                                switch (choiceUserInputTypeOfSearch) {

                                    case 1:

                                        taskSecond.showElementSearchMenu();
                                        taskSecond.setUserInput(scanner);
                                        int elementOne = taskSecond.oneByOneSearch(taskSecond.getUserInput());
                                        System.out.println("\n" + "Your number is " + elementOne + " element of array.");
                                        break;

                                    case 2:

                                        taskSecond.showElementSearchMenu();
                                        taskSecond.setUserInput(scanner);
                                        taskSecond.sortBubbleSort(taskSecond.getUserArray());
                                        int elementTwo = taskSecond.binarySearch(taskSecond.getUserInput());
                                        System.out.println("\n" + "Your number is " + elementTwo + " element of array.");
                                        break;

                                    default:

                                        System.out.println("Incorrect value...");
                                        System.out.println();
                                        System.out.println("Press 'ENTER' for continue...");
                                        System.in.read();
                                        break;
                                }
                                break;

                            case 4:

                                continue MainMenu;

                            case 5:

                                System.out.println("Exiting...");
                                System.exit(0);
                                break;

                            default:

                                System.out.println("Incorrect value...");
                                System.out.println();
                                System.out.println("Press 'ENTER' for continue...");
                                System.in.read();
                                break;
                        }
                    }

                case 3:

                    while (true) {

                        System.out.println("\f");

                        System.out.println();
                        System.out.println(" ******************************************");
                        System.out.println(" * 1 - Configure array.                   *");
                        System.out.println(" * 2 - Output array.                      *");
                        System.out.println(" * 3 - Sorting the array.                 *");
                        System.out.println(" * 4 - Back to main.                       *");
                        System.out.println(" * 5 - Exit.                              *");
                        System.out.println(" ******************************************");
                        System.out.println();

                        int checkscannerThirdPage = scanner.nextInt();

                        switch (checkscannerThirdPage) {

                            case 1:
                                System.out.print("Enter the size of array : ");
                                taskThird.setArrayLength(scanner);
                                System.out.println("Enter the " + taskThird.getUserArray().length + " elements of array : ");
                                taskThird.setArgumentsArray(scanner);
                                System.out.println("Array is upload :");
                                break;

                            case 2:

                                System.out.println("User Array elements: ");
                                taskThird.getArgumentsArray();
                                System.out.println("\n" + "Press 'ENTER' for continue...");
                                System.in.read();
                                break;

                            case 3:

                                taskThird.showSecondaryMenu();

                                int checkscannerTypeOfSort = scanner.nextInt();

                                switch (checkscannerTypeOfSort) {

                                    case 1:

                                        taskThird.sortBubbleSort(taskThird.getUserArray());
                                        System.out.println("\n" + "Completed..." + "\n");
                                        System.out.println("Press 'ENTER' for continue...");
                                        System.in.read();
                                        break;

                                    case 2:

                                        taskThird.sortInsertionSort(taskThird.getUserArray());
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

                                continue MainMenu;

                            case 5:

                                System.out.println();
                                System.out.println("Exiting ...");
                                System.exit(0);
                                break;

                            default:

                                System.out.println();
                                System.out.println("Incorrect input...");
                                System.out.println();
                                System.out.println("Press 'ENTER' for continue...");
                                System.in.read();
                                break;
                        }
                    }

                case 4:

                    while (true) {

                        System.out.println("\f");

                        System.out.println();
                        System.out.println("*******************************************");
                        System.out.println("* 1 - To create a String.                 *");
                        System.out.println("* 2 - To show the String as array.        *");
                        System.out.println("* 3 - To find the matches.                *");
                        System.out.println("* 4 - Back to main.                       *");
                        System.out.println("* 5 - Exit.                               *");
                        System.out.println("*******************************************");
                        System.out.println();

                        String checkscannerFourthPage = scanner.nextLine();

                        switch (checkscannerFourthPage) {

                            case ("1"):

                                System.out.println();
                                System.out.println("Enter the String : ");

                                taskFour.myString = scanner.nextLine();
                                taskFour.myChar = taskFour.myString;
                                break;

                            case ("2"):

                                char holeChar = ' ';

                                System.out.println();

                                for (int i = 0; i < taskFour.myString.length(); i++) {
                                    if (taskFour.myChar.charAt(i) == holeChar) {
                                        System.out.print(holeChar);
                                    }
                                    System.out.print(" " + "{" + taskFour.myChar.charAt(i) + "}");
                                }

                                taskFour.myCharArray = ((String) taskFour.myChar).toCharArray();

                                System.out.println();
                                System.out.println();
                                System.out.println("Press 'ENTER' for continue...");
                                System.in.read();
                                break;

                            case ("3"):

                                int countMatch = 0;

                                System.out.println();
                                System.out.println("What's char you'll be find?");
                                System.out.println();

                                char myCharInputForFind = scanner.nextLine().charAt(0);

                                System.out.println();

                                for (int i = 0; i < taskFour.myCharArray.length; i++) {
                                    if (taskFour.myCharArray[i] == myCharInputForFind) {
                                        countMatch++;
                                    }
                                }

                                System.out.println();
                                System.out.println("We identify " + countMatch + " matches");
                                System.out.println();
                                System.out.println("Press 'ENTER' for continue...");
                                System.in.read();
                                break;

                            case ("4"):

                                continue MainMenu;

                            case ("5"):

                                System.out.println();
                                System.out.println("Exiting...");
                                System.exit(0);

                            /*default:

                                ???

                                System.out.println();
                                System.out.println("Incorrect input...");
                                System.out.println();
                                System.out.println("Press 'ENTER' for continue...");
                                System.in.read();
                                break;*/
                        }
                    }

                case 5:

                    while (true) {

                        System.out.println("\f");

                        System.out.println();
                        System.out.println("*********************************************************");
                        System.out.println("* 1 - To set a number of disks.                         *");
                        System.out.println("* 2 - To show the result of the calculation.            *");
                        System.out.println("* 3 - To demonstrate the calculations from A to C.      *");
                        System.out.println("* 4 - Back to main.                                     *");
                        System.out.println("* 5 - Exit.                                             *");
                        System.out.println("*********************************************************");
                        System.out.println();

                        int checkscannerFifthPage = scanner.nextInt();

                        switch (checkscannerFifthPage) {

                            case 1:

                                System.out.println();
                                System.out.println("Enter the number of disks : ");
                                System.out.println();
                                towers.setNumberDisks(scanner.nextInt());
                                System.out.println();

                                break;

                            case 2:

                                System.out.print("Steps : ");
                                towers.resultOfCalculation();
                                System.out.println("Press 'ENTER' for continue...");
                                System.in.read();

                                break;

                            case 3:

                                System.out.println();
                                towers.calculationMoves(towers);
                                System.out.println();
                                System.out.println("Press 'ENTER' for continue...");
                                System.in.read();

                                break;

                            case 4:

                                continue MainMenu;

                            case 5:

                                System.out.println();
                                System.out.println("Exiting...");
                                System.exit(0);

                                break;

                            default:

                                System.out.println();
                                System.out.println("Incorrect input...");
                                System.out.println();
                                System.out.println("Press 'ENTER' for continue...");
                                System.in.read();
                                break;
                        }
                    }

                case 6:

                    System.out.println();
                    System.out.println("Exiting...");
                    System.exit(0);

                default:

                    System.out.println();
                    System.out.println("Incorrect input...");
                    System.out.println();
                    System.out.println("Press 'ENTER' for continue...");
                    System.in.read();
                    break;
            }
        }
    }
}
