package JavaFundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class TasksJavaFundamentalsAllInOne {

    public static void main(String[] args) throws Exception {

        FindTheMinimum taskFirst = new FindTheMinimum();
        SearchElement taskSecond = new SearchElement();
        SortArray taskThird = new SortArray();
        CountElementsString taskFour = new CountElementsString();
        TowersOfHanoi towers = new TowersOfHanoi();

        Scanner userInput = new Scanner(System.in);

        MainMenu:
        // to return into mainloop

        while (true) {

            System.out.println("\f");

            System.out.println("*********************************************");
            System.out.println("* 1 - FindTheMinimum.                       *");
            System.out.println("* 2 - SearchElement.                        *");
            System.out.println("* 3 - SortArray.                            *");
            System.out.println("* 4 - CountElementsOccurrencesInAString.    *");
            System.out.println("* 5 - Hanoi's Towers.                       *");
            System.out.println("* 6 - Exit.                                 *");
            System.out.println("*********************************************" + "\n");


            int checkUserInputMainPage = userInput.nextInt();

            switch (checkUserInputMainPage) {

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

                        int checkUserInputFirstPage = userInput.nextInt();

                        switch (checkUserInputFirstPage) {

                            case 1:

                                System.out.println();
                                System.out.println("Enter the 2 values : ");
                                a = userInput.nextInt();
                                b = userInput.nextInt();
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
                                a = userInput.nextInt();
                                b = userInput.nextInt();
                                c = userInput.nextInt();
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
                                a = userInput.nextInt();
                                b = userInput.nextInt();
                                c = userInput.nextInt();
                                d = userInput.nextInt();
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

                        int checkUserInputSecondPage = userInput.nextInt();
                        int arraySize;
                        int consoleArraySize;

                        long startTimeOne;
                        long endTimeOne;
                        long startTimeTwo;
                        long endTimeTwo;

                        switch (checkUserInputSecondPage) {

                            case 1:

                                System.out.println();
                                System.out.println("Enter the size of array : ");
                                consoleArraySize = userInput.nextInt();
                                System.out.println();
                                System.out.println("Enter " + consoleArraySize + " values of the array");

                                int userArray[] = new int[consoleArraySize];

                                taskSecond.lengthUserArray = userArray.length;
                                taskSecond.userArr = userArray;

                                for (int i = 0; i < consoleArraySize; i++) {
                                    userArray[i] = userInput.nextInt();
                                }

                                break;

                            case 2:

                                System.out.println();
                                System.out.print("User Array elements: ");
                                System.out.println();

                                for (int i = 0; i < taskSecond.userArr.length; i++) {
                                    System.out.print(" " + taskSecond.userArr[i]);
                                }

                                System.out.println();
                                System.out.println();
                                System.out.println("Press 'ENTER' for continue...");
                                System.in.read();
                                break;

                            case 3:

                                System.out.println();
                                System.out.println(" *****************************************");
                                System.out.println(" * What's element need to find ?         *");
                                System.out.println(" *****************************************");
                                System.out.println();

                                int consoleNumberToSearch = userInput.nextInt();

                                System.out.println();
                                System.out.println(" *****************************************");
                                System.out.println(" * What's method you need to use ?       *");
                                System.out.println(" *****************************************");
                                System.out.println(" * 1 - One by one.                       *");
                                System.out.println(" * 2 - Binary.                           *");
                                System.out.println(" *****************************************");
                                System.out.println();

                                int choiceUserInputTypeOfSearch = userInput.nextInt();

                                switch (choiceUserInputTypeOfSearch) {

                                    case 1:

                                        int countMatch = 0;

                                        arraySize = taskSecond.userArr.length;
                                        startTimeOne = System.nanoTime();

                                        for (int i = 0; i < arraySize; i++) {
                                            if (taskSecond.userArr[i] == consoleNumberToSearch) {
                                                countMatch++;
                                                System.out.println();
                                                System.out.println("The 'Ony by One' search method : ");
                                                System.out.println(consoleNumberToSearch + " Is a " + (i + 1) + " element in array. ");
                                            }
                                        }

                                        if (countMatch == 0) {
                                            System.out.println();
                                            System.out.println("The element is not found in array.");
                                            System.out.println();
                                        }

                                        endTimeOne = System.nanoTime();

                                        long executionTimeOne = endTimeOne - startTimeOne;

                                        System.out.println("The execution time method is : " + executionTimeOne);
                                        System.out.println();
                                        System.out.println("Press 'ENTER' for continue...");
                                        System.in.read();
                                        break;

                                    case 2:

                                        int beginArray = 0;
                                        int endArray = taskSecond.userArr.length - 1;
                                        int middleArray = (endArray + beginArray) / 2;

                                        Arrays.sort(taskSecond.userArr);

                                        System.out.print("User Array elements after sort method : ");

                                        for (int i = 0; i < taskSecond.userArr.length; i++) {
                                            System.out.print(" " + taskSecond.userArr[i]);
                                        }

                                        startTimeTwo = System.nanoTime();

                                        while (taskSecond.userArr[middleArray] != consoleNumberToSearch && beginArray <= endArray) {

                                            if (taskSecond.userArr[middleArray] > consoleNumberToSearch) {
                                                endArray = middleArray - 1;
                                            } else {
                                                beginArray = middleArray + 1;
                                            }
                                            middleArray = (endArray + beginArray) / 2;
                                        }

                                        System.out.println();
                                        System.out.println("The binary search method : ");

                                        if (beginArray <= endArray) {
                                            System.out.println(consoleNumberToSearch + " Is " + ++middleArray + " element in array");

                                        } else {
                                            System.out.println("Element is not found in array");
                                        }

                                        endTimeTwo = System.nanoTime();

                                        long executionTimeTwo = endTimeTwo - startTimeTwo;

                                        System.out.println("The execution time is : " + executionTimeTwo);
                                        System.out.println();
                                        System.out.println("Press 'ENTER' for continue...");
                                        System.in.read();
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

                        int checkUserInputThirdPage = userInput.nextInt();

                        switch (checkUserInputThirdPage) {

                            case 1:

                                System.out.print("Enter the size of array : ");

                                int consoleArraySize = userInput.nextInt();
                                int userArray[] = new int[consoleArraySize];
                                int lengthArray = userArray.length;
                                taskThird.userArr = userArray;

                                System.out.println("Enter the " + lengthArray + " elements of array : ");

                                for (int i = 0; i < consoleArraySize; i++) {
                                    userArray[i] = userInput.nextInt();
                                    System.out.print("");
                                }

                                break;

                            case 2:

                                System.out.println();
                                System.out.print("User Array elements: ");

                                for (int i = 0; i < taskThird.userArr.length; i++) {
                                    System.out.print(" " + taskThird.userArr[i]);
                                }

                                System.out.println();
                                System.out.println("Press 'ENTER' for continue...");
                                System.in.read();
                                break;

                            case 3:

                                System.out.println();
                                System.out.println(" *****************************************");
                                System.out.println(" * What's kind of sort you want to use?  *");
                                System.out.println(" *****************************************");
                                System.out.println(" * 1 - Bubble sort.                      *");
                                System.out.println(" * 2 - Insertion sort.                   *");
                                System.out.println(" *****************************************");
                                System.out.println();

                                int checkUserInputTypeOfSort = userInput.nextInt();

                                switch (checkUserInputTypeOfSort) {

                                    case 1:

                                        int temp = 0;

                                        for (int i = 0; i < taskThird.userArr.length; i++) {
                                            for (int j = 1; j <= (taskThird.userArr.length - 1); j++) {
                                                if (taskThird.userArr[j - 1] > taskThird.userArr[j]) {
                                                    temp = taskThird.userArr[j - 1];
                                                    taskThird.userArr[j - 1] = taskThird.userArr[j];
                                                    taskThird.userArr[j] = temp;
                                                }
                                            }
                                        }
                                        System.out.println();
                                        System.out.println("Completed...");
                                        System.out.println();
                                        System.out.println("Press 'ENTER' for continue...");
                                        System.in.read();
                                        break;

                                    case 2:

                                        for (int i = 1; i < taskThird.userArr.length; i++) {
                                            int tempI = taskThird.userArr[i];
                                            int j = i - 1;
                                            while ((j >= 0) && taskThird.userArr[j] > tempI) {
                                                taskThird.userArr[j + 1] = taskThird.userArr[j];
                                                j--;
                                            }
                                            taskThird.userArr[j + 1] = tempI;
                                        }
                                        System.out.println();
                                        System.out.println("Completed...");
                                        System.out.println();
                                        System.out.println("Press 'ENTER' for continue...");
                                        System.in.read();
                                        break;

                                    default:

                                        System.out.println();
                                        System.out.println("Incorrect input...");
                                        System.out.println();
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

                        String checkUserInputFourthPage = userInput.nextLine();

                        switch (checkUserInputFourthPage) {

                            case ("1"):

                                System.out.println();
                                System.out.println("Enter the String : ");

                                taskFour.myString = userInput.nextLine();
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

                                char myCharInputForFind = userInput.nextLine().charAt(0);

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

                        int checkUserInputFifthPage = userInput.nextInt();

                        switch (checkUserInputFifthPage) {

                            case 1:

                                System.out.println();
                                System.out.println("Enter the number of disks : ");
                                System.out.println();
                                towers.setNumberDisksHanoisTowers(userInput.nextInt());
                                System.out.println();

                                break;

                            case 2:

                                towers.resultOfCalculation = (int) (Math.pow(2, towers.numberDisks) - 1);
                                System.out.println();
                                System.out.print("Steps : ");
                                System.out.println(towers.resultOfCalculation);
                                System.out.println();
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
