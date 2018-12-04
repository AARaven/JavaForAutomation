package ObjectBasics.Clock;

import java.util.Scanner;

public class ClockDemo {

    private static void pleasePressEnter() throws Exception {
        System.out.print("\n" + "\n" + "Please press 'ENTER' to continue ... " + "\n");
        System.in.read();

    }

    public static void incorrectInputExeption() throws Exception {
        System.out.print("\n" + "Incorrect input ... " + "\n");
        pleasePressEnter();
    }

    public static void exitClock() {
        System.out.print("\n" + "Exiting ..." + "\n");
        System.exit(0);
    }

    private static void getClockTimer(String[] strings, Clock clock) {
        for (String string : strings) {
            Clock.getTime(clock);
            System.out.print("\n");
            clock.tick();
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter value as seconds for the firstClock : ");
        Clock firstClock = new Clock(userInput.nextInt());

        pleasePressEnter();

        String[] clockArr = new String[10];

        getClockTimer(clockArr, firstClock);

        pleasePressEnter();

        Clock.getTime(firstClock);

        System.out.print("\n" + "Enter the parameters for secondClock : " + "\n");
        Clock secondClock = new Clock(userInput.nextInt(), userInput.nextInt(), userInput.nextInt());

        Clock.getTime(secondClock);

        System.out.print("\n" + "Adding a time from secondClock to firstClock : ");
        firstClock.addClock(secondClock);

        System.out.print("\n");

        Clock.getTime(firstClock);


        System.out.print("\n\n" + "Difference a time between secondClock and firstClock : " + "\n");

        Clock.getTime(firstClock.subtractClock(secondClock));

        exitClock();
    }
}
