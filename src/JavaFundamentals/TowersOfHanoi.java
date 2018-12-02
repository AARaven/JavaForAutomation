package JavaFundamentals;

import java.util.Scanner;

/**
 * <p>----------------------------------------------------------------</p>
 * <p>Java Fundamentals Practice #5 (Optional) : Towers of Hanoi</p>
 * <p>----------------------------------------------------------------</p>
 * <p>There are 3 sticks "A", "B", "C". On the "A"<p> stick there are "n"(this number should be taken
 * from the console)</p><p> disks, represented by integers from 1 to N ( where 1 is smallest and n is the
 * biggest).</p><p> You should move the tower from "A" to "C" following the rule that each implement</p>
 * <p>a program that will take the number of disks and print the steps</p><p> required to move the tower
 * to the "C" stick</p> <p>(example: " 1 moved from "A" to "C").</p>
 * <p>----------------------------------------------------------------</p>
 */

public class TowersOfHanoi {

    private int numberDisks;

    public static void main(String[] args) throws Exception {

        TowersOfHanoi towers = new TowersOfHanoi();

        while (true) {

            Scanner scanner = new Scanner(System.in);

            towers.showMenu();

            switch (scanner.nextLine()) {

                case ("1"):

                    System.out.print("\n" + "Enter the number of disks : " + "\n");
                    towers.setNumberDisks(scanner.nextInt());
                    System.out.println();
                    break;

                case ("2"):

                    System.out.print("Steps : ");
                    towers.resultOfCalculation();
                    System.out.println("Press 'ENTER' for continue...");
                    System.in.read();
                    break;

                case ("3"):

                    System.out.println();
                    towers.calculationMoves(towers);
                    System.out.println("\n" + "Press 'ENTER' for continue...");
                    System.in.read();
                    break;

                case ("4"):

                    System.out.println("\n" + "Exiting...");
                    System.exit(0);
                    break;

                default:

                    System.out.println("Incorrect input..." + "\n");
                    System.out.println("Press 'ENTER' for continue...");
                    System.in.read();
                    break;
            }
        }
    }

    int getNumberDisks() {
        return numberDisks;
    }

    void setNumberDisks(int numberDisksInput) {
        this.numberDisks = numberDisksInput;
    }

    void calculationMoves(TowersOfHanoi hanoisTowers) {
        calculationMoves(this.numberDisks, "A", "C", "B");
    }

    void calculationMoves(int numberDisks, String from, String to, String temp) {
        if (numberDisks != 0) {
            calculationMoves(numberDisks - 1, from, temp, to);
            System.out.println(numberDisks + " moved from " + from + " to " + to);
            calculationMoves(numberDisks - 1, temp, to, from);
        }
    }

    void resultOfCalculation() {
        System.out.println(((int) ((Math.pow(2, this.getNumberDisks()) - 1))) + "\n");
    }

    void showMenu() {
        System.out.println("\f");
        System.out.println("*********************************************************");
        System.out.println("* 1 - To set a number of disks.                         *");
        System.out.println("* 2 - To show the result of the calculation.            *");
        System.out.println("* 3 - To demonstrate the calculations from A to C.      *");
        System.out.println("* 4 - Exit.                                             *");
        System.out.println("*********************************************************" + "\n");
    }
}
