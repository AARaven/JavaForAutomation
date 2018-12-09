package JavaFundamentals;

import java.io.IOException;
import java.util.Scanner;

/**
 * ---------------------------------------------------------------------------------------
 * <p>Java Fundamentals Practice #1 : Find the minimum</p>
 * <p>Create the following methods:</p>
 * <p>
 * ---------------------------------------------------------------------------------------
 * <p>--> The method that takes 2 integer arguments and returns the lowest; </p>
 * <p>--> The method that takes 3 integer arguments and returns the lowest ( using the first method);</p>
 * <p>--> The method that takes 4 integer arguments and returns the lowest ( using previous method);</p>
 * <p>
 * ---------------------------------------------------------------------------------------
 */

class FindTheMinimum {

    private int first;
    private int second;
    private int third;
    private int fourth;
    private int userInput;
    private boolean condition;

    boolean start() {
        Scanner scanner = new Scanner(System.in);
        setCondition(true);

        while (isCondition()) {
            System.out.print("\f");
            showMenu();
            setUserInput(scanner);

            try {
                switch (getUserInput()) {
                    case 1:
                        System.out.println("Please enter the two values for find minor.");

                        setUserInput(scanner);
                        setFirst(getUserInput());
                        setUserInput(scanner);
                        setSecond(getUserInput());

                        System.out.println("\n" + "The minimum value is : " + minimumReturner
                                (getFirst(), getSecond()));

                        System.out.println("please press 'ENTER' to continue.");
                        System.in.read();
                        break;
                    case 2:
                        System.out.println("Please enter the three values for find minor.");

                        setUserInput(scanner);
                        setFirst(getUserInput());
                        setUserInput(scanner);
                        setSecond(getUserInput());
                        setUserInput(scanner);
                        setThird(getUserInput());

                        System.out.println("\n" + "The minimum value is : " + minimumReturner
                                (getFirst(), getSecond(), getThird()));

                        System.out.println("please press 'ENTER' to continue.");
                        System.in.read();
                        break;
                    case 3:
                        System.out.println("Please enter the four values for find minor.");

                        setUserInput(scanner);
                        setFirst(getUserInput());
                        setUserInput(scanner);
                        setSecond(getUserInput());
                        setUserInput(scanner);
                        setThird(getUserInput());
                        setUserInput(scanner);
                        setFourth(getUserInput());

                        System.out.println("\n" + "The minimum value is : " + minimumReturner
                                (getFirst(), getSecond(), getThird(), getFourth()));

                        System.out.println("please press 'ENTER' to continue.");
                        System.in.read();
                        break;

                    case 4:

                        return false;

                    case 5:
                        System.out.println("Exiting...");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Incorrect input...");
                        System.out.println("please press 'ENTER' to continue.");
                        System.in.read();
                }
            } catch (Exception e) {
                System.out.println("Incorrect input...");
                System.out.println("please press 'ENTER' to continue.");
                try {
                    System.in.read();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                setCondition(false);
                System.gc();
            }
        }
        return true;
    }

    private int minimumReturner(int first, int second) {
        this.first = first;
        this.second = second;
        return (this.first < this.second) ? this.first : this.second;
    }

    private int minimumReturner(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;

        return ((this.minimumReturner(this.first, this.second)) < this.third) ?
                (this.minimumReturner(this.first, this.second)) : this.third;
    }

    private int minimumReturner(int first, int second, int third, int fourth) {
        this.first = first;
        this.second = second;
        this.third = third;

        return ((this.minimumReturner(this.first, this.second, this.third)) < fourth ?
                (this.minimumReturner(this.first, this.second, this.third)) : fourth);
    }

    private int getFirst() {
        return first;
    }

    private void setFirst(int first) {
        this.first = first;
    }

    private int getSecond() {
        return second;
    }

    private void setSecond(int second) {
        this.second = second;
    }

    private int getThird() {
        return third;
    }

    private void setThird(int third) {
        this.third = third;
    }

    private int getFourth() {
        return this.fourth;
    }

    private void setFourth(int fourth) {
        this.fourth = fourth;
    }

    private int getUserInput() {
        return this.userInput;
    }

    private void setUserInput(Scanner scanner) {
        this.userInput = scanner.nextInt();
    }

    private void setCondition(boolean condition) {
        this.condition = condition;
    }

    private boolean isCondition() {
        return condition;
    }

    private void showMenu() {
        System.out.println("\f");
        System.out.println("*******************************************");
        System.out.println("* 1 - To find the lower of two values.    *");
        System.out.println("* 2 - To find the lower of three values.  *");
        System.out.println("* 3 - To find the lower of four values.   *");
        System.out.println("* 4 - To main menu.                       *");
        System.out.println("* 5 - Exit.                               *");
        System.out.println("*******************************************" + "\n");
    }
}
