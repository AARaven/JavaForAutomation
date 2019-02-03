package ObjectBasics.Clock;

import java.util.Scanner;

public class DemoClock {
    
    public static void main( String[] args ) {
        Scanner scan = new Scanner( System.in );

        System.out.print("Enter the value of seconds to setUp your clock: ");

        Clock firstClock = new Clock( scan.nextInt() );

        System.out.printf("\nThe first clock show a time : %s \n",firstClock);
        System.out.println("\nFirst clock start ticking ... \n");

        firstClock.tick( 10 );

        System.out.println("\nEnd ticking ... \n");
        System.out.println("\nEnter the values of hours, minutes and seconds, to set up your second clock: ");

        Clock secondClock = new Clock( scan.nextInt(),scan.nextInt(),scan.nextInt() );

        System.out.println("\nSecond clock start ticking ... \n");

        secondClock.tick( 10 );

        System.out.println("\nEnd ticking ... \n");

        firstClock.addClock( secondClock );

        System.out.printf("\nFirst clock time after adding the second clock : %s\n",firstClock);
        System.out.printf( "\nSecond clock time is : %s\n", secondClock );

        Clock difference = firstClock.subtractClock( secondClock );

        System.out.printf("\nDifference is : %s",difference);
        System.out.println( "\nDifference tick down : \n" );
        difference.tickDown( 10 );
    }
}
