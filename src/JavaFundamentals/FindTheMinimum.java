package JavaFundamentals;

import java.util.Scanner;

/**
 * ---------------------------------------------------------------------------------------------------
 * Java Fundamentals Practice #1 : Find the minimum                                                  *
 * Create the following methods:                                                                     *
 * ---------------------------------------------------------------------------------------------------
 * --> The method that takes 2 integer arguments and returns the lowest;                             *
 * --> The method that takes 3 integer arguments and returns the lowest ( using the first method);   *
 * --> The method that takes 4 integer arguments and returns the lowest ( using previous method);    *
 * --------------------------------------------------------------------------------------------------
 */

public class FindTheMinimum {
    private int first;
    private int second;
    private int third;
    private int fourth;
    private boolean condition;
    private String userInput;

    // TODO: refactor!!!

    int minimumReturner(int first, int second) {
        this.first = first;
        this.second = second;
        return (this.first < this.second) ? this.first : this.second;
    }

    int minimumReturner(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;

        return ((this.minimumReturner(this.first, this.second)) < this.third) ?
                (this.minimumReturner(this.first, this.second)) : this.third;
    }

    int minimumReturner(int first, int second, int third, int fourth) {
        this.first = first;
        this.second = second;
        this.third = third;

        return ((this.minimumReturner(this.first, this.second, this.third)) < fourth ?
                (this.minimumReturner(this.first, this.second, this.third)) : fourth);
    }

    public static void main(String[] args) throws Exception {

        FindTheMinimum finder = new FindTheMinimum();
        Scanner scanner = new Scanner(System.in);
        finder.setCondition(true);


        while (finder.isCondition()) {
            System.out.print("\f");
            finder.showMenu();
            finder.setUserInput(scanner);

            try {
                switch (finder.getUserInput()) {
                    case ("1"):
                        System.out.println("Please enter the two values for find minor.");

                        finder.setUserInput(scanner);
                        finder.setFirst(finder.getUserInput());
                        finder.setUserInput(scanner);
                        finder.setSecond(finder.getUserInput());

                        System.out.println("\n" + "The minimum value is : " + finder.minimumReturner
                                (finder.getFirst(), finder.getSecond()));

                        System.out.println("please press 'ENTER' to continue.");
                        System.in.read();
                        break;
                    case ("2"):
                        System.out.println("Please enter the three values for find minor.");

                        finder.setUserInput(scanner);
                        finder.setFirst(finder.getUserInput());
                        finder.setUserInput(scanner);
                        finder.setSecond(finder.getUserInput());
                        finder.setUserInput(scanner);
                        finder.setThird(finder.getUserInput());

                        System.out.println("\n" + "The minimum value is : " + finder.minimumReturner
                                (finder.getFirst(), finder.getSecond(), finder.getThird()));

                        System.out.println("please press 'ENTER' to continue.");
                        System.in.read();
                        break;
                    case ("3"):
                        System.out.println("Please enter the four values for find minor.");

                        finder.setUserInput(scanner);
                        finder.setFirst(finder.getUserInput());
                        finder.setUserInput(scanner);
                        finder.setSecond(finder.getUserInput());
                        finder.setUserInput(scanner);
                        finder.setThird(finder.getUserInput());
                        finder.setUserInput(scanner);
                        finder.setFourth(finder.getUserInput());

                        System.out.println("\n" + "The minimum value is : " + finder.minimumReturner
                                (finder.getFirst(), finder.getSecond(), finder.getThird(), finder.getFourth()));

                        System.out.println("please press 'ENTER' to continue.");
                        System.in.read();
                        break;
                    case ("4"):
                        System.out.println("Exiting...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Incorrect input...");
                        System.out.println("please press 'ENTER' to continue.");
                        System.in.read();
                }
            } catch (Exception e) {
                System.out.println("Incorrect value...Exiting");
                finder.setCondition(false);
                System.gc();
            }
        }
    }

    private int getFirst() {
        return first;
    }

    private void setFirst(String first) {
        this.first = Integer.parseInt(first);
    }

    private int getSecond() {
        return second;
    }

    private void setSecond(String second) {
        this.second = Integer.parseInt(second);
    }

    private int getThird() {
        return third;
    }

    private void setThird(String third) {
        this.third = Integer.parseInt(third);
    }

    private int getFourth() {
        return this.fourth;
    }

    private void setFourth(String fourth) {
        this.fourth = Integer.parseInt(fourth);
    }

    private String getUserInput() {
        return this.userInput;
    }

    private void setUserInput(Scanner scanner) {
        this.userInput = scanner.nextLine();
    }

    private void setCondition(boolean condition) {
        this.condition = condition;
    }

    private boolean isCondition() {
        return condition;
    }

    private void showMenu() {
        System.out.println("*******************************************");
        System.out.println("* 1 - To find the lower of two values.    *");
        System.out.println("* 2 - To find the lower of three values.  *");
        System.out.println("* 3 - To find the lower of four values.   *");
        System.out.println("* 4 - Exit.                               *");
        System.out.println("*******************************************" + "\n");
    }
}
