package JavaFundamentals;

import java.io.IOException;
import java.util.Scanner;

public class DemoAllInOne {

    private String  userInput;

    public static void main(String[] args) {

        FindTheMinimum first = new FindTheMinimum();
        SearchElement second = new SearchElement();
        SortArray third = new SortArray();
        CountElementsString fourth = new CountElementsString();
        TowersOfHanoi towers = new TowersOfHanoi();
        DemoAllInOne main = new DemoAllInOne();

        Scanner scanner = new Scanner(System.in);

        MainMenu:

        while (true) {

            main.showMainMenu();
            main.setUserInput(scanner);

            switch (main.getUserInput()) {

                case ("1"):

                    while (first.start())
                        first.start();
                    continue MainMenu;

                case ("2"):

                    while (second.start())
                        second.start();
                    continue MainMenu;

                case ("3"):

                    while (third.start())
                        third.start();
                    continue MainMenu;

                case ("4"):

                    while (fourth.start())
                        fourth.start();
                    continue MainMenu;

                case ("5"):

                    while (towers.start())
                        towers.start();
                    continue MainMenu;

                case ("6"):

                    System.out.println();
                    System.out.println("Exiting...");
                    System.exit(0);

                default:

                    System.out.println("\n"+"Incorrect input...");
                    System.out.println("\n"+"Press 'ENTER' for continue...");
                    try {
                        System.in.read();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }
    }

    private void setUserInput(Scanner scanner) {
        this.userInput = scanner.nextLine();
    }

    private String  getUserInput() {
        return this.userInput;
    }

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
}
