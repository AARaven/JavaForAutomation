package JavaFundamentals;

import java.util.Scanner;

/*---------------------------------------------------  
    Java Fundamentals Practice #3 : Sort array 
    Sort random array ( number of arguments should be taken from in the console) of integer 
    numbers using at least 2 of the following sort algorithms:
---------------------------------------------------------------------------------------------------
--> Bubble sort;
--> Optimized bubble sort;
--> insertion sort;
--> Selection sort.
--------------------------------------------------------------------------------------------------*/

public class SortArray {

     static int userArr[];
     static int lengthUserArray;

    public static void main(String[] args) throws Exception {

        Scanner consoleInput = new Scanner(System.in);

        while (true) {

            System.out.println(" ******************************************");
            System.out.println(" * 1 - Configure array.                   *");
            System.out.println(" * 2 - Output array.                      *");
            System.out.println(" * 3 - Sorting the array.                 *");
            System.out.println(" * 4 - Exit.                              *");
            System.out.println(" ******************************************");
            System.out.println(" ");

            int checkUserInput = consoleInput.nextInt();

            switch (checkUserInput) {

                case 1:

                    System.out.print("Enter the size of array : ");
                    int consoleArraySize = consoleInput.nextInt();
                    int userArray[] = new int[consoleArraySize];
                    int lengthArray = userArray.length;
                    userArr = userArray;
                    lengthUserArray = userArr.length;

                    System.out.println("Enter the " +lengthArray +" elements of array : ");

                        for (int i = 0; i < consoleArraySize; i++) {
                            userArray[i] = consoleInput.nextInt();
                            System.out.print("");
                        }

                    break;

                case 2:

                    System.out.print ("User Array elements: ");

                        for (int i = 0; i < lengthUserArray; i++) {
                            System.out.print(" " +userArr[i]);
                        }
                    System.out.println();
                    System.out.println("Press 'ENTER' for continue...");
                    System.in.read();
                    break;

                case 3:

                    System.out.println(" *****************************************");
                    System.out.println(" * What's kind of sort you want to use?  *");
                    System.out.println(" *****************************************");
                    System.out.println(" * 1 - Bubble sort.                      *");
                    System.out.println(" * 2 - Insertion sort.                   *");
                    System.out.println(" *****************************************");
                    System.out.println(" ");

                    int choiceUsrInput = consoleInput.nextInt();

                    switch (choiceUsrInput) {

                        case 1:

                            int temp = 0;

                                for (int i = 0; i < lengthUserArray; i++) {
                                    for (int j = 1; j <= (lengthUserArray - 1); j++) {
                                        if (userArr[j - 1] > userArr[j]) {
                                            temp = userArr[j - 1];
                                            userArr[j - 1] = userArr[j];
                                            userArr[j] = temp;
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

                                for (int i = 1; i < lengthUserArray; i++) {
                                    int tempI = userArr[i];
                                    int j = i - 1;

                                    while ((j >= 0) && userArr[j] > tempI) {
                                        userArr[j + 1] = userArr[j];
                                        j--;
                                    }
                                    userArr[j + 1] = tempI;
                                }

                            System.out.println();
                            System.out.println("Completed...");
                            System.out.println();
                            System.out.println("Press 'ENTER' for continue...");
                            System.in.read();
                            break;

                        default:

                            System.out.println("Incorrect input...");
                            System.out.println();
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

                    System.out.println("Incorrect input...");
                    System.out.println();
                    System.out.println("Press 'ENTER' for continue...");
                    System.in.read();
                    break;
            }
        }
    }
}
