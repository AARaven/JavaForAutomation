package JavaFundamentals;

import java.util.Arrays;
import java.util.Scanner;

/*---------------------------------------------------  
 Java Fundamentals Practice #2 : Search for an element in the array 
 Implement a program that takes 2 integer numbers from the console:                    
---------------------------------------------------------------------------------------------------
--> Array size;
--> A number to search in the array.
#####################################
    Generate a random array of integers of provided size and print it. Verify if the provided
    element is present in the array. If it does print true otherwise print false.
    
    Use several algorithms. For example:
    --> Regular search one by one;
    --> Binary search.
    
    Compare execution time for each algorithm.
--------------------------------------------------------------------------------------------------*/

public class SearchElement {

     static int userArr[];
     static int lengthUserArray;

    public static void main(String[] args) throws Exception {

        long startTimeOne;
        long endTimeOne;
        long startTimeTwo;
        long endTimeTwo;

        Scanner scanInput = new Scanner(System.in);

        while (true) {

            System.out.println("******************************************");
            System.out.println("* 1 - Configure array.                   *");
            System.out.println("* 2 - Output array.                      *");
            System.out.println("* 3 - Change element for search.         *");
            System.out.println("* 4 - Exit.                              *");
            System.out.println("******************************************");
            System.out.println();

            int checkUserInput = scanInput.nextInt();
            int arraySize;
            int consoleArraySize;

            switch (checkUserInput)  {

                case 1:

                    System.out.print("Enter the size of array : ");
                    consoleArraySize = scanInput.nextInt();
                    System.out.println("Enter " + consoleArraySize + " values of the array");

                    int userArray[] = new int[consoleArraySize];
                    lengthUserArray = userArray.length;
                    userArr = userArray;

                        for (int i = 0; i < consoleArraySize; i++) {
                            userArray[i] = scanInput.nextInt();
                            System.out.print("");
                        }
                    break;

                case 2:

                    System.out.print("User Array elements: ");

                        for (int i = 0; i < userArr.length; i++) {
                            System.out.print(" " + userArr[i]);
                        }

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

                    int consoleNumberToSearch = scanInput.nextInt();

                    System.out.println();
                    System.out.println(" *****************************************");
                    System.out.println(" * What's method you need to use ?       *");
                    System.out.println(" *****************************************");
                    System.out.println(" * 1 - One by one.                       *");
                    System.out.println(" * 2 - Binary.                           *");
                    System.out.println(" *****************************************");
                    System.out.println();

                    int choiceUserSearch = scanInput.nextInt();

                        switch (choiceUserSearch) {

                            case 1:

                                int countMatch = 0;
                                arraySize = userArr.length;
                                startTimeOne = System.nanoTime();

                                    for (int i = 0; i < arraySize; i++) {
                                        if (userArr[i] == consoleNumberToSearch) {
                                            countMatch++;
                                            System.out.println();
                                            System.out.println("The 'Ony by One' search method : ");
                                            System.out.println(consoleNumberToSearch + " Is a " + (i + 1) + " element in array. ");
                                        }
                                    }

                                    if (countMatch == 0) {
                                        System.out.println();
                                        System.out.println("The element is not found in array.");
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
                                int endArray = userArr.length - 1;
                                int middleArray = (endArray + beginArray) / 2;

                                Arrays.sort(userArr);

                                System.out.print("User Array elements after sort method : ");

                                    for (int i = 0; i < userArr.length; i++) {
                                        System.out.print(" " + userArr[i]);
                                    }

                                System.out.println();
                                startTimeTwo = System.nanoTime();

                                    while (userArr[middleArray] != consoleNumberToSearch && beginArray <= endArray) {

                                        if (userArr[middleArray] > consoleNumberToSearch) {
                                            endArray = middleArray - 1;
                                        } else {
                                            beginArray = middleArray + 1;
                                        }
                                        middleArray = (endArray + beginArray) / 2;
                                    }

                                System.out.println();
                                System.out.println("The binary search method : ");
                                System.out.println();

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
                                break;
                        }
                        break;

                case 4:

                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:

                    System.out.println("Incorrect value...");
                    break;
            }
        }
    }
}
