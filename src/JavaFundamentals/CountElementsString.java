package JavaFundamentals;

import java.util.Scanner;

/**
 * ---------------------------------------------------------------------------------
 * <p>Java Fundamentals Practice #4 : Count elements occurrences in a String </p>
 * ---------------------------------------------------------------------------------
 * <p>Implement a program that request an input of 1 symbol form the consoles</p> <p> and counts a number
 * occurrences of this symbol in a pre-created text</p> <p>and prints it to the console.</p>
 * <p>The text may be hard-coded as a String in your code.</p>
 * ----------------------------------------------------------------------------------
 */

public class CountElementsString {

    static char myCharArray[];
    static CharSequence myChar;
    static String myString;

    public static void main(String[] args) throws Exception {

        Scanner userInput = new Scanner(System.in);


        while (true) {

            System.out.println("\f");

            System.out.println("*******************************************");
            System.out.println("* 1 - To create a String.                 *");
            System.out.println("* 2 - To show the String as array.        *");
            System.out.println("* 3 - To find the matches.                *");
            System.out.println("* 4 - Exit.                               *");
            System.out.println("*******************************************");
            System.out.println();

            String checkUserInput = userInput.nextLine();

            switch (checkUserInput) {

                case ("1"):

                    System.out.println("Enter the String");
                    System.out.println();
                    myString = userInput.nextLine();
                    myChar = myString;

                    break;

                case ("2"):

                    char holeChar = ' ';

                    for (int i = 0; i < myString.length(); i++) {
                        if (myChar.charAt(i) == holeChar) {
                            System.out.print(holeChar);
                        }
                        System.out.print(" " + "{" + myChar.charAt(i) + "}");
                    }

                    myCharArray = ((String) myChar).toCharArray();

                    System.out.println();
                    System.out.println("Press 'ENTER' for continue...");
                    System.in.read();

                    System.out.println();
                    System.out.println();
                    break;

                case ("3"):

                    int countMatch = 0;

                    System.out.println();
                    System.out.println("What's char you'll be find?");

                    char myCharInputForFind = userInput.nextLine().charAt(0);

                    for (int i = 0; i < myCharArray.length; i++) {
                        if (myCharArray[i] == myCharInputForFind) {
                            countMatch++;
                        }
                    }

                    System.out.println("We identify " + countMatch + " matches");
                    System.out.println();
                    System.out.println("Press 'ENTER' for continue...");
                    System.in.read();
                    break;

                case ("4"):

                    System.out.println("Exiting...");
                    System.exit(0);

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
