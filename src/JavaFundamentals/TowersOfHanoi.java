package JavaFundamentals;

import java.util.Scanner;

/*---------------------------------------------------  
 Java Fundamentals Practice #5 (Optional) : Towers of Hanoi 
 There are 3 sticks "A", "B", "C". On the "A" stick there are "n" (this number should be taken
 from the console) disks, represented by integers from 1 to N ( where 1 is smallest and n is the
 biggest). You should move the tower from "A" to "C" following the rule that each implement
 a program that will take the number of disks and print the steps required to move the tower
 to the "C" stick (example: " 1 moved from "A" to "C").
--------------------------------------------------------------------------------------------------*/

public class TowersOfHanoi {

    static int numberDisks = 0;
    static int resultOfCalculation = 0;

    public void setNumberDisksHanoisTowers(int numberDisksInput) {

        numberDisks = numberDisksInput;

    }

    public void calculationMoves(TowersOfHanoi hanoisTowers) {

        calculationMoves(numberDisks, "A", "C","B");

    }

    public void calculationMoves(int numberDisks, String from, String to, String temp ) {

        if (numberDisks != 0) {

            calculationMoves(numberDisks - 1, from, temp, to);
            System.out.println(numberDisks + " moved from " + from + " to " + to);
            calculationMoves(numberDisks - 1, temp, to, from);

        }
    }



    public static void main(String[] args) throws Exception  {

        TowersOfHanoi towers = new TowersOfHanoi();

        while (true) {

            System.out.println("\f");

            System.out.println("*********************************************************");
            System.out.println("* 1 - To set a number of disks.                         *");
            System.out.println("* 2 - To show the result of the calculation.            *");
            System.out.println("* 3 - To demonstrate the calculations from A to C.      *");
            System.out.println("* 4 - Exit.                                             *");
            System.out.println("*********************************************************");
            System.out.println();

            Scanner userInput = new Scanner(System.in);

            String checkUserInput = userInput.nextLine();

            switch (checkUserInput) {

                case ("1"):

                    System.out.println();
                    System.out.println("Enter the number of disks : ");
                    System.out.println();
                    towers.setNumberDisksHanoisTowers(userInput.nextInt());
                    System.out.println();
                    break;

                case ("2"):

                    resultOfCalculation = (int) ((Math.pow(2,numberDisks) - 1));
                    System.out.print("Steps : ");
                    System.out.println(resultOfCalculation);
                    System.out.println();
                    System.out.println("Press 'ENTER' for continue...");
                    System.in.read();
                    break;

                case ("3"):

                    System.out.println();
                    towers.calculationMoves(towers);
                    System.out.println();
                    System.out.println("Press 'ENTER' for continue...");
                    System.in.read();
                    break;

                case ("4"):

                    System.out.println();
                    System.out.println("Exiting...");
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
