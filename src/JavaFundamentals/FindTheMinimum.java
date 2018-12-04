package JavaFundamentals;

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

public class FindTheMinimum {
    private int first;
    private int second;
    private int third;
    private int fourth;
    private int userInput;
    private boolean condition;

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
                    case 1:
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
                    case 2:
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
                    case 3:
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

                    case 4:

                        break;

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
                System.out.println("Incorrect value...Exiting");
                finder.setCondition(false);
                System.gc();
            }
        }
    }

    protected int getFirst() {
        return first;
    }

    protected void setFirst(int first) {
        this.first = first;
    }

    protected int getSecond() {
        return second;
    }

    protected void setSecond(int second) {
        this.second = second;
    }

    protected int getThird() {
        return third;
    }

    protected void setThird(int third) {
        this.third = third;
    }

    protected int getFourth() {
        return this.fourth;
    }

    protected void setFourth(int fourth) {
        this.fourth = fourth;
    }

    protected int getUserInput() {
        return this.userInput;
    }

    protected void setUserInput(Scanner scanner) {
        this.userInput = scanner.nextInt();
    }

    protected void setCondition(boolean condition) {
        this.condition = condition;
    }

    protected boolean isCondition() {
        return condition;
    }

    protected void showMenu() {
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
