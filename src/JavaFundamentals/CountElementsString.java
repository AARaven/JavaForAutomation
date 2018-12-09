package JavaFundamentals;

import java.io.IOException;
import java.util.Scanner;

/**
 * ---------------------------------------------------------------------------------
 * <p>Java Fundamentals Practice #4 : Count elements occurrences in a String </p>
 * ---------------------------------------------------------------------------------
 * <p>Implement a program that request an input of 1 symbol form the consoles</p>
 * <p> and counts a number
 * occurrences of this symbol in a pre-created text</p>
 * <p>and prints it to the console.</p>
 * <p>The text may be hard-coded as a String in your code.</p>
 * ----------------------------------------------------------------------------------
 */

class CountElementsString {

    private char[] myCharArray;
    private char myChar;
    private String userInput;
    private String userString;

    boolean start() {
        Scanner scanner = new Scanner(System.in);
        CountElementsString countElements = new CountElementsString();

        while (true) {

            countElements.showMenu();
            countElements.setUserInput(scanner.nextLine());

            switch (countElements.getUserInput()) {

                case ("1"):

                    System.out.println("Enter the String");
                    System.out.println();
                    countElements.setUserString(scanner.nextLine());
                    countElements.setMyCharArray(countElements.getUserString().toCharArray());
                    break;

                case ("2"):

                    countElements.getChars(countElements.getMyCharArray());
                    System.out.println("\n" + "Press 'ENTER' for continue...");
                    try {
                        System.in.read();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case ("3"):

                    System.out.println("\n" + "What's char you'll be find?" + "\n");
                    countElements.setMyChar(scanner.nextLine().charAt(0));

                    int countMatch = 0;
                    for (char c : countElements.getMyCharArray())
                        if (c == countElements.getMyChar()) countMatch++;

                    System.out.println("\n" + "We identify " + countMatch + " matches" + "\n");
                    System.out.println("Press 'ENTER' for continue..." + "\n");
                    try {
                        System.in.read();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case ("4"):

                    return false;

                case ("5"):

                    System.out.println("\n" + "Exiting...");
                    System.exit(0);

                default:

                    System.out.println("\n" + "Incorrect input..." + "\n");
                    System.out.println("Press 'ENTER' for continue..." + "\n");
                    try {
                        System.in.read();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }
    }

    private String getUserInput() {
        return userInput;
    }

    private void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    private String getUserString() {
        return userString;
    }

    private void setUserString(String userString) {
        this.userString = userString;
    }

    private char[] getMyCharArray() {
        return myCharArray;
    }

    private void setMyCharArray(char[] myCharArray) {
        this.myCharArray = myCharArray;
    }

    private void getChars(char[] chars) {
        for (char c : chars) {
            System.out.print(" " + "{" + c + "}");
        }
    }

    private char getMyChar() {
        return myChar;
    }

    private void setMyChar(char myChar) {
        this.myChar = myChar;
    }

    private void showMenu() {
        System.out.println("\f");
        System.out.println("*******************************************");
        System.out.println("* 1 - To create a String.                 *");
        System.out.println("* 2 - To show the String as array.        *");
        System.out.println("* 3 - To find the matches.                *");
        System.out.println("* 4 - To main menu.                       *");
        System.out.println("* 5 - Exit.                               *");
        System.out.println("*******************************************" + "\n");
    }
}
