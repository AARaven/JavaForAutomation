package JavaFundamentals;

import java.util.Scanner;

public class TasksJavaFundamentalsAllInOne {

    private void showMainMenu() {
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
            allInOne.setUserInput(scanner);

            switch (allInOne.getUserInput()) {

                case 1:

                    while (true) {

                        taskFirst.showMenu();
                        taskFirst.setUserInput(scanner);

                        switch (taskFirst.getUserInput()) {

                            case 1:

                                System.out.println("Please enter the two values for find minor.");

                                taskFirst.setUserInput(scanner);
                                taskFirst.setFirst(taskFirst.getUserInput());
                                taskFirst.setUserInput(scanner);
                                taskFirst.setSecond(taskFirst.getUserInput());

                                System.out.println("\n" + "The minimum value is : " + taskFirst.minimumReturner
                                        (taskFirst.getFirst(), taskFirst.getSecond()));

                                System.out.println("please press 'ENTER' to continue.");
                                System.in.read();
                                break;

                            case 2:
                                System.out.println("Please enter the three values for find minor.");

                                taskFirst.setUserInput(scanner);
                                taskFirst.setFirst(taskFirst.getUserInput());
                                taskFirst.setUserInput(scanner);
                                taskFirst.setSecond(taskFirst.getUserInput());
                                taskFirst.setUserInput(scanner);
                                taskFirst.setThird(taskFirst.getUserInput());

                                System.out.println("\n" + "The minimum value is : " + taskFirst.minimumReturner
                                        (taskFirst.getFirst(), taskFirst.getSecond(), taskFirst.getThird()));

                                System.out.println("please press 'ENTER' to continue.");
                                System.in.read();
                                break;

                            case 3:

                                System.out.println("Please enter the four values for find minor.");

                                taskFirst.setUserInput(scanner);
                                taskFirst.setFirst(taskFirst.getUserInput());
                                taskFirst.setUserInput(scanner);
                                taskFirst.setSecond(taskFirst.getUserInput());
                                taskFirst.setUserInput(scanner);
                                taskFirst.setThird(taskFirst.getUserInput());
                                taskFirst.setUserInput(scanner);
                                taskFirst.setFourth(taskFirst.getUserInput());

                                System.out.println("\n" + "The minimum value is : " + taskFirst.minimumReturner
                                        (taskFirst.getFirst(), taskFirst.getSecond(), taskFirst.getThird(), taskFirst.getFourth()));

                                System.out.println("please press 'ENTER' to continue.");
                                System.in.read();
                                break;

                            case 4:

                                continue MainMenu;

                            case 5:

                                System.out.println();
                                System.out.println("Exiting...");
                                System.exit(0);

                            default:

                                System.out.println("Incorrect input...");
                                System.out.println("please press 'ENTER' to continue.");
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

                        int checkScanner = scanner.nextInt();

                        switch (checkScanner) {

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
                                        System.out.println("\n" + "Your number is " +
                                                elementOne + " element of array.");
                                        break;

                                    case 2:

                                        taskSecond.showElementSearchMenu();
                                        taskSecond.setUserInput(scanner);
                                        taskSecond.sortBubbleSort(taskSecond.getUserArray());
                                        int elementTwo = taskSecond.binarySearch(taskSecond.getUserInput());
                                        System.out.println("\n" + "Your number is " +
                                                elementTwo + " element of array.");
                                        break;

                                    default:

                                        System.out.println("Incorrect value..." + "\n");
                                        System.out.println("Press 'ENTER' for continue..." + "\n");
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
                        System.out.println(" ******************************************");
                        System.out.println(" * 1 - Configure array.                   *");
                        System.out.println(" * 2 - Output array.                      *");
                        System.out.println(" * 3 - Sorting the array.                 *");
                        System.out.println(" * 4 - Back to main.                       *");
                        System.out.println(" * 5 - Exit.                              *");
                        System.out.println(" ******************************************" + "\n");

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

                        taskFour.showMenu();
                        taskFour.setUserInput(scanner.nextLine());

                        switch (taskFour.getUserInput()) {

                            case ("1"):

                                System.out.println("Enter the String");
                                System.out.println();
                                taskFour.setUserString(scanner.nextLine());
                                taskFour.setMyCharArray(taskFour.getUserString().toCharArray());
                                break;

                            case ("2"):

                                taskFour.getChars(taskFour.getMyCharArray());
                                System.out.println("\n" + "Press 'ENTER' for continue...");
                                System.in.read();
                                break;

                            case ("3"):

                                System.out.println("\n" + "What's char you'll be find?" + "\n");
                                taskFour.setMyChar(scanner.nextLine().charAt(0));

                                int countMatch = 0;
                                for (char c : taskFour.getMyCharArray())
                                    if (c == taskFour.getMyChar()) countMatch++;

                                System.out.println("\n" + "We identify " + countMatch + " matches" + "\n");
                                System.out.println("Press 'ENTER' for continue..." + "\n");
                                System.in.read();
                                break;

                            case ("4"):

                                continue MainMenu;

                            case ("5"):

                                System.out.println("\n" + "Exiting...");
                                System.exit(0);
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

    private int userInput;

    private void setUserInput(Scanner scanner) {
        this.userInput = scanner.nextInt();
    }

    private int getUserInput() {
        return this.userInput;
    }
}
